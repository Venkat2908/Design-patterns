package Pratise.Builder.command;

public class Adjustchannel implements Command {

    private Tv tv;
    private int channel;

    public Adjustchannel(Tv tv, int channel){
        this.tv = tv;
        this.channel = channel;
    }

    @Override
    public void execute() {
        tv.adjustchannel(channel);
    }
}
