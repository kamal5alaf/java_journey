public class CreditCardProcessor extends SecurePaymentProcessor {
    private String last4Digits;
    private String holderName;

    public CreditCardProcessor(String last4Digits, String holderName) {
        this.last4Digits = last4Digits;
        this.holderName = holderName;
    }


    @Override
    public boolean processPayment(double amount) {
        if (validate(amount)) {
            System.out.println("Charging $[" + amount + "] to card ending [" + last4Digits + "]");
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
        System.out.println("Refunding $[" + amount + "] to card [" + last4Digits + "]. Reason: [ " + reason + "]");
        return true;
    }
}
