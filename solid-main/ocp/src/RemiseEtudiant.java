public class RemiseEtudiant implements Remise {
    public double appliquer(double montant) {
        return montant * 0.8;
    }
    public String getNom() { return "Client étudiant"; }
}