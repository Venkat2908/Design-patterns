package Strategy;

public class Strategymain {
    public static  void  main (String [] args){
        Creditcardpayment creditcard = new Creditcardpayment();
        Debitcardpayment debitcardpayment = new Debitcardpayment();
        Applepayment applepayment = new Applepayment();
        Stipepayment stipepayment = new Stipepayment();

        PaymentProcessor processor = new PaymentProcessor(creditcard);

        processor.payment();
        processor.setPaymentStrategy(debitcardpayment);
        processor.payment();
    }
}
