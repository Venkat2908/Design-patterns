package Pratise.Builder.Iterator;

public class Simpleplaylist implements Playlistiterator {

    private Playlist playlist;
    private  int index;

    public Simpleplaylist(Playlist playlist){
        this.playlist = playlist;
        this.index = 0;
    }
    @Override
    public boolean hasnext() {
        return index< playlist.getsongs().size();
    }

    @Override
    public String next() {
        return playlist.getsongs().get(index++);
    }
}
