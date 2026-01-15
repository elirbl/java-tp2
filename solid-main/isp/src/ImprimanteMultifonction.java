public class ImprimanteMultifonction implements Print, Scan, Fax  {
    @Override
    public void print() {
        System.out.println("Impression en cours...");
    }
    @Override
    public void scan() {
        System.out.println("Scan en cours...");
    }
    @Override
    public void fax() {
        System.out.println("Fax envoyé...");
    }
}
