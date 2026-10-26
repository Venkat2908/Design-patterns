package chainOfResponsiblity;

public class Director extends Approver {
    @Override
    public void approve(int days) {

        if (days<=14){
            System.out.println("the leaves are approved by Director");

        }
        else{
            System.out.println("the leaves are denied");
        }

    }
}
