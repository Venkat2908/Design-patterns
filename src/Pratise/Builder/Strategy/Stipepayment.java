package Pratise.Builder.Strategy;

public class Stipepayment implements PaymentStrategy {
    @Override
    public void processpayment() {
        System.out.println("The Stripe Payment done");
    }
}
