package Revision.Observer;

public class ObserverMain {
    public static void main(String[] args) {


        Observer user1 = new CustomerDetails("venkat",new EmailNotification());
        Observer user2 = new CustomerDetails("Raman",new AppNotification());
        Observer user3 = new CustomerDetails("daniel",new SmsNotification());


        YoutubeImplementation youtube = new YoutubeImplementation();
        youtube.addObserver(user1);
        youtube.addObserver(user2);
        youtube.addObserver(user3);


        youtube.notifyObservers("the observer design pattern");

    }
}
