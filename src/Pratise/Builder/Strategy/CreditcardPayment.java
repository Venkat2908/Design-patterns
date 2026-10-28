package Strategy;

public class CreditcardPayment implements Paymentstrategy {
    @Override
    public void processPayment() {
        System.out.println(" Credit card Payment Successful");
    }
}
