package Strategy;

public class Creditcardpayment implements PaymentStrategy {
    @Override
    public void processpayment() {
        System.out.println("the credit card payemnt done");
    }
}
