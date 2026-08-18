package Pratise.Builder.Strategy;

public class Debitcardpayment implements PaymentStrategy {
    @Override
    public void processpayment() {
        System.out.println("the debit card payment done");
    }
}
