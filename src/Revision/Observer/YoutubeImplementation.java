package Revision.Observer;

import java.util.ArrayList;

public class YoutubeImplementation implements Subject {

    private ArrayList<Observer> observers = new ArrayList<>();
    private String video;


    @Override
    public void addObserver(Observer o) {
        observers.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);

    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(video);
        }


    }

    public void notifyObservers(String Video) {

        System.out.println("new Video uploaded: "+Video);
        this.video = Video;
        notifyObservers();

    }
}
