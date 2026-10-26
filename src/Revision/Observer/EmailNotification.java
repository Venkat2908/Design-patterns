package Revision.Observer;

public class EmailNotification implements NotificationService {
    @Override
    public void SendNotification(String name, String Video) {
        System.out.println(
                "Email sent to " + name +
                        ": New video uploaded - " + Video
        );
    }
}
