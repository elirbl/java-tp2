public class RemiseStandard implements Remise {
    public double appliquer(double montant) {
        return montant;
    }
    public String getNom() { return "Client standard"; }
}