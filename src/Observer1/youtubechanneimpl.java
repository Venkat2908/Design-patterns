package Observer1;

import java.util.ArrayList;
import java.util.List;

public class youtubechanneimpl implements Youtube {

    private List<Subscriber> subscribers = new ArrayList<>();
    private  String video;

    @Override
    public void addsubscriber(Subscriber subscriber) {
     subscribers.add(subscriber);
    }

    @Override
    public void removesubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifyall() {

        for (Subscriber subscriber: subscribers){
            subscriber.update(video);
        }

    }
    public  void notifyvideo(String video){
        this.video = video;
        notifyall();
    }
}
