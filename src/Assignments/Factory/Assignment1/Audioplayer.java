package Assignments.Factory.Assignment1;

public abstract class Audioplayer {
    private int volume;
    private double playBackRate;


    public Audioplayer (int volume, double playBackRate){
        this.volume = volume;
        this.playBackRate = playBackRate;
    }



    public abstract MediaFormat supportsType();
    public abstract void play();
    public abstract void pause();
    public abstract void stop();


    public void setVolume(int volume) {

        if (volume >=0 && volume<=100){
            this.volume = volume;

        }else{
            System.out.println("Enter Invalid Volume");
        }

    }

    public int getVolume() {
        return volume;
    }

    public double getPlayBackRate() {
        return playBackRate;
    }
}
