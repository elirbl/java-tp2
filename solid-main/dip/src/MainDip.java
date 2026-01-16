import java.util.Scanner;

public class MainDip {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Envoyer un email");
            System.out.println("2. Envoyer un SMS");
            System.out.println("3. Envoyer une notification push");
            System.out.println("0. Quitter");
            System.out.print("Choix : ");

            int choix = lireEntier(scanner);
            if (choix == 0) break;

            System.out.print("Message : ");
            String message = scanner.nextLine();

            MessageSender senderChoisi = switch (choix) {
                case 1 -> new EmailSender();
                case 2 -> new SmsSender();
                case 3 -> new PushNotificationSender();
                default -> null;
            };

            if (senderChoisi != null) {
                NotificationService service = new NotificationService(senderChoisi);
                service.envoyer(message);
            } else {
                System.out.println("Choix invalide");
            }
        }

        scanner.close();
    }

    private static int lireEntier(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrée invalide : ");
            }
        }
    }
}
