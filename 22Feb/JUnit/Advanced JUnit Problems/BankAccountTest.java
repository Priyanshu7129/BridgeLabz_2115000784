import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class BankAccount {
    private double balance;
    
    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
        else throw new IllegalArgumentException("Insufficient funds");
    }
    public double getBalance() {
        return balance;
    }
}
public class BankAccountTest {
    @Test
    void testDeposit() {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        assertEquals(1000, account.getBalance());
    }
    
    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(500);
        assertEquals(500, account.getBalance());
    }
    
    @Test
    void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount();
        account.deposit(500);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(600));
    }
}
