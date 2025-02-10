abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }
    public abstract double calculateInterest();

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getHolderName() {
        return holderName;
    }
    public double getBalance() {
        return balance;
    }
}
interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
}
class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    public double calculateInterest() {
        return getBalance() * 0.04;
    }
    public void applyForLoan() {}

    public double calculateLoanEligibility() {
        return getBalance() * 2;
    }
}
class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    public double calculateInterest() {
        return getBalance() * 0.02;
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("12345", "John Doe", 10000),
            new CurrentAccount("67890", "Jane Doe", 15000)
        };

        for (BankAccount acc : accounts) {
            System.out.println(acc.getHolderName() + " Interest: $" + acc.calculateInterest());
        }
    }
}
