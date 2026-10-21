# Day 10: Java Date & Time API, Collections Framework and Student Management

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk&logoColor=white)
![Training](https://img.shields.io/badge/UPS-Full%20Stack%20Training-blue?style=for-the-badge)
![Day](https://img.shields.io/badge/Day-10-green?style=for-the-badge)

**Focus:** Date and Time API • Collections Framework • Generics • Functional Interfaces • Student Management System

---

## 1. Day 10 Overview

Day 10 focused on Java's Date and Time API, Collections Framework, Generics, and Functional Interfaces.

The session covered date and time formatting, calculating differences between dates and times, working with different collection types, and updating the existing Student Management System to store student objects in an `ArrayList` instead of using file storage.

### Topics Covered

- `LocalDate`, `LocalTime`, `LocalDateTime`, and `ZonedDateTime`
- `DateTimeFormatter`
- `Period` and `Duration`
- `ArrayList`, `LinkedList`, and `Vector`
- `HashSet`, `TreeSet`, and `LinkedHashSet`
- `Queue` and `PriorityQueue`
- `Map` and its methods
- Generics
- Functional Interfaces and lambda expressions
- Student Management System using `ArrayList`
- Recording the date and time when a student is added

---

## 2. Java Date and Time API

The `java.time` package provides classes for handling dates, times, time zones, and date/time calculations.

| Class | Purpose |
|---|---|
| `LocalDate` | Stores a date |
| `LocalTime` | Stores a time |
| `LocalDateTime` | Stores date and time |
| `ZonedDateTime` | Stores date, time, and time zone |
| `Period` | Calculates date-based differences |
| `Duration` | Calculates time-based differences |
| `DateTimeFormatter` | Formats date and time values |

### 2.1 LocalDate

**Java file:** [today.java](JavaFiles/today.java)

Methods covered:
- `now()` – gets the current date.
- `getYear()` – returns the year.
- `getMonth()` – returns the month.
- `getDayOfMonth()` – returns the day of the month.
- `plusDays()` – adds days.
- `minusMonths()` – subtracts months.

### 2.2 DateTimeFormatter

**Java file:** [Formatter.java](JavaFiles/Formatter.java)

Formats date and time values into a specified pattern.

| Pattern | Meaning |
|---|---|
| `dd` | Day |
| `MM` | Month |
| `yyyy` | Year |
| `HH` | Hour in 24-hour format |
| `mm` | Minute |
| `ss` | Second |

Example format: `21-10-2026 14:28`. The actual output depends on the current date and time.

### 2.3 Period

**Java file:** [PeriodExample.java](JavaFiles/PeriodExample.java)

Calculates the difference between two dates.

Methods covered: `between()`, `getYears()`, `getMonths()`, and `getDays()`.

### 2.4 Duration

**Java file:** [TimeDurationCalculator.java](JavaFiles/TimeDurationCalculator.java)

Calculates time-based differences.

Methods covered: `between()` and `toHours()`.

### Period vs. Duration

| Period | Duration |
|---|---|
| Used for date-based differences | Used for time-based differences |
| Years, months, days | Hours, minutes, seconds |
| Suitable for calendar-date calculations | Suitable for elapsed-time calculations |

**Advantages of the Date and Time API**
- Provides clear classes for different date and time operations.
- Supports convenient calculations.
- Allows custom formatting.
- Date and time objects are immutable.

**Disadvantages**
- Formatting patterns require the correct symbols.
- Choosing the appropriate class depends on the requirement.
- Time-zone calculations require additional care.

---

## 3. Collections Framework

The Java Collections Framework provides data structures for storing, retrieving, and managing groups of objects.

### 3.1 ArrayList

`ArrayList` is a resizable array that maintains insertion order and allows duplicate elements.

**Basic syntax:**

```java
ArrayList<String> names = new ArrayList<>();
names.add("Arun");
names.add("Priya");
```

**Common methods:** `add()`, `get()`, `set()`, `remove()`, `size()`, and `contains()`.

**Advantages**
- Fast access by index.
- Automatically resizes.
- Useful for storing student objects.

**Disadvantages**
- Inserting or removing elements in the middle can require shifting.
- Not synchronized by default.

### 3.2 LinkedList

`LinkedList` stores elements in linked nodes and supports list and deque operations.

**Basic syntax:**

```java
LinkedList<String> names = new LinkedList<>();
names.add("Arun");
names.addFirst("Ravi");
names.addLast("Priya");
```

**Advantages**
- Convenient insertion and removal at either end.
- Supports queue operations.

**Disadvantages**
- Slower indexed access than `ArrayList` in typical use.
- Requires additional memory for links.

### 3.3 Vector — Legacy Collection

`Vector` is a resizable array whose individual methods are synchronized.

**Basic syntax:**

```java
Vector<String> names = new Vector<>();
names.add("Arun");
names.add("Priya");
```

**Advantages**
- Automatically resizes.
- Synchronized methods provide basic thread-safe operations.

**Disadvantages**
- Synchronization may add overhead.
- `ArrayList` is generally preferred when synchronization is unnecessary.

---

## 4. Set Collections

A `Set` stores unique elements and does not allow duplicates.

### 4.1 HashSet

Does not guarantee insertion or sorted order.

**Basic syntax:**

```java
HashSet<Integer> numbers = new HashSet<>();
numbers.add(30);
numbers.add(10);
numbers.add(30);
```

**Advantage:** Usually fast for adding, removing, and checking elements.

**Disadvantage:** Iteration order is not guaranteed.

### 4.2 LinkedHashSet

Maintains insertion order while preventing duplicates.

**Basic syntax:**

```java
LinkedHashSet<String> names = new LinkedHashSet<>();
names.add("Arun");
names.add("Priya");
names.add("Arun");
```

**Advantage:** Preserves insertion order.

**Disadvantage:** Requires additional memory to maintain order.

### 4.3 TreeSet

Stores unique elements in sorted order.

**Basic syntax:**

```java
TreeSet<Integer> numbers = new TreeSet<>();
numbers.add(30);
numbers.add(10);
numbers.add(20);
```

**Output:** `[10, 20, 30]`

**Advantage:** Automatically sorts elements.

**Disadvantage:** Basic operations are generally slower than those of `HashSet`.

---

## 5. Queue and PriorityQueue

A `Queue` holds elements for processing. A typical FIFO queue processes the first element added first.

### Queue

**Basic syntax:**

```java
Queue<String> q = new LinkedList<>();
q.offer("Arun");
q.offer("Priya");

System.out.println(q.poll());
System.out.println(q.peek());
```

- `offer()` – adds an element.
- `poll()` – removes and returns the head.
- `peek()` – views the head without removing it.

### PriorityQueue

Processes elements according to priority. With natural ordering, the smallest element is retrieved first.

**Basic syntax:**

```java
PriorityQueue<Integer> q = new PriorityQueue<>();
q.offer(30);
q.offer(10);
q.offer(20);

System.out.println(q.poll());
```

**Advantages**
- A queue is useful for processing tasks.
- A priority queue selects elements based on priority ordering.

**Disadvantages**
- A normal FIFO queue does not automatically prioritize values.
- Iterating through a `PriorityQueue` does not guarantee sorted output.

---

## 6. Map

A `Map` stores data as key-value pairs. Each key is unique.

**Example file:** [MapExample.java](JavaFiles/MapExample.java)

Methods covered:

| Method | Purpose |
|---|---|
| `put()` | Adds or updates a key-value pair |
| `get()` | Retrieves a value using its key |
| `keySet()` | Returns the keys |
| `values()` | Returns the values |
| `entrySet()` | Returns the key-value entries |
| `remove()` | Removes a mapping |

**Advantages**
- Retrieves values using keys.
- Adding a value with an existing key updates its previous value.

**Disadvantages**
- Keys must be unique.
- `HashMap` does not guarantee iteration order.

---

## 7. Generics

Generics allow classes and methods to work with specified types.

**Basic syntax:**

```java
class Box<T> {
    T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}
```

Here, `T` represents the type supplied when creating the object.

**Advantages**
- Improves type safety.
- Reduces explicit type casting.
- Supports reusable code.

**Disadvantages**
- Generic syntax may be confusing initially.
- Primitive types cannot be used directly as generic type arguments; use wrapper types such as `Integer`.

---

## 8. Functional Interface

A Functional Interface has exactly one abstract method and can be implemented using a lambda expression.

**Basic syntax:**

```java
@FunctionalInterface
interface Message {
    void show();
}

Message m = () -> System.out.println("Hello Java");
m.show();
```

**Advantages**
- Reduces boilerplate code.
- Makes simple implementations concise.
- Supports lambda expressions.

**Disadvantages**
- Complex lambda expressions can be harder to read.
- Beginners may need practice with lambda syntax.

---

## 9. Student Management System — ArrayList Update

### Objective

Update the existing Student Management System to store student objects in an `ArrayList` instead of using file storage.

When a student is added, the application records the current date and time. The view operation uses a `for` loop and a `Student` object reference to display student details.

### Project Files

- [Main.java](StudentManagement/Main.java) — accepts menu choices and student details.
- [Student.java](StudentManagement/Student.java) — represents each student and stores the date and time when the object is created.
- [StudentService.java](StudentManagement/StudentService.java) — manages student objects using an `ArrayList`.
- [StudentFile.java](StudentManagement/StudentFile.java) — previous file-handling class; the updated application should not depend on it for student storage.

### How It Works

1. `Main.java` accepts menu choices and student details.
2. `StudentService.java` stores student objects in an `ArrayList<Student>`.
3. `Student.java` records the date and time when the student object is created.
4. The view operation iterates through the list using a `for` loop and a `Student` reference.
5. Student records remain in memory only and are lost when the program terminates.

**Advantages**
- Simple to implement.
- Stores complete student objects in one collection.
- Records when each student is added.
- Makes displaying student details straightforward.

**Disadvantages**
- Records are not permanently stored.
- Data is lost when the application closes.
- Duplicate IDs require separate validation if uniqueness is required.

**Note:** `StudentFile.java` can remain in the folder if it is unused, but the updated application should use the `ArrayList` for student storage.

---

## 10. Compilation and Execution Guide

### Date and Time Programs

Run these commands from the `Day-10` directory:

```powershell
cd JavaFiles

javac Formatter.java
java Formatter

javac PeriodExample.java
java PeriodExample

javac TimeDurationCalculator.java
java TimeDurationCalculator
```

If `today.java` exists in `JavaFiles`, run it using:

```powershell
javac today.java
java today
```

### Map Example

The Map example should be saved as `MapExample.java` inside `JavaFiles`, with a public class named `MapExample`. This avoids conflicts with the Student Management System's `Main.java`.

```powershell
javac MapExample.java
java MapExample
```

### Student Management System

From the `Day-10` directory:

```powershell
cd StudentManagement
javac *.java
java Main
```

These commands assume the source files have no package declarations. If `StudentFile.java` contains code that depends on other classes or has compilation errors, resolve those errors or exclude the unused file from compilation.

---

## 11. Key Learnings

- Use Java's Date and Time API to retrieve and manipulate dates and times.
- Format date-time values using `DateTimeFormatter`.
- Calculate date differences using `Period`.
- Calculate time differences using `Duration`.
- Understand `ArrayList`, `LinkedList`, and `Vector`.
- Store unique elements using `HashSet`, `LinkedHashSet`, and `TreeSet`.
- Process elements using `Queue` and `PriorityQueue`.
- Manage key-value pairs using `Map`.
- Write reusable, type-safe code using Generics.
- Use lambda expressions with Functional Interfaces.
- Update the Student Management System to store objects in an `ArrayList`.
- Display student details using a `for` loop and object references.
- Record the date and time when a student is added.

---

**Training:** UPS Java Full Stack Training  
**Day:** 10  
**Focus:** Date and Time API, Collections Framework, Generics, Functional Interfaces, and Student Management System
