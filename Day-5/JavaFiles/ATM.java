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