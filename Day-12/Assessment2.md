# Java Practical Test 2 — Assessment and Solutions

**Topics:** Loops, Arrays, OOP, ArrayList, HashSet, HashMap, Multithreading, File Handling  
**Duration:** 3 Hours  
**Total Marks:** 100

## Overview

This assessment contains 10 Java programming questions, covering fundamental programming concepts through file handling and multithreading. The solutions use beginner-friendly logic and Java built-in methods wherever appropriate.

---

# Q1. Number Theory — Armstrong Numbers

**Difficulty:** Easy | **Marks:** 5

### Question

Write a Java program to print all Armstrong numbers between 1 and 1000 using loops. Do not use a built-in Armstrong number checking function.

### Solution — `Question1.java`

```java
public class Question1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int temp = i;
            int digits = String.valueOf(i).length();
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
```

### Expected output

```text
1
2
3
4
5
6
7
8
9
153
370
371
407
```

### Explanation

- `String.valueOf(i).length()` counts the digits.
- `% 10` extracts the last digit.
- `Math.pow()` calculates the digit's power.
- `/= 10` removes the last digit.
- The number is an Armstrong number if the sum equals the original number.

---

# Q2. Array Operations — Second-Largest Distinct Element

**Difficulty:** Easy | **Marks:** 5

### Question

Find the second-largest distinct element without using `Arrays.sort()`. Handle duplicate values and cases where no second-largest element exists.

**Input:** `[12, 45, 7, 45, 32, 18]`

### Solution — `Question2.java`

```java
public class Question2 {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 45, 32, 18};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest element not found");
        } else {
            System.out.println("Second largest: " + secondLargest);
        }
    }
}
```

### Expected output

```text
Second largest: 32
```

### Explanation

The enhanced `for` loop visits every element. The program keeps track of the largest and second-largest distinct values without sorting the array.

---

# Q3. OOP — Inheritance and Polymorphism

**Difficulty:** Medium | **Marks:** 10

### Question

Create an `Employee` parent class with employee ID, name, and basic salary. Create `FullTimeEmployee` and `PartTimeEmployee` subclasses.

Requirements:

- Full-time employees receive a 20% bonus.
- Part-time employees are paid according to hours worked and hourly rate.
- Override `calculateSalary()`.
- Demonstrate runtime polymorphism.

### Solution — `Question3.java`

```java
class Employee {
    int id;
    String name;
    double basicSalary;

    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + basicSalary * 0.20;
    }
}

class PartTimeEmployee extends Employee {
    int hours;
    double hourlyRate;

    PartTimeEmployee(int id, String name, int hours, double hourlyRate) {
        super(id, name, 0);
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hours * hourlyRate;
    }
}

public class Question3 {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(1, "Arun", 30000);
        Employee e2 = new PartTimeEmployee(2, "Ravi", 80, 200);

        System.out.println("Full Time Employee");
        e1.display();

        System.out.println("\nPart Time Employee");
        e2.display();
    }
}
```

### Expected output

```text
Full Time Employee
ID: 1
Name: Arun
Salary: 36000.0

Part Time Employee
ID: 2
Name: Ravi
Salary: 16000.0
```

### Explanation

- `extends` provides inheritance.
- `super()` calls the parent constructor.
- `@Override` indicates method overriding.
- An `Employee` reference can refer to either subclass, demonstrating runtime polymorphism.

---

# Q4. ArrayList — Student Management System

**Difficulty:** Medium | **Marks:** 10

### Question

Create a student management program using `ArrayList`. Each student has a roll number, name, and mark.

Requirements:

1. Add at least five students.
2. Display students scoring above 75.
3. Search and update a student by roll number.
4. Remove a student by roll number.
5. Display students sorted by marks.
6. Do not use a database.

### Solution — `Question4.java`

