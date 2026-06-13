public class Main {

    static {
        System.out.println("Static Here");
    }

    public static void main(String[] args) {

        BankAccount account01 = new BankAccount("kamal", 100);
        account01.deposit(20);
        System.out.println("Account Details : name " + account01.getOwner()
                + " Balance " + account01.getBalance());

        BankAccount account02 = new BankAccount("ahmed", 150);
        account02.withdraw(100);
        System.out.println("Account Details : name " + account02.getOwner()
                + " Balance " + account02.getBalance());

        BankAccount account03 = new BankAccount("mohammed", 50);
        System.out.println("Account Details : name " + account03.getOwner()
                + " Balance " + account03.getBalance());

        account01.printStatement();
        account02.printStatement();
        account03.printStatement();

        int theTotal = BankAccount.getTotalAccounts();
        System.out.println("Total Accounts: " + theTotal);
    }
}

class BankAccount {

    private String owner;
    private double balance;

    private static int totalAccounts;

    public static final double MINIMUM_BALANCE = 0.0;

    public BankAccount(String owner, double balance) {
        this.owner = owner;

        if (balance < MINIMUM_BALANCE) {
            throw new IllegalArgumentException("invalid service");
        } else {
            this.balance = balance;
        }

        totalAccounts++;
    }

    public void deposit(double amount) {
        if (amount > MINIMUM_BALANCE) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("invalid service");
        }
    }

    public void withdraw(double amount) {
        if (amount > MINIMUM_BALANCE && amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("invalid service");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void printStatement() {
        System.out.println("Account Details : " + owner + " Balance " + balance);
    }
}