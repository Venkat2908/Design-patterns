package command;

public class AdjustVolume implements Command {
    private  Tv tv;
    private int volume;

    public  AdjustVolume (Tv tv, int volume){
        this.tv = tv;
        this.volume = volume;
    }
    @Override
    public void execute() {
        tv.adjustvolume(volume);

    }
}
