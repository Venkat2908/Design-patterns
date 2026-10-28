package command;

public class TvTurnOn implements Command {

    private Tv tv;
    public TvTurnOn (Tv tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.tvOn();

    }

}
