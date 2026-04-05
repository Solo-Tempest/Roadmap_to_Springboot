package Phase_1.week_2.part_2.ExceptionHandling;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        try {
            account.withdraw(500);   // valid
            account.withdraw(1500);  // invalid
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage() + " Shortage: " + e.getShortage());
        }
    }
}

class InsufficientFundsException extends RuntimeException {
    private int shortage;

    public InsufficientFundsException(String message, int shortage) {
        super(message);
        this.shortage = shortage;
    }

    public int getShortage() {
        return shortage;
    }
}

class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            int shortage = amount - balance;
            throw new InsufficientFundsException("Insufficient funds.", shortage);
        }

        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}