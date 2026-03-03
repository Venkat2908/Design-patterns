package Iterator;

public class Favouriteplaylist implements Playlistiterator  {
    private  Playlist playlist;
    private  int index;

    public Favouriteplaylist(Playlist playlist){
        this.playlist = playlist;
        this.index =0;
    }
    @Override
    public boolean hasnext() {
        while (index< playlist.getsongs().size()){
            if (playlist.getsongs().get(index).contains("fav")){
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public String next() {
        return playlist.getsongs().get(index++);
    }
}
