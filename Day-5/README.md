
# UPS Training – Day 5

## Topics Covered

### 1. Constructors
- Default and parameterized constructors
- Constructor overloading
- Object initialization

### 2. Encapsulation
- Data hiding using `private` variables
- Accessing data through methods

### 3. Access Modifiers
- `public`
- `private`
- `protected`
- Default access modifier

### 4. POJO Class
- Introduction to Plain Old Java Objects
- Variables, constructors, getters, and setters

### 5. Static vs Final
- Static variables and methods
- Final variables, methods, and classes
- Differences between `static` and `final`

### 6. Type Conversion
- Converting strings to integers using `Integer.parseInt()`

### 7. Inheritance
- Parent and child classes
- Method overriding
- Runtime polymorphism
- Using the `extends` keyword

## Programs Practiced

### 1. Animal Sound – Inheritance and Method Overriding

**Description:**
- Created an `Animal` parent class with a `sound()` method.
- Created `Dog` and `Cat` child classes.
- Overrode the `sound()` method to display different sounds.

**Code:**

```java
class Animal {
    void sound() {
        System.out.println("Animals sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.sound();
        c.sound();
    }
}
```

**Output:**

```text
Bark
Meow
```

### 2. ATM Application – Encapsulation

**Description:**

Developed a menu-driven ATM application to perform basic banking operations while demonstrating encapsulation.

**Features:**
- Check account balance
- Deposit money
- Withdraw money
- Exit the application
- Validate deposit and withdrawal amounts
- Handle invalid choices and insufficient balance

**Concepts Used:**
- Encapsulation using `private` variables
- `Scanner` for user input
- `while` loop
- `switch` statement
- Conditional statements
- Methods and objects

**Code:**

```java
import java.util.*;

class ATM {
    private int bal = 1000;
    Scanner sc = new Scanner(System.in);

    void deposit() {
        System.out.println("Enter amt to deposit:");
        int amt = sc.nextInt();

        if (amt > 0) {
            bal = bal + amt;
            System.out.println("Amt deposited successfully");
        } else {
            System.out.println("Invalid amount");
        }
    }

    void withdraw() {
        System.out.println("Enter amt to withdraw:");
        int amt = sc.nextInt();

        if (amt > 0 && amt <= bal) {
            bal = bal - amt;
            System.out.println("Amt withdrawn successfully");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + bal);
    }

    public static void main(String[] args) {
        ATM a = new ATM();

        while (true) {
            System.out.println("\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            System.out.println("Enter your choice:");
            int choice = a.sc.nextInt();

            switch (choice) {
                case 1:
                    a.checkBalance();
                    break;
                case 2:
                    a.deposit();
                    break;
                case 3:
                    a.withdraw();
                    break;
                case 4:
                    System.out.println("Thank you");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
```

**Sample Output:**

```text
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice:
1
Balance: 1000

1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice:
2
Enter amt to deposit:
500
Amt deposited successfully

1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice:
3
Enter amt to withdraw:
200
Amt withdrawn successfully

1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice:
1
Balance: 1300

1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice:
4
Thank you
```

## BSM – Behavioural Skills and Mindset

### Mindset
1. Growth Mindset
2. Persistence
3. Personal Responsibility
4. Future Orientation

### Behavioural Skills
1. Communication
2. Proactiveness
3. Teamwork
4. Orientation to Detail

## BSM Questions and Answers

### 1. What is a Growth Mindset?

A growth mindset means believing that I can improve my skills and knowledge through learning, practice, and effort. Instead of giving up when I face difficulties, I try to learn from my mistakes.

### 2. What is Persistence?

Persistence means continuing to work toward my goals even when things become difficult. For example, when my code has errors, I keep debugging and trying different solutions until I understand the problem.

### 3. What is Personal Responsibility?

Personal responsibility means accepting my actions and mistakes instead of blaming others. I try to complete my work on time and take responsibility for the results.

### 4. What is Future Orientation?

Future orientation means thinking about my future goals and taking steps today to achieve them. As a student, I focus on improving my technical skills and preparing for my career.

### 5. What is Communication?

Communication means sharing my thoughts clearly and listening to others carefully. Good communication helps me work effectively with teammates and understand different ideas.

### 6. What is Proactiveness?

Proactiveness means taking initiative instead of waiting for someone to tell me what to do. I try to identify problems early and find solutions on my own.

### 7. What is Teamwork?

Teamwork means working together with others to achieve a common goal. I respect everyone's ideas, share my knowledge, and help my teammates whenever possible.

### 8. What is Orientation to Detail?

Orientation to detail means paying attention to small things to avoid mistakes. While coding, I check syntax, variable names, and program output carefully to make sure everything works correctly.

## Learning Outcomes

- Understood constructors and constructor overloading.
- Learned encapsulation and access modifiers.
- Understood POJO classes.
- Differentiated between `static` and `final`.
- Practiced string-to-integer conversion using `Integer.parseInt()`.
- Implemented inheritance and method overriding.
- Applied object-oriented programming concepts in an ATM application.
- Improved understanding of professional mindset and behavioural skills.
