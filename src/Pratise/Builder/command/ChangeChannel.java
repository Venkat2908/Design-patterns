package command;

public class ChangeChannel implements Command {

    private String channel;
    private Tv tv ;
    public ChangeChannel(Tv tv, String channel){
        this.channel = channel;
        this.tv = tv;
    }
    @Override
    public void execute() {

        tv.ChangeChannel(channel);
    }
}
