package chainOfResponsiblity;

public class Manager extends Approver {
    @Override
    public void approve(int days) {

        if (days <= 7){
            System.out.println("the leaved sare approved by manager");
        }
        else if (nextapprover!=null){
            nextapprover.approve(days);
        }

    }
}