```java
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int mark;

    Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + mark);
    }
}

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter mark: ");
            int mark = sc.nextInt();

            students.add(new Student(roll, name, mark));
        }

        System.out.println("\nStudents scoring above 75:");
        for (Student s : students) {
            if (s.mark > 75) {
                s.display();
            }
        }

        System.out.print("\nEnter roll number to search: ");
        int searchRoll = sc.nextInt();

        Student found = null;

        for (Student s : students) {
            if (s.rollNo == searchRoll) {
                found = s;
                break;
            }
        }

        if (found != null) {
            found.display();

            System.out.print("Enter new mark: ");
            found.mark = sc.nextInt();

            System.out.println("Updated successfully.");
        } else {
            System.out.println("Student not found.");
        }

        System.out.print("Enter roll number to remove: ");
        int removeRoll = sc.nextInt();

        students.removeIf(s -> s.rollNo == removeRoll);

        students.sort(Comparator.comparingInt(s -> s.mark));

        System.out.println("\nStudents sorted by marks:");
        for (Student s : students) {
            s.display();
        }

        sc.close();
    }
}
```

### Explanation

- `ArrayList` stores student objects.
- A loop searches for a student by roll number.
- `removeIf()` removes the matching student.
- `sort()` arranges students by marks in ascending order.

---

# Q5. HashSet — Remove Duplicates

**Difficulty:** Medium | **Marks:** 10

### Question

Given an array, use `HashSet` to remove duplicates, count unique values, check whether 40 is present, and explain why element order is not guaranteed.

**Input:** `[10, 20, 10, 30, 20, 40, 50, 30]`

### Solution — `Question5.java`

```java
import java.util.HashSet;

public class Question5 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40, 50, 30};

        HashSet<Integer> numbers = new HashSet<>();

        for (int num : arr) {
            numbers.add(num);
        }

        System.out.println("Unique values: " + numbers);
        System.out.println("Number of unique values: " + numbers.size());

        if (numbers.contains(40)) {
            System.out.println("40 is present");
        } else {
            System.out.println("40 is not present");
        }
    }
}
```

### Example output

```text
Unique values: [50, 20, 40, 10, 30]
Number of unique values: 5
40 is present
```

The order of unique values may vary.

### Explanation

- `add()` inserts a value without creating duplicates.
- `size()` returns the number of unique values.
- `contains()` checks whether an element exists.
- `HashSet` does not guarantee insertion order.

---

# Q6. HashMap — Word Frequency

**Difficulty:** Medium | **Marks:** 10

### Question

Count the frequency of each word in a sentence. Ignore letter case, identify a most frequent word, and handle an empty sentence.

**Input:** `java is easy and java is powerful`

### Solution — `Question6.java`

```java
import java.util.HashMap;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> words = new HashMap<>();

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().toLowerCase().trim();

        if (sentence.isEmpty()) {
            System.out.println("Sentence is empty.");
            sc.close();
            return;
        }

        String[] arr = sentence.split("\\s+");

        for (String word : arr) {
            words.put(word, words.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word frequencies: " + words);

        String mostFrequent = "";
        int highestCount = 0;

        for (String word : words.keySet()) {
            if (words.get(word) > highestCount) {
                highestCount = words.get(word);
                mostFrequent = word;
            }
        }

        System.out.println("Most frequent word: " + mostFrequent);
        System.out.println("Frequency: " + highestCount);

        sc.close();
    }
}
```

### Expected frequencies

```text
java = 2
is = 2
easy = 1
and = 1
powerful = 1
```

The map's display order may differ. Both `java` and `is` occur twice, so either can be selected as the most frequent word.

### Explanation

- `toLowerCase()` ignores differences in letter case.
- `split("\\s+")` separates words by whitespace.
- `getOrDefault(word, 0)` returns the current count or zero.
- `keySet()` lets the program check each word.

---

# Q7. Multithreading — Ticket Booking

**Difficulty:** Hard | **Marks:** 10

### Question

Create a ticket counter with 10 tickets. Three customer threads each attempt to book four tickets. Use synchronization to prevent race conditions and ensure that tickets never become negative.

### Solution — `Question7.java`

