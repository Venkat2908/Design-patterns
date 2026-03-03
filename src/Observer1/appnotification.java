package Observer1;

public class appnotification implements Subscriber {

    private  String appname;

    public appnotification(String appname) {
        this.appname = appname;
    }

    @Override
    public void update(String video) {
        System.out.println(appname+"the app is notified with the video:"+video);
    }
}
