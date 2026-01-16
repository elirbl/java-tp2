public class PushNotificationSender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("Notification push envoyée : " + message);
    }
}