```java
class TicketCounter {
    int tickets = 10;

    synchronized void bookTickets(String customer) {
        if (tickets >= 4) {
            tickets -= 4;
            System.out.println(customer + " booked 4 tickets.");
            System.out.println("Tickets remaining: " + tickets);
        } else {
            System.out.println(customer + " could not book tickets.");
            System.out.println("Tickets available: " + tickets);
        }
    }
}

class Customer extends Thread {
    TicketCounter counter;

    Customer(TicketCounter counter, String name) {
        this.counter = counter;
        setName(name);
    }

    public void run() {
        counter.bookTickets(getName());
    }
}

public class Question7 {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();

        Customer c1 = new Customer(counter, "Customer 1");
        Customer c2 = new Customer(counter, "Customer 2");
        Customer c3 = new Customer(counter, "Customer 3");

        c1.start();
        c2.start();
        c3.start();
    }
}
```

### Sample output

```text
Customer 1 booked 4 tickets.
Tickets remaining: 6
Customer 2 booked 4 tickets.
Tickets remaining: 2
Customer 3 could not book tickets.
Tickets available: 2
```

The customer order can vary.

### Explanation

- `start()` starts a thread.
- `run()` contains the thread's task.
- `synchronized` prevents multiple threads from booking against the same ticket count simultaneously.
- The `if` condition prevents the ticket count from becoming negative.

---

# Q8. Multithreading — Producer and Consumer

**Difficulty:** Hard | **Marks:** 10

### Question

Create a producer that generates numbers from 1 to 5 and a consumer that prints them. Use `wait()` and `notifyAll()` to coordinate the threads. The consumer must not consume a value before it is produced, and both threads must terminate correctly.

### Solution — `Question8.java`

```java
class SharedData {
    int number;
    boolean available = false;
    boolean finished = false;

    synchronized void produce(int value) throws InterruptedException {
        while (available) {
            wait();
        }

        number = value;
        available = true;

        System.out.println("Produced: " + number);
        notifyAll();
    }

    synchronized void consume() throws InterruptedException {
        while (!available && !finished) {
            wait();
        }

        if (available) {
            System.out.println("Consumed: " + number);
            available = false;
            notifyAll();
        }
    }

    synchronized void finish() {
        finished = true;
        notifyAll();
    }
}

class Producer extends Thread {
    SharedData data;

    Producer(SharedData data) {
        this.data = data;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                data.produce(i);
            }

            data.finish();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer extends Thread {
    SharedData data;

    Consumer(SharedData data) {
        this.data = data;
    }

    public void run() {
        try {
            while (true) {
                data.consume();

                synchronized (data) {
                    if (data.finished && !data.available) {
                        break;
                    }
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class Question8 {
    public static void main(String[] args) throws InterruptedException {
        SharedData data = new SharedData();

        Producer producer = new Producer(data);
        Consumer consumer = new Consumer(data);

        consumer.start();
        producer.start();

        producer.join();
        consumer.join();

        System.out.println("Finished.");
    }
}
```

### Expected behavior

The program produces and consumes numbers 1 through 5 in order, then prints `Finished.`

### Explanation

- `wait()` pauses a thread until the shared state changes.
- `notifyAll()` wakes threads waiting on the same object.
- `available` indicates whether a value is ready.
- `finished` signals that the producer has completed.
- `join()` waits for both threads to finish.

---

# Q9. File Handling — Student Records

**Difficulty:** Hard | **Marks:** 10

### Question

Accept at least five student records containing ID, name, and marks. Save them in `students.txt`, read and display the records, find the highest scorer, and append another student without deleting previous records. Handle `IOException`.

### Solution — `Question9.java`

