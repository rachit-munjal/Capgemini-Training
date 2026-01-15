package Level2;

public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (balance >= amount)
            balance = balance - amount;
    }

    void displayBalance() {
        System.out.println(balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.accountHolder = "Anita";
        b.accountNumber = 1001;
        b.balance = 5000;
        b.deposit(2000);
        b.withdraw(1500);
        b.displayBalance();
    }
}

