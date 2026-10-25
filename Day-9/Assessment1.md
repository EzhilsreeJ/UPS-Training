# Day 9: Core Java Assessment & Programming Practice

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk&logoColor=white)
![Training](https://img.shields.io/badge/UPS-Full%20Stack%20Training-blue?style=for-the-badge)
![Day](https://img.shields.io/badge/Day-09-green?style=for-the-badge)
![Focus](https://img.shields.io/badge/Focus-Core%20Java%20%7C%20Coding%20%7C%20MCQs-purple?style=for-the-badge)

**Focus:** Core Java Fundamentals • Coding Assessment • Arrays • Strings • Control Flow • Object-Oriented Programming • Exception Handling

---

## Day 9 Overview

Day 9 focused on evaluating Core Java knowledge through programming exercises and a 30-question multiple-choice assessment.

The practical assessment covered problem-solving using arrays, strings, loops, classes, objects, inheritance, polymorphism, and custom exception handling.

The MCQ assessment tested fundamental Java syntax, conditional statements, loops, array operations, string methods, and object-oriented programming concepts.

### Topics Covered

- Conditional statements: `if`, `if-else`, and `switch`
- Loops: `for`, `while`, and `do-while`
- Loop control statements: `break` and `continue`
- One-dimensional and two-dimensional arrays
- String methods and immutability
- Classes, objects, and constructors
- The `this` keyword
- Encapsulation and inheritance
- Method overloading and runtime polymorphism
- Custom exceptions and exception handling
- Array and string problem-solving techniques

---

## 1. Coding Assessment

The practical assessment consisted of eight programming problems covering algorithmic thinking, object-oriented programming, arrays, strings, and exception handling.

> **Note:** The filenames below follow the reference Day 9 assessment structure. Keep the links only if your repository uses these filenames and folder paths.

### 1.1 Check Whether Two Strings Are Anagrams

**Program:** [Anagram.java](Assessment/Anagram.java)

**Objective:** Determine whether two strings contain the same characters, ignoring case and spaces.

**Example input:**
```text
Dormitory
Dirty room
```

**Expected output:**
```text
The strings are anagrams.
```

**Concepts covered:**
- String manipulation
- `replaceAll()` and `toLowerCase()`
- Character arrays
- Loops and character comparison

### 1.2 Custom Exception for Bank Withdrawals

**Program:** [Bank.java](Assessment/Bank.java)

**Objective:** Create a custom exception that is thrown when a withdrawal exceeds the available account balance.

**Example:**
```text
Initial balance: 5000
Withdraw: 6000
```

**Expected output:**
```text
Insufficient balance!
Available balance: 5000
```

**Concepts covered:**
- Classes and objects
- Encapsulation
- Custom exceptions
- `throw` and `throws`
- `try-catch`

### 1.3 Sort an Array Using Bubble Sort

**Program:** [Bubble.java](Assessment/Bubble.java)

**Objective:** Sort an integer array in ascending order without using `Arrays.sort()`.

**Input:**
```text
35 12 8 67 21 4
```

**Expected output:**
```text
4 8 12 21 35 67
```

**Concepts covered:**
- Arrays
- Nested loops
- Element swapping
- Sorting algorithms

### 1.4 Find Duplicate Elements in an Array

**Program:** [Dupli.java](Assessment/Dupli.java)

**Objective:** Find duplicate integer values and print each duplicate only once, without using collections or built-in sorting methods.

**Input:**
```text
4 2 7 4 8 2 9 4
```

**Expected output:**
```text
Duplicate elements: 4 2
```

**Concepts covered:**
- Array traversal
- Nested loops
- Conditional statements
- Duplicate detection

### 1.5 Rotate an Array by K Positions

**Program:** [Rotate.java](Assessment/Rotate.java)

**Objective:** Rotate an integer array to the right by a specified number of positions.

**Input:**
```text
Array: 1 2 3 4 5 6 7
K: 3
```

**Expected output:**
```text
5 6 7 1 2 3 4
```

**Concepts covered:**
- Arrays and indexing
- Nested loops
- Temporary variables
- Element shifting

### 1.6 Calculate Student Results and Find the Topper

**Program:** [StudentCode.java](Assessment/StudentCode.java)

**Objective:** Create student objects, calculate total marks and average, assign grades, and identify the class topper.

**Grade rules:**

| Average | Grade |
|---|---|
| 90 and above | A |
| 75–89.99 | B |
| 60–74.99 | C |
| 40–59.99 | D |
| Below 40 | F |

**Concepts covered:**
- Classes and objects
- Constructors
- Instance variables
- Methods
- Conditional statements
- Calculating totals and averages
- Comparing student results

### 1.7 Shape Area Calculator Using Polymorphism

**Program:** [Shapes.java](Assessment/Shapes.java)

**Objective:** Create a parent `Shape` class and override its `area()` method in `Circle`, `Rectangle`, and `Triangle`.

**Sample dimensions:**
- Circle radius: 7
- Rectangle: 5 × 4
- Triangle base: 6, height: 8

**Expected output:**
```text
Circle area: 153.94
Rectangle area: 20.0
Triangle area: 24.0
```

**Concepts covered:**
- Inheritance
- Method overriding
- Polymorphism
- Parent-class references
- Arrays of objects

### 1.8 Find the First Non-Repeating Character

**Program:** [nonRepeating.java](Assessment/nonRepeating.java)

**Objective:** Find the first character that appears exactly once in a string.

**Input:**
```text
swiss
```

**Expected output:**
```text
First non-repeating character: w
```

**Concepts covered:**
- String traversal
- `charAt()`
- Nested loops
- Character frequency counting
- Conditional statements

---

## 2. Core Java MCQ Assessment

The theoretical assessment consisted of **30 multiple-choice questions** covering five major areas of Core Java.

### 2.1 Conditional Statements and Control Flow

**Questions:** Q1–Q3

Topics:
- Decision-making with `if`
- Executing statements based on conditions
- Selecting alternatives using `switch`

### 2.2 Loops and Loop Control

**Questions:** Q4–Q8

Topics:
- `for` loops
- `while` loops
- Condition checking before loop execution
- `break` to exit a loop
- `continue` to skip to the next iteration
- Understanding loop output

### 2.3 Arrays

**Questions:** Q9–Q15

Topics:
- Declaring and initializing arrays
- Zero-based array indexing
- Array length using `.length`
- `ArrayIndexOutOfBoundsException`
- Traversing arrays using loops
- Two-dimensional arrays

### 2.4 Strings

**Questions:** Q16–Q21

Topics:
- The `String` type
- String length using `length()`
- Comparing string contents using `equals()`
- Converting strings to uppercase using `toUpperCase()`
- String immutability
- Extracting substrings using `substring()`

### 2.5 Object-Oriented Programming

**Questions:** Q22–Q30

Topics:
- Classes as blueprints for objects
- Objects as instances of classes
- Object creation using `new`
- Constructors
- The `this` keyword
- Encapsulation
- Inheritance using `extends`
- Method overloading
- Polymorphism and superclass references

---

## 3. Assessment Summary

| Assessment area | Coverage |
|---|---|
| Conditional statements | `if`, `switch` |
| Iteration | `for`, `while`, `do-while` |
| Arrays | Declaration, indexing, traversal, 2D arrays |
| Strings | Comparison, conversion, extraction, immutability |
| OOP fundamentals | Classes, objects, constructors |
| OOP principles | Encapsulation, inheritance, polymorphism |
| Exception handling | Custom exceptions and `try-catch` |
| Problem-solving | Sorting, rotation, duplicates, anagrams |
| Student result processing | Total, average, grades, topper identification |

---

## 4. Compilation and Execution Guide

The following commands assume the eight Java assessment programs are stored inside an `Assessment` directory and have no package declarations.

### Step 1: Open the terminal

From the `Day-9` directory, navigate to the assessment folder:

```powershell
cd Assessment
```

### Step 2: Compile the Java programs

```powershell
javac *.java
```

### Step 3: Run each program separately

```powershell
java Anagram
java Bank
java Bubble
java Dupli
java Rotate
java Shapes
java StudentCode
java nonRepeating
```

Run one program at a time to view its output.

---

## 5. Key Learnings

- Apply conditional statements to make decisions in Java.
- Use loops to repeat operations and solve programming problems.
- Declare, initialize, and traverse arrays.
- Manipulate and compare strings using built-in methods.
- Understand zero-based indexing and array boundaries.
- Create classes and objects using constructors.
- Apply encapsulation, inheritance, method overloading, and polymorphism.
- Handle exceptional conditions using custom exceptions.
- Solve practical coding problems involving arrays, strings, and student records.
- Strengthen theoretical knowledge through Core Java MCQs.

---

**Training:** UPS Java Full Stack Training  
**Day:** 9  
**Focus:** Core Java Fundamentals, Coding Assessment, Arrays, Strings, Control Flow, and Object-Oriented Programming
