import java.util.*;
class Account {
    int acc_no;
    double bal;

    Account(int acc_no, double bal) {
        this.acc_no = acc_no;
        this.bal = bal;
    }
}
class Customer {
    String name;
    List<Account> acc_list = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }
}
class Bank {
    String name;
    List<Customer> c_list = new ArrayList<>();

    Bank(String name) {
        this.name = name;
    }
    void openAccount(Customer c, Account a) {
        c.acc_list.add(a);
        if (!c_list.contains(c))
            c_list.add(c);
    }
}
class BankAndAccountHolders{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank(sc.nextLine());
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            Customer cust = new Customer(sc.nextLine());
            int m = sc.nextInt();

            for (int j = 0; j < m; j++)
                bank.openAccount(cust, new Account(sc.nextInt(), sc.nextDouble()));

            sc.nextLine();
        }
        for (Customer c : bank.c_list) {
            System.out.println(c.name + "'s Accounts:");
            for (Account acc : c.acc_list)
                System.out.println("Account No: " + acc.acc_no + ", Balance: ₹" + acc.bal);
        }

        sc.close();
    }
}