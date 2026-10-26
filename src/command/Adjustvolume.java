package command;

public class Adjustvolume implements Command {

    private  String volume;
    private Tv tv;

    public Adjustvolume ( Tv tv,String volume) {
        this.volume = volume;
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.Adjustvolume(volume);

    }
}
