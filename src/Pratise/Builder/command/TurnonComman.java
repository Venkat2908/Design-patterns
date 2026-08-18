package Pratise.Builder.command;

public class TurnonComman implements Command {

    private Tv tv;
    public TurnonComman(Tv tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.Tvon();
    }
}
