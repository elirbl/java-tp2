import java.util.Scanner;
import java.util.*;

public class MainOCP {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculateurRemise calculateur = new CalculateurRemise();

        List<Remise> remisesDisponibles = Arrays.asList(
          new RemiseStandard(),
          new RemiseEtudiant(),
          new RemiseVIP()
        );

        boolean quitter = false;

        while (!quitter) {
            System.out.println("\n--- MENU ---");
            for (int i = 0; i < remisesDisponibles.size(); i++) {
                System.out.println((i + 1) + ". " + remisesDisponibles.get(i).getNom());
            }
            System.out.println("0. Quitter");
            System.out.print("Choix : ");

            int choix = lireEntier(scanner);

            if (choix == 0) {
                quitter = true;
                continue;
            }

            if (choix > 0 && choix <= remisesDisponibles.size()) {
                System.out.print("Montant HT :");
                double montant = lireDouble(scanner);

                Remise strategy = remisesDisponibles.get(choix - 1);
                double total = calculateur.calculerTotal(strategy, montant);

                System.out.println("Montant après remise : " + total);
            } else {
                System.out.print("Choix invalide.");
            }
        }
        scanner.close();
    }

    private static int lireEntier(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrée invalide. Recommencez : ");
            }
        }
    }

    private static double lireDouble(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrée invalide. Recommencez : ");
            }
        }
    }
}
