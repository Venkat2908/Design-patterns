package chainOfResponsiblity;

public class Chainmain {
    public static void main (String[] args){
        Approver venkat = new Supervisor();

        Approver venkat2 = new Manager();
        Approver venkat3 = new Director();

        venkat.setNextapprover(venkat2);
        venkat2.setNextapprover(venkat3);
        venkat.approve(15);
    }
}
