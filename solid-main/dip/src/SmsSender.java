public class SmsSender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("SMS envoyé : " + message);
    }
}