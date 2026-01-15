import java.util.Scanner;

public class MainLsp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CompteBancaire compte = choisirCompte(scanner);

        if (compte instanceof CompteRetirable) {
            System.out.print("Montant à retirer : ");
            double montant = lireDouble(scanner);
            ((CompteRetirable) compte).retirer(montant);
        } else {
            System.out.println("Ce type de compte de permet pas les retraits immédiats.");
        }
        scanner.close();
    }

    private static CompteBancaire choisirCompte(Scanner scanner) {
        System.out.println("\n--- TYPE DE COMPTE ---");
        System.out.println("1. Compte courant");
        System.out.println("2. PEL");
        System.out.print("Choix : ");

        int choix = lireEntier(scanner);

        if (choix == 2) {
            return new PEL();
        }
        return new CompteCourant();
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

    private static double lireDouble(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrée invalide : ");
            }
        }
    }
}
