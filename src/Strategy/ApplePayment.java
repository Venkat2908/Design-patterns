package Strategy;

public class ApplePayment implements Paymentstrategy  {
    @Override
    public void processPayment() {
        System.out.println("Apple Payment");
    }
}
