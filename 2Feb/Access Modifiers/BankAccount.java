import java.util.Scanner;
public class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        String accountNumber = sc.nextLine();
        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();
        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount();
        account.accountNumber = accountNumber;
        account.accountHolder = accountHolder;
        account.setBalance(balance);
        System.out.println("Account Number: " + account.accountNumber + ", Account Holder: " + account.accountHolder + ", Balance: " + account.getBalance());
    }
}
class SavingsAccount extends BankAccount {
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber + ", Account Holder: " + accountHolder);
    }
}