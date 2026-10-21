
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private int balance = 5000;

    void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance)
            throw new InsufficientBalanceException("Insufficient balance!");

        balance -= amount;
    }

    int getBalance() {
        return balance;
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        try {
            account.withdraw(6000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Available balance: " + account.getBalance());
    }
}
