public class RemiseVIP implements Remise {
    public double appliquer(double montant) {
        return montant * 0.5;
    }
    public String getNom() { return "Client VIP"; }
}