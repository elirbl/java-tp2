import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class FacturationService {

    public void creerFacture(double montantHT, String clientName) {
        double tva = montantHT * 0.2;
        double total = montantHT + tva;

        // Affichage
        System.out.println("\n--- FACTURE ---");
        System.out.println("Date : " + LocalDate.now());
        System.out.println("Client : " + clientName);
        System.out.println("Montant HT : " + montantHT);
        System.out.println("TVA : " + tva);
        System.out.println("Total TTC : " + total);

        // Sauvegarde fichier
        try (FileWriter writer = new FileWriter("factures.txt", true)) {
            writer.write("FACTURE | " + LocalDate.now()
                    + " | Client=" + clientName
                    + " | HT=" + montantHT
                    + " | TVA=" + tva
                    + " | TTC=" + total + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
