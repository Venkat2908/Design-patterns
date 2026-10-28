package Pratise.Builder.Strategy;

public class Applepayment implements PaymentStrategy {
    @Override
    public void processpayment() {
        System.out.println("The Apple payment done");
    }
}
