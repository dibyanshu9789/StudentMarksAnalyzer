import java.util.Scanner;

class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    public String id;
    public int marks;

    public Student(String id, String name, int marks) {
        super(name);
        this.id = id;
        this.marks = marks;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------");
    }
}

public class StudentMarksAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[50];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== STUDENT MARKS ANALYZER =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Calculate Average Marks");
            System.out.println("5. Find Highest and Lowest Marks");
            System.out.println("6. Display Topper(s)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                if (count == students.length) {
                    System.out.println("Student list is full.");
                } else {
                    System.out.print("Enter student ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    int marks;
                    do {
                      System.out.print("Enter marks (0-100): ");
                      marks = sc.nextInt();
                      if(marks>100)
                          System.out.println("Invalid !! Marks more than 100");
                    } while(marks>100);

                    if (marks < 0 || marks > 100) {
                        System.out.println("Invalid marks. Enter marks between 0 and 100.");
                    } else {
                        students[count] = new Student(id, name, marks);
                        count++;
                        System.out.println("Student added successfully!");
                    }
                }

            } else if (choice == 2) {

                if (count == 0) {
                    System.out.println("No students added yet.");
                } else {
                    for (int i = 0; i < count; i++) {
                        students[i].display();
                    }
                }

            } else if (choice == 3) {

                System.out.print("Enter student ID to search: ");
                String searchId = sc.nextLine();

                boolean found = false;

                for (int i = 0; i < count; i++) {
                    if (students[i].id.equalsIgnoreCase(searchId)) {
                        System.out.println("Student found!");
                        students[i].display();
                        found = true;
                        break;
                    }
                }

                if (found == false) {
                    System.out.println("Student not found.");
                }

            } else if (choice == 4) {

                if (count == 0) {
                    System.out.println("No student records available.");
                } else {
                    int total = 0;

                    for (int i = 0; i < count; i++) {
                        total = total + students[i].marks;
                    }

                    double average = (double) total / count;
                    System.out.println("Average marks: " + average);
                }

            } else if (choice == 5) {

                if (count == 0) {
                    System.out.println("No student records available.");
                } else {
                    int highest = students[0].marks;
                    int lowest = students[0].marks;

                    for (int i = 1; i < count; i++) {
                        if (students[i].marks > highest) {
                            highest = students[i].marks;
                        }

                        if (students[i].marks < lowest) {
                            lowest = students[i].marks;
                        }
                    }

                    System.out.println("Highest marks: " + highest);
                    System.out.println("Lowest marks: " + lowest);
                }

            } else if (choice == 6) {

                if (count == 0) {
                    System.out.println("No student records available.");
                } else {
                    int highest = students[0].marks;

                    for (int i = 1; i < count; i++) {
                        if (students[i].marks > highest) {
                            highest = students[i].marks;
                        }
                    }

                    System.out.println("Topper(s):");

                    for (int i = 0; i < count; i++) {
                        if (students[i].marks == highest) {
                            students[i].display();
                        }
                    }
                }

            } else if (choice == 0) {

                System.out.println("Thank you for using the program!");

            } else {

                System.out.println("Invalid choice. Try again.");

            }

        } while (choice != 0);

        sc.close();
    }
}
