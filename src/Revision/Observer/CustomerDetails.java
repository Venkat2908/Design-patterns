package Revision.Observer;

public class CustomerDetails implements Observer {

    private String name;
    private NotificationService notificationService;

    public CustomerDetails(String name, NotificationService notificationService) {
        this.name = name;
        this.notificationService = notificationService;
    }

    @Override
    public void update(String Video) {

        notificationService.SendNotification(name, Video);

    }
}
