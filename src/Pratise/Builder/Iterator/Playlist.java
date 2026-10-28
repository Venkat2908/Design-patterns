package Pratise.Builder.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    List<String> songs;

    public Playlist (){
        songs = new ArrayList<>();
    }

    public  void addsongs(String song){
        songs.add(song);

    }

    public List<String> getsongs(){
        return  songs;
    }

    public Playlistiterator playlistiterator(Playlisttype type){
        switch (type){
            case SIMPLE -> {
                return new Simpleplaylist(this);
            }
            case SHUFFLED -> {
                return  new Shuffledplaylist(this);
            }
            case FAVOURITE -> {
                return new Favouriteplaylist(this);
            }
            default -> {
                return null;
            }
        }
    }
}
