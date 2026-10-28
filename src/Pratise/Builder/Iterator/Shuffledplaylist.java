package Pratise.Builder.Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffledplaylist implements Playlistiterator {

    private Playlist playlist;
    private int index;
    private List<String> shuffledsongs;

    public Shuffledplaylist(Playlist playlist){
        this.playlist = playlist;
        this.index =0;
        this.shuffledsongs = new ArrayList<>(playlist.getsongs());
        Collections.shuffle(shuffledsongs);
    }
    @Override
    public boolean hasnext() {
        return index<shuffledsongs.size();
    }

    @Override
    public String next() {
        return shuffledsongs.get(index++);
    }
}
