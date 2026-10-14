
# UPS Training – Day 6

## Topics Covered

### 1. Polymorphism
- Compile-time polymorphism
- Runtime polymorphism
- Method overriding
- Abstract classes and methods

### 2. Constructor Overloading
- Creating multiple constructors in a class
- Constructors with different parameter lists
- Initializing objects in different ways

### 3. String and StringBuilder
- String manipulation
- `charAt()` and `length()`
- `split()` and `toCharArray()`
- `StringBuilder` methods
- Reversing strings


### 4. BSM – Logical Reasoning and Problem Solving
- Logical reasoning puzzles
- Critical thinking and analysis
- Identifying patterns and relationships
- Evaluating possible outcomes
- Decision-making through logical thinking


## Programs Practiced

### 1. Anagram – Manual Sorting

**Description:**
- Checks whether two strings are anagrams.
- Converts strings into character arrays.
- Sorts characters manually using nested loops and swapping.
- Compares the sorted character arrays.

**Code:**

```java
public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    char temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                if (b[i] > b[j]) {
                    char temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }

        if (new String(a).equals(new String(b)))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}
```

**Output:**

```text
Anagram
```

### 2. Reverse Words in a String

**Description:**
- Splits the input string into words using spaces.
- Prints the words in reverse order while preserving the characters in each word.

**Code:**

```java
public class ReverseString {
    public static void main(String[] args) {
        String s = "Java Full Stack";
        String[] words = s.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
```

**Output:**

```text
Stack Full Java
```

### 3. Constructor Overloading

**Description:**
- Created multiple constructors in the `Student` class.
- Demonstrated default and parameterized constructors.
- Initialized objects using different constructor arguments.

**Code:**

```java
public class Student {
    Student() {
        System.out.println("Constructor Overloading");
    }

    Student(String name) {
        System.out.println("Name: " + name);
    }

    Student(String name, String Dept) {
        System.out.println("Name: " + name + " Dept: " + Dept);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Ezhil");
        Student s3 = new Student("Ezhil", "AIDS");
    }
}
```

**Output:**

```text
Constructor Overloading
Name: Ezhil
Name: Ezhil Dept: AIDS
```

### 4. Runtime Polymorphism Using Abstract Classes

**Description:**
- Created an abstract class to define a common method.
- Implemented the method in different bank classes.
- Demonstrated method overriding.

**Code:**

```java
public class Main {
    public static void main(String[] args) {
        Sbi s = new Sbi();
        IndianBank i = new IndianBank();

        s.rule();
        i.rule();
    }
}

abstract class Rbi {
    abstract void rule();
}

class Sbi extends Rbi {
    void rule() {
        System.out.println("SBI Rules");
    }
}

class IndianBank extends Rbi {
    void rule() {
        System.out.println("Indian Bank Rules");
    }
}
```

**Output:**

```text
SBI Rules
Indian Bank Rules
```

### 5. Merge Two Character Arrays

**Description:**
- Created two character arrays.
- Merged them into a single array using one `for` loop.
- Used an `if-else` condition to copy characters from both arrays.

**Code:**

```java
public class MergeChar {
    public static void main(String[] args) {
        char[] arr1 = {'E', 'Z', 'H', 'I', 'L'};
        char[] arr2 = {'S', 'R', 'E', 'E'};
        char[] ans = new char[arr1.length + arr2.length];

        for (int i = 0; i < ans.length; i++) {
            if (i < arr1.length) {
                ans[i] = arr1[i];
            } else {
                ans[i] = arr2[i - arr1.length];
            }
        }

        System.out.println(ans);
    }
}
```

**Output:**

```text
EZHILSREE
```

### 6. Remove Spaces from a String

**Description:**
- Iterated through each character using a `for` loop.
- Used `charAt()` to access individual characters.
- Printed only characters that are not spaces.

**Code:**

```java
public class RemoveChar {
    public static void main(String[] args) {
        String s = "Java Full Stack";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                System.out.print(s.charAt(i));
            }
        }
    }
}
```

**Output:**

```text
JavaFullStack
```

## BSM – Logical Reasoning Questions and Answers

### 1. River Crossing Puzzle

**Question:** Four people (Alex, Bella, Chris and Dylan) want to cross a river in a boat that can carry only 100 kg. Alex weighs 90 kg, Bella weighs 80 kg, Chris weighs 60 kg and Dylan weighs 40 kg, and they have 20 kg of supplies. How do they get across?

**Answer:**

The puzzle cannot be solved as stated without additional rules or a change in the boat capacity. The weights and supplies prevent the proposed combinations from fitting within the 100 kg limit.

### 2. Bridge Crossing Puzzle

**Question:** Alice takes 1 minute, Ben takes 2 minutes, Chris takes 5 minutes and Don takes 8 minutes to cross a bridge. Only two people can cross at a time, and they need one torch. How can everyone cross in 15 minutes?

**Answer:**

1. Alice and Ben cross — 2 minutes.
2. Alice returns — 1 minute.
3. Chris and Don cross — 8 minutes.
4. Ben returns — 2 minutes.
5. Alice and Ben cross again — 2 minutes.

**Total: 15 minutes.**

### 3. Married Person Looking at an Unmarried Person

**Question:** Jack is looking at Anne. Anne is looking at George. Jack is married, George is unmarried, and Anne's marital status is unknown. Is a married person looking at an unmarried person?

**Answer:** Yes.

- If Anne is married, she is looking at George, who is unmarried.
- If Anne is unmarried, Jack, who is married, is looking at her.

Therefore, a married person is definitely looking at an unmarried person.

### 4. Matchstick Puzzle

**Question:** If you were alone in a dark room with one match, an oil lamp, a fireplace, and a candle, what would you light first?

**Answer:** The match, because it is needed to light the other items.

### 5. Duck Puzzle

**Question:** There are two ducks in front of a duck, two ducks behind a duck, and a duck in the middle. How many ducks are there?

**Answer:** Three ducks.

- One duck is in front.
- One duck is in the middle.
- One duck is behind.

### 6. Apple Finishing Order

**Question:** A finished before B but behind C. D finished before E but behind B. What was the finishing order?

**Answer:** C → A → B → D → E.

- C finished before A.
- A finished before B.
- B finished before D.
- D finished before E.

### 7. The King's Punishment

**Question:** A king says that a true statement will result in death by lions and a false statement will result in death by wild buffalo. If the king cannot determine the truth, the man will be released. What statement can the man make to be released?

**Answer:** "You will kill me by trampling me with your wild buffalo."

- If the king sends him to the buffalo, the statement becomes true.
- If the king sends him to the lions, the statement becomes false.

The king cannot punish him without contradicting his own rule, so he must release the man.

## Learning Outcomes

- Understood compile-time and runtime polymorphism.
- Practiced constructor overloading using different parameter lists.
- Learned string manipulation and character-array operations.
- Implemented manual sorting to check anagrams.
- Practiced reversing words in a string.
- Applied abstraction and method overriding using bank classes.
- Merged character arrays using a single loop.
- Removed spaces from strings using conditional statements.
- Improved logical reasoning and problem-solving skills.
