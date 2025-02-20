import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class BankingSystem {
    private Map<String, Double> accounts = new HashMap<>();
    private TreeMap<Double, String> sortedAccounts = new TreeMap<>();
    private Queue<WithdrawalRequest> withdrawalQueue = new PriorityQueue<>((a, b) -> Double.compare(a.amount, b.amount));

    public void createAccount(String accountNumber, double initialBalance) {
        accounts.put(accountNumber, initialBalance);
        sortedAccounts.put(initialBalance, accountNumber);
    }

    public void processWithdrawal(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.add(new WithdrawalRequest(accountNumber, amount));
        } else {
            System.out.println("Account not found!");
        }
    }

    public void completeWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest request = withdrawalQueue.poll();
            double currentBalance = accounts.get(request.accountNumber);
            if (currentBalance >= request.amount) {
                accounts.put(request.accountNumber, currentBalance - request.amount);
                sortedAccounts.remove(currentBalance);
                sortedAccounts.put(currentBalance - request.amount, request.accountNumber);
                System.out.println("Withdrawal completed: " + request);
            } else {
                System.out.println("Insufficient balance for: " + request);
            }
        }
    }

    public void displayAccounts() {
        System.out.println("Accounts (AccountNumber -> Balance): " + accounts);
    }

    public void displaySortedByBalance() {
        System.out.println("Accounts (Sorted by Balance): " + sortedAccounts);
    }

    public static void main(String[] args) {
        BankingSystem system = new BankingSystem();
        system.createAccount("ACC123", 1000.0);
        system.createAccount("ACC456", 1500.0);
        system.createAccount("ACC789", 500.0);

        system.processWithdrawal("ACC123", 200.0);
        system.processWithdrawal("ACC456", 300.0);
        system.processWithdrawal("ACC789", 50.0);

        system.completeWithdrawals();

        system.displayAccounts();
        system.displaySortedByBalance();
    }
}

class WithdrawalRequest {
    String accountNumber;
    double amount;

    public WithdrawalRequest(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "WithdrawalRequest{" +
                "accountNumber='" + accountNumber + '\'' +
                ", amount=" + amount +
                '}';
    }
}
