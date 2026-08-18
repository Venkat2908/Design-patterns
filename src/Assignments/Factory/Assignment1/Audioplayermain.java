package Assignments.Factory.Assignment1;

public class Audioplayermain {
    public  static  void main (String [] args){

        AudioPlayerFactory factory = new AudioPlayerFactory();
      Audioplayer audioplayer =   factory.createfactory(MediaFormat.MP3,10,2.0);
      System.out.println(audioplayer.getPlayBackRate());
      audioplayer.play();
      audioplayer.pause();
      audioplayer.stop();
    }
}
