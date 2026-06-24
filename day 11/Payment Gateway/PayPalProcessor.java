public class PayPalProcessor implements PaymentProcessor {

    private String email;

    public PayPalProcessor(String email) {
        this.email = email;
    }

    @Override
    public boolean processPayment(double amount) {
        if (amount > 0) {
            System.out.println("Charging $[" + amount + "] to Email [" + email + "]");
            return true;
        } else {
            logTransaction("Rejected: invalid amount");
            return false;
        }
    }

    @Override
    public boolean refund(double amount, String reason) {
        if (amount <= 0) {
            logTransaction("Rejected: invalid amount");
            return false;
        }
        System.out.println("Refunding $[" + amount + "] to card [" + email + "]. Reason: [" + reason + "]");

        return true;
    }
}
