package Adapter;

public class Mediaadapter implements MediaPlayer {

    Audioplayer audioplayer = new Audioplayer();
    Videoplayer videoplayer = new Videoplayer();
    @Override
    public void play(String mediatype, String filename) {

        if (mediatype.equalsIgnoreCase("audio")){
            audioplayer.playaudio(filename);
        } else if (mediatype.equalsIgnoreCase("video")) {
            videoplayer.playvideo(filename);
        }
        else{
            System.out.println("invalid media type"+mediatype);
        }

    }

    }

