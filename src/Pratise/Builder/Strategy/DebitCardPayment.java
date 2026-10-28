package Strategy;

public class DebitCardPayment implements Paymentstrategy {
    @Override
    public void processPayment() {
        System.out.println("DebitCardPayment");
    }
}
