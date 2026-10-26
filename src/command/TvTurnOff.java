package command;

public class TvTurnOff implements Command {

    private Tv tv;
    public TvTurnOff(Tv tv) {
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.tvOff();
    }
}
