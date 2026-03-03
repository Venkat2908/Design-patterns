package Observer1;

public class Youtubesubscriber implements Subscriber {
    private  String name;

    public Youtubesubscriber(String name) {
        this.name = name;
    }


    @Override
    public void update(String video) {
        System.out.println(name +" is watching "+video);
    }
}
