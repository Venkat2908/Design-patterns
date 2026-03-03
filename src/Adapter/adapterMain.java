package Adapter;

public class adapterMain {
    public static void   main (String [] args){
        Mediaadapter mediaadapter = new Mediaadapter();
        mediaadapter.play("audio","audio.mp3");
        mediaadapter.play("video","Video.mp4");
    }
}