```java
import java.io.*;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            try (BufferedWriter writer =
                    new BufferedWriter(new FileWriter("students.txt"))) {
                for (int i = 0; i < 5; i++) {
                    System.out.print("Enter student ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter student name: ");
                    String name = sc.nextLine().replace(",", " ");

                    System.out.print("Enter marks: ");
                    double marks = Double.parseDouble(sc.nextLine());

                    if (marks < 0 || marks > 100) {
                        System.out.println("Invalid marks.");
                        i--;
                        continue;
                    }

                    writer.write(id + "," + name + "," + marks);
                    writer.newLine();
                }
            }

            double highestMarks = -1;
            String topStudent = "";

            System.out.println("\nStudent records:");

            try (BufferedReader reader =
                    new BufferedReader(new FileReader("students.txt"))) {
                String line;

                while ((line = reader.readLine()) != null) {
                    System.out.println(line);

                    String[] data = line.split(",");
                    double marks = Double.parseDouble(data[2]);

                    if (marks > highestMarks) {
                        highestMarks = marks;
                        topStudent = data[1];
                    }
                }
            }

            System.out.println("Highest scorer: " + topStudent);
            System.out.println("Highest marks: " + highestMarks);

            System.out.print("\nEnter new student ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Enter new student name: ");
            String name = sc.nextLine().replace(",", " ");

            System.out.print("Enter new student marks: ");
            double marks = Double.parseDouble(sc.nextLine());

            if (marks >= 0 && marks <= 100) {
                try (BufferedWriter writer =
                        new BufferedWriter(new FileWriter("students.txt", true))) {
                    writer.write(id + "," + name + "," + marks);
                    writer.newLine();
                }

                System.out.println("New student added.");
            } else {
                System.out.println("Invalid marks. Student not added.");
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numbers.");
        }

        sc.close();
    }
}
```

### Explanation

- `BufferedWriter` writes records to the file.
- `BufferedReader` reads one line at a time.
- `new FileWriter("students.txt", true)` appends without overwriting existing records.
- The program finds the highest marks while reading the file.
- `IOException` handles file-related errors.
- `NumberFormatException` handles invalid numeric input.

**Note:** This simple comma-separated format assumes names do not contain commas. The first five records overwrite an existing file; the additional record is appended afterward.

---

# Q10. Mini Project — Employee Record Manager

**Difficulty:** Hard | **Marks:** 20

### Question

Create an Employee Record Manager with employee ID, name, department, and salary.

Requirements:

1. Use `ArrayList` to store employees.
2. Use `HashMap` to search employees by ID.
3. Use `HashSet` to maintain unique IDs.
4. Add, search, update salary, delete, and display employees.
5. Save records to a file.
6. Load records when the program starts.
7. Validate input and handle exceptions.
8. Provide a menu with a Save and Exit option.

### Solution — `Question10.java`

