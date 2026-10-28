package Assignments.Factory.Assignment1;

public class Flacplayer extends Audioplayer {

    public  Flacplayer(int volume,double playBackrate){
        super(volume,playBackrate);
    }
    @Override
    public MediaFormat supportsType() {
        return MediaFormat.FLAC;
    }

    @Override
    public void play() {
        System.out.println("the flac player is playing");

    }

    @Override
    public void pause() {
        System.out.println("the flac player is paused");
    }

    @Override
    public void stop() {
        System.out.println("the flac player is Stopped");

    }
}
