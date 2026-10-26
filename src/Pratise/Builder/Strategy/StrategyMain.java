package Strategy;

public class StrategyMain {
    public static void main(String[] args) {
        CreditcardPayment creditcardPayment = new CreditcardPayment();

        PaymentProcessor processor = new PaymentProcessor(creditcardPayment);
        processor.processPayment();

        DebitCardPayment debitCardPayment = new DebitCardPayment();
        ApplePayment applePayment = new ApplePayment();

        processor.setStrategy(applePayment);
        processor.processPayment();
    }
}
