# UPS Training – Day 4

## Topics Covered
- Methods in Java
  - Static methods
  - Methods with parameters
  - Method calling
- Arrays in Java
  - Array declaration and initialization
  - Accessing array elements
  - Iterating through arrays

## Task 1 – Calculator Using Methods and Looping

```java
import java.util.*;

class Calculator {

    static void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    static void sub(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    static void mul(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    static void div(int a, int b) {
        if (b != 0)
            System.out.println("Division: " + (a / b));
        else
            System.out.println("Cannot divide by zero");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter First number: ");
            int a = sc.nextInt();

            System.out.print("Enter Second number: ");
            int b = sc.nextInt();

            System.out.print("Enter operator (+, -, *, /): ");
            char op = sc.next().charAt(0);

            switch (op) {
                case '+':
                    add(a, b);
                    break;
                case '-':
                    sub(a, b);
                    break;
                case '*':
                    mul(a, b);
                    break;
                case '/':
                    div(a, b);
                    break;
                default:
                    System.out.println("Invalid operator");
            }
        }
    }
}
```
**Output:**

![alt text](image.png)

---

## Task 2

```java
import java.util.*;
public class Func {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Please size of array:");
    int n=sc.nextInt();
    int[] arr= new int[n];
    for(int i=0;i<n;i++){
        System.out.println("Please Enter "+i+"th value");
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        System.out.println(i+"th value: "+arr[i]);
    }
}
    
}
```
**Output:**

![![alt text](image-1.png)](image-1.png)

---
## Task-3
```java
import java.util.*;
public class TwoDim {
    static Scanner sc= new Scanner(System.in);
    static int[][] createArray(int row,int col){
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    static int[][] addMatrix(int row,int col,int[][] arr1,int[][] arr2){
        int[][] res=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                res[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
        System.out.print("Please Enter size of row: ");
        int row=sc.nextInt();
        System.out.print("Please Enter size of col:");
        int col=sc.nextInt();
        System.out.println("Enter values of First matrix: ");
        int[][] arr1= createArray(row,col);
        System.out.println("Enter values of second matrix: ");
        int[][] arr2= createArray(row,col);
        int[][] res=addMatrix(row,col,arr1,arr2);
        System.out.println("Sum of Two Matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }


        
    }
    
    
}


```
![alt text](image-2.png)