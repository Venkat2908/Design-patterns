package Strategy;

public class PaymentProcessor {

    Paymentstrategy strategy;
    public PaymentProcessor(Paymentstrategy strategy) {
        this.strategy = strategy;

    }

    public void setStrategy(Paymentstrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment() {
        strategy.processPayment();
    }
}
