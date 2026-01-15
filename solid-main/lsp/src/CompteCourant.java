public class CompteCourant extends CompteBancaire implements CompteRetirable {
    @Override
    public void retirer(double montant) {
        solde -= montant;
        System.out.println("Retrait effectué. Nouveau solde : " + solde);
    }
}
