
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