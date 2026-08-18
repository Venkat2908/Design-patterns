package Assignments.Factory.Assignment1;

public class Mp3player extends Audioplayer {


    public  Mp3player(int volume, double playbackrate){
        super(volume,playbackrate);
    }
    @Override
    public MediaFormat supportsType() {
        return MediaFormat.MP3;
    }

    @Override
    public void play() {
        System.out.println("the MP3 player is playing");

    }

    @Override
    public void pause() {
        System.out.println("the MP3 player is paused");

    }

    @Override
    public void stop() {
        System.out.println("the MP3 player is stopped");

    }
}
