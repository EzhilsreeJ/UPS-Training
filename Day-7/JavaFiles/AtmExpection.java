
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

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                a.sc.nextLine();
            }
        }
    }
}
