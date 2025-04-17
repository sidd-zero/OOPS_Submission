package P5;
class BankAccount {
    double balance = 500.0;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    
    void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied: Minimum balance of 100 must be maintained.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}

public class BankApp {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.displayBalance();
        sa.withdraw(450);
        sa.displayBalance();
        sa.deposit(200);
        sa.withdraw(300);
        sa.displayBalance();
    }
}
