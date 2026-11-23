# Student Marks Analyzer (Basic Java)

A beginner-friendly, menu-driven Java project. The complete program is in **one Java file**: `StudentMarksAnalyzer.java`.

## Java concepts used
- `public` variables and methods
- Classes and objects
- Constructors
- Basic inheritance (`Student extends Person`)
- Arrays
- Strings and `equalsIgnoreCase()`
- `Scanner` input
- `if-else`, `for` loop and `do-while` loop
- Methods

## Features
1. Add a student (ID, name and marks)
2. Display all students
3. Search by student ID
4. Calculate class average
5. Find highest and lowest marks
6. Display all students tied for highest marks
7. Validate marks from 0 to 100

The program can store up to 50 students in its array. Records are kept only while the program is running.

## Run the program
Install JDK 8 or later. Open a terminal in this folder and run:

```bash
javac StudentMarksAnalyzer.java
java StudentMarksAnalyzer
```

## Understand the classes
- `Person` stores the student's name.
- `Student` extends `Person`, so it gets the `name` variable from `Person`. It also stores ID and marks.
- `StudentMarksAnalyzer` contains the `main()` method, menu and program logic.

All three classes are in the same `.java` file. Only `StudentMarksAnalyzer` is public, so the filename matches it.

## Simple interview explanation
"My project is a Student Marks Analyzer made using Java. It stores student objects in an array. The user can add students, display them, search by ID and calculate class statistics. I used a parent class called Person and a child class called Student to demonstrate inheritance. I used loops and conditions to process the student records."

## Manual checks
- Add two or three students.
- Display all students.
- Search for an existing ID.
- Search for an ID that does not exist.
- Try marks below 0 and above 100.
- Calculate the average.
- Check highest and lowest marks.
- Add two students with equal highest marks and check that both appear as toppers.
- Try the report options before adding any student.

## Before uploading
Run it yourself, change the sample inputs, and make sure you can explain the loops and calculations. Add your own name and project details to this README.
