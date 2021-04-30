import java.util.ArrayList;

public class BlumenLaden {
    private final String ladenName;
    private final String adresse;
    private final Inventar inventar;
    //Bei Kunde anwenden
    private final ArrayList<BlumenHaendler> verfuegbareBlumenHaendler;
    private final ArrayList<Blume> bestellteBlumen = new ArrayList<>();

    BlumenLaden(final String ladenName, final String adresse, final ArrayList<BlumenHaendler> blumenHaendlers) {
        this.ladenName = ladenName;
        this.adresse = adresse;
        this.verfuegbareBlumenHaendler = blumenHaendlers;

        this.inventar = new Inventar();
    }

    public ArrayList<Blume> kaufeBlumen(final String blumenName, final int anzahl) {
        return inventar.getBlumeZumVerkaufen(blumenName, anzahl);
    }

    public boolean isBlumenVerfuegbar(final String blumenName, final int anzahl) {
        return inventar.isBlumenVerfuegbar(blumenName, anzahl);
    }

    public String getLadenName() {
        return ladenName;
    }

    public Inventar getInventar() {
        return inventar;
    }

    public double getGeld() {
        return inventar.getFluessigesGeldmittel();
    }

    public void setGeld(final double geld) {
        inventar.setFluessigesGeldmittel(geld);
    }

    // Bei Kunde anwenden
    public void bestelleBlumen(final int anzahl, final String blumenName) {
        verfuegbareBlumenHaendler.forEach(blumenHaendler -> {
            if (blumenHaendler.getSpezialisierteBlume().equals(blumenName)) {
                final ArrayList<Blume> bestellteBlumen = blumenHaendler.bestelle(anzahl);
                System.out.println("Blume erfolgreich bestellt");
                inventar.addBlumen(bestellteBlumen);
                System.out.println("Blumen erfolgreich dem Inventar hinzugefügt");
                System.out.println(bestellteBlumen.size());
            }
        });
    }

    public ArrayList<Blume> getBestellteBlumen() {
        return bestellteBlumen;
    }

    public ArrayList<Blume> getBlumenImBesitz() {
        return inventar.getBlumenImBesitz();
    }

    public ArrayList<Blume> bestelle(final int anzahl) {
        final ArrayList<Blume> gekaufteBlumen = new ArrayList<>();
        for (int i = 0; i < anzahl; i++) {
            gekaufteBlumen.add(getBlumenImBesitz().get(i));
        }
        return gekaufteBlumen;
    }

    public void printInformation(final String blumeName) {
        inventar.printBlumenInfo(blumeName);
    }
}



