public interface PaymentProcessor {
    boolean processPayment(double amount);

    boolean refund(double amount, String reason);

    default void logTransaction(String msg) {
        System.out.println("[TRANSACTION]" + msg);
    }

}
