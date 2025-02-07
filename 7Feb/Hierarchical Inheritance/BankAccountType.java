class BankAccount {
    int accountNumber;
    double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void displayAccountType() {
        System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
    }
}
class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    @Override
    public void displayAccountType() {
        super.displayAccountType();
        System.out.println("Account Type: Savings, Interest Rate: " + interestRate + "%");
    }
}
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    public CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    @Override
    public void displayAccountType() {
        super.displayAccountType();
        System.out.println("Account Type: Checking, Withdrawal Limit: $" + withdrawalLimit);
    }
}
class FixedDepositAccount extends BankAccount {
    String maturityDate;

    public FixedDepositAccount(int accountNumber, double balance, String maturityDate) {
        super(accountNumber, balance);
        this.maturityDate = maturityDate;
    }
    @Override
    public void displayAccountType() {
        super.displayAccountType();
        System.out.println("Account Type: Fixed Deposit, Maturity Date: " + maturityDate);
    }
}
public class BankAccountType {
    public static void main(String[] args) {
        BankAccount saving = new SavingsAccount(101, 5000, 4.5);
        BankAccount checking = new CheckingAccount(102, 3000, 1000);
        BankAccount fixedDeposit = new FixedDepositAccount(103, 10000, "2026-12-31");

        saving.displayAccountType();
        checking.displayAccountType();
        fixedDeposit.displayAccountType();
    }
}
