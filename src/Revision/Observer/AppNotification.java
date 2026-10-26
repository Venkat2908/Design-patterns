package Revision.Observer;

public class AppNotification implements NotificationService {
    @Override
    public void SendNotification(String name, String Video) {
        System.out.println(
                "App sent to " + name +
                        ": New video uploaded - " + Video
        );

    }
}