```java
import java.util.*;
import java.io.*;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("--------------------");
    }

    String toFile() {
        return id + "," + name + "," + department + "," + salary;
    }
}

public class Question10 {
    static ArrayList<Employee> employees = new ArrayList<>();
    static HashMap<Integer, Employee> employeeMap = new HashMap<>();
    static HashSet<Integer> employeeIds = new HashSet<>();

    static Scanner sc = new Scanner(System.in);
    static String fileName = "employees.txt";

    static void loadEmployees() {
        try (BufferedReader reader =
                new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length == 4) {
                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    String department = data[2];
                    double salary = Double.parseDouble(data[3]);

                    if (id > 0 && salary >= 0 && employeeIds.add(id)) {
                        Employee e = new Employee(id, name, department, salary);
                        employees.add(e);
                        employeeMap.put(id, e);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("New employee file will be created.");
        } catch (IOException e) {
            System.out.println("Error loading file.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid data found in file.");
        }
    }

    static void saveEmployees() {
        try (BufferedWriter writer =
                new BufferedWriter(new FileWriter(fileName))) {
            for (Employee e : employees) {
                writer.write(e.toFile());
                writer.newLine();
            }

            System.out.println("Records saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving records.");
        }
    }

    static void addEmployee() {
        try {
            System.out.print("Enter employee ID: ");
            int id = Integer.parseInt(sc.nextLine());

            if (id <= 0 || employeeIds.contains(id)) {
                System.out.println("Invalid or duplicate employee ID.");
                return;
            }

            System.out.print("Enter employee name: ");
            String name = sc.nextLine().replace(",", " ");

            System.out.print("Enter department: ");
            String department = sc.nextLine().replace(",", " ");

            System.out.print("Enter salary: ");
            double salary = Double.parseDouble(sc.nextLine());

            if (salary < 0) {
                System.out.println("Salary cannot be negative.");
                return;
            }

            Employee e = new Employee(id, name, department, salary);

            employees.add(e);
            employeeMap.put(id, e);
            employeeIds.add(id);

            System.out.println("Employee added successfully.");
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numbers.");
        }
    }

    static void searchEmployee() {
        try {
            System.out.print("Enter employee ID: ");
            int id = Integer.parseInt(sc.nextLine());

            Employee e = employeeMap.get(id);

            if (e != null) {
                e.display();
            } else {
                System.out.println("Employee not found.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid employee ID.");
        }
    }

    static void updateSalary() {
        try {
            System.out.print("Enter employee ID: ");
            int id = Integer.parseInt(sc.nextLine());

            Employee e = employeeMap.get(id);

            if (e == null) {
                System.out.println("Employee not found.");
                return;
            }

            System.out.print("Enter new salary: ");
            double salary = Double.parseDouble(sc.nextLine());

            if (salary < 0) {
                System.out.println("Salary cannot be negative.");
                return;
            }

            e.salary = salary;
            System.out.println("Salary updated successfully.");
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numbers.");
        }
    }

    static void deleteEmployee() {
        try {
            System.out.print("Enter employee ID: ");
            int id = Integer.parseInt(sc.nextLine());

            Employee e = employeeMap.remove(id);

            if (e != null) {
                employees.remove(e);
                employeeIds.remove(id);
                System.out.println("Employee deleted successfully.");
            } else {
                System.out.println("Employee not found.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid employee ID.");
        }
    }

    static void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employee records found.");
            return;
        }

        for (Employee e : employees) {
            e.display();
        }
    }

    public static void main(String[] args) {
        loadEmployees();

        while (true) {
            System.out.println("\nEMPLOYEE RECORD MANAGER");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Update Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. Display All Employees");
            System.out.println("6. Save and Exit");
            System.out.print("Enter your choice: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    addEmployee();
                    break;
                case "2":
                    searchEmployee();
                    break;
                case "3":
                    updateSalary();
                    break;
                case "4":
                    deleteEmployee();
                    break;
                case "5":
                    displayEmployees();
                    break;
                case "6":
                    saveEmployees();
                    sc.close();
                    System.out.println("Program closed.");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
```

### How to run

```bash
javac Question10.java
java Question10
```

### Explanation

- `ArrayList` stores employee objects.
- `HashMap` finds an employee using their ID.
- `HashSet` prevents duplicate IDs.
- `employees.txt` stores records between program runs.
- `switch` handles the menu choices.
- `saveEmployees()` writes all current records to the file.
- `loadEmployees()` loads the records when the program starts.

**Note:** This beginner-level version uses comma-separated records, so employee names and departments should not contain commas. Choose **Save and Exit** to persist changes. It is intended for one running instance at a time.

---

# Assessment Rules

- **Duration:** 3 hours.
- **Total marks:** 100.
- Attempt all ten questions.
- Use the appropriate Java concepts for each question.
- Ensure the programs compile and produce the expected behavior.
- Handle invalid inputs and exceptions where required.

## Evaluation Criteria

1. Logic and correctness.
2. Appropriate use of Java concepts.
3. Exception handling.
4. Code readability and organization.
5. Successful execution.

## Suggested Preparation Order

1. Practise Q1–Q2 to strengthen loops and arrays.
2. Complete Q3–Q6 to practise OOP and collections.
3. Practise Q7–Q9 separately to understand multithreading and file handling.
4. Complete Q10 as the final mini-project challenge.

## Key Learning Outcomes

After completing this assessment, you should be able to:

- Use loops, arrays, and basic mathematical operations.
- Apply inheritance, method overriding, and polymorphism.
- Manage records using `ArrayList`, `HashSet`, and `HashMap`.
- Create and coordinate Java threads.
- Read and write files using Java I/O.
- Build a menu-driven program with basic validation and exception handling.

**Final reminder:** Understand what each statement does rather than memorising the entire program. Compile and run each question independently before the assessment.
