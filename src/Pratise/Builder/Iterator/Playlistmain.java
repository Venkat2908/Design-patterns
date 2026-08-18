package Pratise.Builder.Iterator;

public class Playlistmain {
    public static  void main (String [] args){
        Playlist playlist = new Playlist();

        playlist.addsongs("songs1");
        playlist.addsongs("songs2");
        playlist.addsongs("songs3 fav");
        playlist.addsongs("songs 4");
        playlist.addsongs("song 5 fav");

        System.out.println("The simple playlist");
        Playlistiterator playlistiterator = playlist.playlistiterator(Playlisttype.SIMPLE);

        while (playlistiterator.hasnext()){
            System.out.println("The Current song is"+playlistiterator.next());
        }
        System.out.println("The Shuffled playlist");
        Playlistiterator shuffle = playlist.playlistiterator(Playlisttype.SHUFFLED);

        while (shuffle.hasnext()){
            System.out.println("The Current song is"+shuffle.next());
        }
        System.out.println("The favourite playlist");
        Playlistiterator fav = playlist.playlistiterator(Playlisttype.FAVOURITE);

        while (fav.hasnext()){
            System.out.println("The Current song is"+fav.next());
        }
    }
}
