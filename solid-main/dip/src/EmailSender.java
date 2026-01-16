public class EmailSender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("Email envoyé : " + message);
    }
}