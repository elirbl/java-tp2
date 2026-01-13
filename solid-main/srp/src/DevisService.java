import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class DevisService {

    public void creerDevis(double montantHT) {
        double tva = montantHT * 0.2;
        double total = montantHT + tva;

        // Affichage
        System.out.println("\n--- DEVIS ---");
        System.out.println("Date : " + LocalDate.now());
        System.out.println("Montant HT : " + montantHT);
        System.out.println("TVA : " + tva);
        System.out.println("Total TTC : " + total);
        System.out.println("Valable 30 jours");

        // Sauvegarde fichier
        try (FileWriter writer = new FileWriter("devis.txt", true)) {
            writer.write("DEVIS | " + LocalDate.now()
                    + " | HT=" + montantHT
                    + " | TVA=" + tva
                    + " | TTC=" + total
                    + " | validite=30j\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
