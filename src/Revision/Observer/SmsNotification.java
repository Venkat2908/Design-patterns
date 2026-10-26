package Revision.Observer;

public class SmsNotification implements NotificationService {
    @Override
    public void SendNotification(String name, String Video) {
        System.out.println(
                "Sms sent to " + name +
                        ": New video uploaded - " + Video
        );
    }
}
