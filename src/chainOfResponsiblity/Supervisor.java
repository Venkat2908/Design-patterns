package chainOfResponsiblity;

public class Supervisor extends Approver {

    @Override
    public void approve(int days) {

        if (days<=3 ){
            System.out.println("the leave is approved by supervisor");
        }
        else if (nextapprover!=null){
            nextapprover.approve(days);
        }

    }
}
