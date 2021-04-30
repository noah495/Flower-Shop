import java.util.ArrayList;

public class Main {
    public static void main(final String[] args) {
        final Inventar inventar = new Inventar();
        final BlumenHaendler blumenHaendlerHansMitTulpe = new BlumenHaendler("tulpe");
        final BlumenHaendler blumenHaendlerMaxMitRose = new BlumenHaendler("rose");
        final BlumenHaendler blumenHaendlerOliviaMitSonnenblume = new BlumenHaendler("sonnenblume");
        final BlumenHaendler blumenHaendlerAnaMitLoewenzahn = new BlumenHaendler("loewenzahn");
        final ArrayList<BlumenHaendler> verfuegbareBlumenHaendler = new ArrayList<>();
        verfuegbareBlumenHaendler.add(blumenHaendlerHansMitTulpe);
        verfuegbareBlumenHaendler.add(blumenHaendlerMaxMitRose);
        verfuegbareBlumenHaendler.add(blumenHaendlerOliviaMitSonnenblume);
        verfuegbareBlumenHaendler.add(blumenHaendlerAnaMitLoewenzahn);

        final BlumenLaden blumenLadenGiswilerBergblume =
                new BlumenLaden("Giswiler Bergblume", "Seestrasse 4, Giswil", verfuegbareBlumenHaendler);
        final BlumenLaden blumenLadenRoeoesliUusAllerWelt =
                new BlumenLaden("Röösli uus aller Welt", "Bahnhofstrasse 49, Weggis", verfuegbareBlumenHaendler);

        final ArrayList<BlumenLaden> verfuegbareBlumenLaden = new ArrayList<>();
        verfuegbareBlumenLaden.add(blumenLadenGiswilerBergblume);
        verfuegbareBlumenLaden.add(blumenLadenRoeoesliUusAllerWelt);

        final Kunde kunde = new Kunde("Joseph", verfuegbareBlumenLaden);

        blumenLadenGiswilerBergblume.bestelleBlumen(20, "rose");
        blumenLadenGiswilerBergblume.bestelleBlumen(300, "tulpe");
        kunde.kaufeBlume(2, "rose");
    }
}



