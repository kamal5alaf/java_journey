public class Main {

    public Main() {
        // Constructor
    }

    public static void main(String[] args) {


        PaymentProcessor p1 = new CreditCardProcessor("4561", "AAAAA BBBBBB CCCCC");
        PaymentProcessor p2 = new PayPalProcessor("aaaaa@gmail.com");
        PaymentProcessor p3 = new CryptoProcessor("kamal1112223344");
        PaymentProcessor[] PaymentTypes = new PaymentProcessor[]{p1, p2, p3};


        for (PaymentProcessor P : PaymentTypes) {
            System.out.println(P.getClass());
            P.processPayment(150);
            P.refund(-50, " it not enough");
            P.logTransaction("The Transaction is done successfully");
            System.out.println("**********************************");
        }
    }
}
