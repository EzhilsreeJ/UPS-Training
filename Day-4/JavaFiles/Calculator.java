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