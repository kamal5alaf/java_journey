public class CryptoProcessor implements PaymentProcessor {
    private String walletAddress;

    public CryptoProcessor(String walletAddress) {
        this.walletAddress = walletAddress;
    }


    @Override
    public boolean processPayment(double amount) {
        if (amount > 0) {
            System.out.println("Charging $[" + amount + "] to wallet Address [" + walletAddress + "]");
            return true;
        } else {
            logTransaction("Rejected: invalid amount");
            return false;
        }
    }

    @Override
    public boolean refund(double amount, String reason) {
        if (amount <= 0) {
            logTransaction("Rejected refund: invalid amount");
            return false;
        }

        System.out.println("Refunding $" + amount + " to wallet " + walletAddress + ". Reason: " + reason);
        return true;
    }


}
