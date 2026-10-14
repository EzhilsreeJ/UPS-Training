
# UPS Training – Day 7

## Topics Covered

### 1. Interfaces in Java
- Introduction to interfaces
- Implementing an interface using `implements`
- Extending an interface using `extends`
- Interface-to-interface inheritance
- Implementing interfaces in concrete classes
- Runtime polymorphism using interfaces

### 2. Built-in Functions of Arrays and Strings
- `Arrays.sort()`
- `Arrays.toString()`
- `Arrays.equals()`
- `String.length()`
- `String.charAt()`
- `String.substring()`
- `String.equals()`
- `String.split()`

### 3. StringBuffer
- Introduction to `StringBuffer`
- Mutable strings
- `append()`, `insert()`, `replace()`, `delete()`, and `reverse()`

### 4. Jagged Arrays
- Creating arrays with different numbers of columns in each row
- Accessing elements using nested loops
- Using `arr.length` and `arr[i].length`

### 5. Common Array Errors
- `ArrayIndexOutOfBoundsException`
- Accessing invalid indexes
- Understanding array length
- Avoiding incorrect loop conditions

### 6. Exception Handling
- Introduction to exceptions
- `try` and `catch`
- Using `throw` to throw exceptions manually
- Handling invalid user input
- Displaying exception messages using `getMessage()`

---

## Programs Practiced

### 1. ATM Application with Exception Handling

**File: `ATM.java`**

```java
import java.util.*;

class ATM {
    private int bal = 1000;
    Scanner sc = new Scanner(System.in);

    void deposit() {
        try {
            System.out.println("Enter amt to deposit:");
            int amt = sc.nextInt();

            if (amt <= 0) {
                throw new Exception("Invalid deposit amount");
            }

            bal = bal + amt;
            System.out.println("Amt deposited successfully");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            sc.nextLine();
        }
    }

    void withdraw() {
        try {
            System.out.println("Enter amt to withdraw:");
            int amt = sc.nextInt();

            if (amt <= 0 || amt > bal) {
                throw new Exception("Please enter sufficient amount");
            }

            bal = bal - amt;
            System.out.println("Amt withdrawn successfully");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            sc.nextLine();
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + bal);
    }

    public static void main(String[] args) {
        ATM a = new ATM();

        while (true) {
            try {
                System.out.println(
                    "\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit"
                );
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

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                a.sc.nextLine();
            }
        }
    }
}
```


**Sample Output**

```text
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Enter your choice:
3
Enter amt to withdraw:
2000
Please enter sufficient amount
```


### 2. Jagged Array

**File: `JaggedArray.java`**

```java
public class JaggedArray {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3},
            {4, 5}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

**Sample Output**

```text
1 2 3
4 5
```

### 3. Payment Method Application Using Interfaces

**File: `PaymentMethod.java`**

```java
import java.util.*;

interface Payment {
    void pay();
}

class Upi implements Payment {
    public void pay() {
        System.out.print("Please UPI PIN: ");
        int pin = PaymentMethod.sc.nextInt();
        String s = pin + "";

        if (s.length() == 4 && pin == 1234) {
            System.out.println("Payment successful Through UPI");
        } else {
            System.out.println(
                "Payment Failed. Please enter valid 4 digit PIN"
            );
        }
    }
}

class Cash implements Payment {
    public void pay() {
        System.out.println("Payment successful Through Cash");
    }
}

class Card implements Payment {
    public void pay() {
        System.out.print("Please PIN: ");
        int pin = PaymentMethod.sc.nextInt();
        String s = pin + "";

        if (s.length() == 4 && pin == 1234) {
            System.out.println("Payment successful Through Card");
        } else {
            System.out.println("Please enter valid 4 digit PIN");
        }
    }
}

public class PaymentMethod {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Payment p;

        System.out.println(
            "1. UPI\n2. Cash\n3. Card\nPlease Select payment method"
        );

        int n = sc.nextInt();

        switch (n) {
            case 1:
                p = new Upi();
                p.pay();
                break;
            case 2:
                p = new Cash();
                p.pay();
                break;
            case 3:
                p = new Card();
                p.pay();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
```

**Sample Output**

```text
1. UPI
2. Cash
3. Card
Please Select payment method
2
Payment successful Through Cash
```

---

## Learning Outcomes

- Understood interface inheritance using `extends` and implementation using `implements`.
- Practiced built-in methods of the `Arrays` and `String` classes.
- Learned string manipulation using `StringBuffer`.
- Created and traversed jagged arrays using nested loops.
- Identified common array errors and learned how to avoid them.
- Applied exception handling using `try`, `catch`, and `throw`.
- Developed ATM and payment applications using Java concepts.
