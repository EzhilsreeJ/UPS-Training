package JavaFiles;

class ATM {
    private int balance = 1000;

    synchronized void withdraw(int amount) {
        System.out.println(
            Thread.currentThread().getName() + " wants to withdraw " + amount
        );

        while (balance < amount) {
            System.out.println("Insufficient balance. Waiting for deposit.");

            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Withdrawal interrupted.");
                Thread.currentThread().interrupt();
                return;
            }
        }

        balance -= amount;
        System.out.println("Withdrawal successful: " + amount);
        System.out.println("Remaining balance: " + balance);
    }

    synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current balance: " + balance);

        notifyAll();
    }
}

public class ATMExample {
    public static void main(String[] args) {
        ATM atm = new ATM();

        Thread t1 = new Thread(() -> atm.withdraw(1500), "Customer 1");
        Thread t2 = new Thread(() -> atm.withdraw(500), "Customer 2");

        t1.start();
        t2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        atm.deposit(1000);
    }
}
