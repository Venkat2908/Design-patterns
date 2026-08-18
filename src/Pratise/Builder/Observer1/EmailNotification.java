package Pratise.Builder.Observer1;

public class EmailNotification implements Subscriber {

    private  String email;

    public EmailNotification(String email) {

        this.email = email;
    }

    @Override
    public void update(String video) {
        System.out.println(email+"The email is send for the video"+video);
    }
}

