package chainOfResponsiblity;

public abstract class Approver {

    public Approver nextapprover;

    public void setNextapprover(Approver nextapprover) {
        this.nextapprover = nextapprover;
    }

    public abstract void approve(int days);
}
