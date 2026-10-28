package Assignments.Factory.Assignment1;

public class WavPlayer extends  Audioplayer {

    public  WavPlayer(int volume,double playbackrate){
        super(volume,playbackrate);
    }
    @Override
    public MediaFormat supportsType() {
        return MediaFormat.WAV;
    }

    @Override
    public void play() {
        System.out.println("the WAV player is playing");

    }

    @Override
    public void pause() {
        System.out.println("the WAV player is Paused");

    }

    @Override
    public void stop() {

        System.out.println("the WAV player is Stopped");

    }
}
