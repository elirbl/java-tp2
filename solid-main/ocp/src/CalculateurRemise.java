public class CalculateurRemise {
    public double calculerTotal(Remise remise, double montant) {
        return remise.appliquer(montant);
    }
}