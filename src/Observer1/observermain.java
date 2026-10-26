package Observer1;

public class observermain {
    public  static void main (String [] args){

        Youtubesubscriber alice = new Youtubesubscriber("alice");
        Youtubesubscriber bob = new Youtubesubscriber("bob");

        youtubechanneimpl channel = new youtubechanneimpl();
        channel.addsubscriber(alice);
        channel.addsubscriber(bob);


        channel.notifyvideo("the java fundamentals");
        EmailNotification emailNotification= new EmailNotification("venkatraman@gmail.com");
        channel.addsubscriber(emailNotification);
    }
}
