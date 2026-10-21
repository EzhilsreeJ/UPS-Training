# Day 8: Java File I/O, Exception Handling, Multithreading & Layered Architecture

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk&logoColor=white)
![Training](https://img.shields.io/badge/UPS-Full%20Stack%20Training-blue?style=for-the-badge)
![Day](https://img.shields.io/badge/Day-08-green?style=for-the-badge)
![Focus](https://img.shields.io/badge/Focus-File%20I%2FO%20%7C%20Threads%20%7C%20Exceptions-purple?style=for-the-badge)

**Focus:** Exception Handling • File I/O • Student Management System • Multithreading • Lambda Expressions • Synchronization

---

## Day 8 Overview

Day 8 focused on Java backend programming concepts, including file persistence, exception handling, multithreading, and organizing application logic into separate classes.

The practical sessions covered:

- **Exception Handling:** Handling runtime and file-related errors using `try`, `catch`, `throw`, and `throws`.
- **File I/O and Persistence:** Creating, reading, writing, updating, appending, and deleting files using the `java.io` package.
- **Multithreading:** Running multiple tasks concurrently using `Thread` and the `Runnable` interface.
- **Thread Coordination:** Using `sleep()`, `join()`, `interrupt()`, `wait()`, and `notify()`.
- **Lambda Expressions:** Creating concise thread tasks using lambda syntax.
- **Student Management System:** Applying object-oriented programming, collections, file persistence, and exception handling in a console application.

---

## 1. Exception Handling

**Program:** [`ExceptionHandling.java`](JavaFiles/ExceptionHandling.java)

Exception handling helps applications respond to unexpected situations without terminating abruptly.

### Concepts Covered

- `try` — Encloses code that may produce an exception.
- `catch` — Handles an exception.
- `throw` — Explicitly throws an exception.
- `throws` — Declares exceptions that a method may pass to its caller.
- `IllegalArgumentException` — Represents an invalid argument.
- `IOException` — Represents an input/output error.
- `NumberFormatException` — Occurs when converting invalid numeric text.

### Difference Between `throw` and `throws`

| `throw` | `throws` |
|---|---|
| Explicitly throws an exception. | Declares possible exceptions in a method signature. |
| Used inside a method or block. | Used in a method declaration. |
| Throws an exception object. | Specifies exception types. |

### Learning Outcome

Understand how to validate input, raise exceptions, and handle errors in Java programs.

---

## 2. Java File I/O — `java.io` Package

Java provides file-handling classes to store and retrieve data from the local filesystem.

### Character Streams and Byte Streams

- **Byte streams:** `InputStream` and `OutputStream` are used for binary data, such as images and audio.
- **Character streams:** `Reader` and `Writer` are used for text data, such as `.txt` and `.csv` files.

### Key Classes and Their Roles

| Class | Purpose |
|---|---|
| `File` | Represents file and directory paths and provides file metadata operations. |
| `FileWriter` | Writes character data to a file. |
| `FileReader` | Reads character data from a file. |
| `BufferedReader` | Reads text efficiently, including line-by-line reading. |
| `BufferedWriter` | Buffers text while writing. |
| `PrintWriter` | Provides convenient `print()` and `println()` methods. |

### File Operations

**Program:** [`FileHandling.java`](./JavaFiles/FileHandling.java)

This program demonstrates:

- Creating files using `createNewFile()`.
- Writing content using `FileWriter`.
- Reading content using `FileReader` and `BufferedReader`.
- Updating file content and replacing text.
- Appending content using `FileWriter` in append mode and `PrintWriter`.
- Writing buffered text using `BufferedWriter`.
- Deleting files using `delete()`.
- Handling file-related exceptions using `IOException`.

### File Metadata Inspection

**Program:** [`FileProperties.java`](./JavaFiles/FileProperties.java)

The `File` class provides methods to inspect file information.

| Method | Purpose |
|---|---|
| `getName()` | Returns the file name. |
| `getAbsolutePath()` | Returns the absolute path. |
| `length()` | Returns the file size in bytes. |
| `exists()` | Checks whether the file exists. |
| `canRead()` | Checks whether the file can be read. |
| `canWrite()` | Checks whether the file can be written. |

### Learning Outcome

Understand Java file persistence, text streams, file metadata, and basic file CRUD operations.

---

## 3. Multithreading and Concurrency

**Program:** [`RunnableExample.java`](./JavaFiles/RunnableExample.java)

Multithreading allows multiple threads to make progress within the same process. Threads share the process's memory, while each thread has its own execution state and stack.

### Process vs. Thread

| Process | Thread |
|---|---|
| An executing program with its own process resources. | An execution path within a process. |
| Has its own address space. | Shares process memory with other threads. |
| Generally has greater resource overhead. | Generally has lower creation and switching overhead. |

### Thread Creation Using `Runnable`

The program demonstrates:

- Implementing the `Runnable` interface.
- Overriding the `run()` method.
- Creating thread objects using `new Thread()`.
- Starting execution using `start()`.
- Pausing a thread using `Thread.sleep()`.
- Handling `InterruptedException`.
- Observing concurrent execution and thread scheduling.

### Thread Lifecycle

Common thread states include:

1. **NEW:** A thread object has been created but not started.
2. **RUNNABLE:** The thread is ready to run or is running.
3. **BLOCKED:** The thread is waiting to acquire a monitor lock.
4. **WAITING:** The thread is waiting indefinitely for another thread's action.
5. **TIMED_WAITING:** The thread is waiting for a specified period.
6. **TERMINATED:** The thread has completed execution.

### Why Implement `Runnable`?

- Separates the task from thread management.
- Allows the class to extend another class.
- Supports reuse of task logic.
- Can be used with executor services and thread pools.

---

## 4. Thread Methods — `sleep()`, `join()` and `interrupt()`

**Program:** [`ThreadMethods.java`](./JavaFiles/ThreadMethods.java)

Java provides methods to control and coordinate thread execution.

| Method | Purpose |
|---|---|
| `sleep()` | Pauses the current thread temporarily. |
| `join()` | Waits for another thread to complete. |
| `interrupt()` | Requests interruption of a thread. |

### Practical Concepts

- Waiting for a worker thread using `join()`.
- Pausing execution using `Thread.sleep()`.
- Interrupting a sleeping thread.
- Handling `InterruptedException`.
- Restoring the interrupted status using `Thread.currentThread().interrupt()`.

### Learning Outcome

Understand how threads pause, wait for other threads, and respond to interruption requests.

---

## 5. Lambda Expressions and Thread Creation

**Program:** [`LambdaThreadExample.java`](./JavaFiles/LambdaThreadExample.java)

Lambda expressions provide a concise way to implement functional interfaces.

### Syntax

```java
() -> {
    System.out.println("Thread is running");
}
```

### Concepts Covered

- Lambda expression syntax using `->`.
- Functional interfaces.
- Implementing `Runnable` using a lambda expression.
- Creating and starting threads without separate `Runnable` classes.
- Writing concise concurrent tasks.

### Learning Outcome

Reduce boilerplate code when creating simple thread tasks.

---

## 6. Synchronization and Inter-Thread Communication

**Program:** [`WaitNotifyExample.java`](./JavaFiles/WaitNotifyExample.java)

Synchronization coordinates access to shared resources and helps prevent conflicting operations between threads.

### Concepts Covered

- `synchronized` blocks.
- Shared lock objects.
- Monitor locks.
- `wait()` — Releases the monitor and waits for notification or interruption.
- `notify()` — Wakes one thread waiting on the same object's monitor.
- Reacquiring the monitor after notification.
- Coordinating multiple threads through a shared object.

### Important Notes

- Call `wait()` and `notify()` while holding the monitor of the same object.
- `wait()` releases that object's monitor while the thread waits.
- A notified thread must reacquire the monitor before continuing.
- Always recheck the required condition after waking because notification does not guarantee the condition has been satisfied.

### Learning Outcome

Understand how threads communicate and coordinate their execution using object monitors.

---

## 7. ATM Example — Synchronization

**Program:** [`ATMExample.java`](./JavaFiles/ATMExample.java)

This example demonstrates synchronization around a shared account balance.

### Concepts Covered

- Shared mutable data.
- Synchronized withdrawal and deposit methods.
- Checking the balance before withdrawal.
- Waiting when funds are insufficient.
- Depositing money and notifying waiting threads using `notifyAll()`.
- Rechecking the balance after waking.

### Execution Flow

1. A customer requests a withdrawal.
2. The ATM checks the current balance.
3. If the balance is insufficient, the withdrawal waits.
4. A deposit updates the balance.
5. Waiting threads are notified.
6. A waiting withdrawal rechecks the balance and proceeds if sufficient.

### Learning Outcome

Apply synchronization and inter-thread communication to a practical shared-resource example.

---

## 8. Student Management System

**Project:** [`StudentManagementSystem/`](./StudentManagementSystem/)

- **Student Management System:** Applying object-oriented programming, file handling, and exception handling in a console-based application.

### Project Files

| File | Responsibility |
|---|---|
| [`Main.java`](./StudentManagementSystem/Main.java) | Console menu and user interaction. |
| [`Student.java`](./StudentManagementSystem/Student.java) | Student entity, fields, constructor, getters, and student information. |
| [`StudentService.java`](./StudentManagementSystem/StudentService.java) | Student operations, input validation, and business logic. |
| [`StudentFile.java`](./StudentManagementSystem/StudentFile.java) | File-based storage and reading of student records. |
| [`students.txt`](./StudentManagementSystem/students.txt) | Stores student records on disk. |

### Architecture and Responsibilities

The application separates responsibilities into multiple classes:

- **Entity Model — `Student.java`:** Represents a student using fields such as ID, name, department, year, and added time.
- **Service Layer — `StudentService.java`:** Handles user input, validation, and student operations.
- **File Persistence — `StudentFile.java`:** Saves student records and reads stored data.
- **Console Controller — `Main.java`:** Displays the menu and routes user choices to the service.

This is a simple layered design inspired by enterprise application architecture. It is not a full MVC or DAO implementation.

### Features

- Add student details.
- Create and use student objects.
- Store student records in `students.txt`.
- View saved student records.
- Validate student IDs and academic years.
- Handle invalid numeric input.
- Handle file-related exceptions.
- Record the time when a student object is created.

### Data Storage

The application uses file-based persistence to store student records.

- **Student objects:** Represent individual student details.
- **File storage:** `students.txt` stores student records between executions.

The application can display student records saved in `students.txt` between executions.

### Learning Outcome

Understand how multiple Java classes work together to build a small application with input validation, object-oriented programming, exception handling, and file persistence.

---

## 9. Summary Comparison Matrix

### File I/O Comparison

| Feature | `FileWriter` | `BufferedWriter` | `PrintWriter` |
|---|---|---|---|

| Primary purpose | Write character data. | Buffered character writing. | Convenient text output. |
| Common methods | `write()` | `write()`, `newLine()` | `print()`, `println()`, `printf()` |
| Buffering | No additional character buffer by default. | Yes. | Depends on the underlying writer and configuration. |
| Typical use | Simple text writing. | Efficient repeated writes. | Formatted or convenient text output. |

### Threading Comparison

| Feature | `Thread` subclass | `Runnable` implementation |
|---|---|---|
| Task implementation | Override `run()`. | Implement `run()`. |
| Inheritance | Uses the single class inheritance slot. | Can extend another class. |
| Separation of concerns | Task and thread management are combined. | Task logic is separated from the thread object. |
| Executor compatibility | Not directly accepted as a `Runnable` task unless adapted. | Can be submitted directly to an executor. |

---


## 10. Compilation and Execution Guide

### A. Standalone Java Programs

From the `Day-8` directory:

```powershell
cd JavaFiles
javac *.java
```

Run each program separately:

```powershell
java ExceptionHandling
java FileHandling
java FileProperties
java RunnableExample
java ThreadMethods
java LambdaThreadExample
java WaitNotifyExample
java ATMExample
```

Return to the `Day-8` directory:

```powershell
cd ..
```

### B. Student Management System

```powershell
cd StudentManagementSystem
javac *.java
java Main
```

**Note:** These commands assume there are no package declarations and that the public class names match their filenames.

---

## Key Learnings

- Apply exception handling using `throw`, `throws`, `try`, and `catch`.
- Perform file operations using Java I/O classes.
- Create and manage student objects using object-oriented programming.
- Store and retrieve student records using file handling.
- Create concurrent tasks using `Thread` and `Runnable`.
- Use lambda expressions for thread creation.
- Coordinate threads using `sleep()`, `join()`, and `interrupt()`.
- Protect shared resources using synchronization.
- Use `wait()`, `notify()`, and `notifyAll()` for inter-thread communication.
---

**Training:** UPS Java Full Stack Training  
**Day:** 8  
**Focus:** Exception Handling, Java File I/O, Student Management System, Multithreading, Lambda Expressions, and Synchronization
