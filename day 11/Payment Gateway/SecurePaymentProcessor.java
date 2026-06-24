public abstract class SecurePaymentProcessor implements PaymentProcessor {

    protected boolean validate(double amount) {
        return amount > 0;
    }
}