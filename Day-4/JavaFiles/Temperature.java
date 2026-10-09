import java.util.*;

public class Temperature {
    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Fahrenheit: " + celsiusToFahrenheit(temp));
                break;
            case 2:
                System.out.println("Celsius: " + fahrenheitToCelsius(temp));
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}