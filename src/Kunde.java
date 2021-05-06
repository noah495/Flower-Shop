import java.util.ArrayList;

public class Kunde {
    private final ArrayList<BlumenLaden> verfuegbareBlumenLaden;
    private final ArrayList<Blume> gekaufteBlumen = new ArrayList<>();

    private final String name;

    Kunde(final String kundenName, final ArrayList<BlumenLaden> blumenLadens) {
        this.name = kundenName;
        this.verfuegbareBlumenLaden = blumenLadens;
    }

    public void kaufeBlume(final int anzahl, final String blumenName) {
        boolean istGekauft = false;
        for (final BlumenLaden blumenLaden : verfuegbareBlumenLaden) {
            final boolean blumenVorhanden = blumenLaden.isBlumenVerfuegbar(blumenName, anzahl);
            if (blumenVorhanden) {
                System.out.println("Blumen vorhanden");
                final ArrayList<Blume> aktuellGekaufteBlumen = blumenLaden.verkaufeBlumen(blumenName, anzahl);
                addBlumen(aktuellGekaufteBlumen);
                System.out.println("Blume erfolgreich gekauft");
                System.out.println(gekaufteBlumen.size());
                // blumenLaden.setGeld(blume.getPreis());
                istGekauft = true;
                break;
            } else {
                System.out.println("Blumenladen " + blumenLaden.getLadenName() + " hat die gewünschte Blume nicht. Gehe in den Nächsten");
            }
        }
        if (istGekauft == false) {
            System.out.println("Das gewünschte Objekt ist nicht vorhanden.");
        }
    }

    public void getBlumenInfo(final String blumenName) {
        for (final BlumenLaden blumenLaden : verfuegbareBlumenLaden) {
            final boolean blumenVorhanden = blumenLaden.isBlumenVorhanden(blumenName);
            if (blumenVorhanden) {
                blumenLaden.getBlumenInfo(blumenName);
            }
        }
    }

    public void addBlumen(final ArrayList<Blume> blumen) {
        gekaufteBlumen.addAll(blumen);
        //System.out.println(gekaufteBlumen.size());
    }

    public Blume pickRandomBlumeImBlumenLaden(final String blumenLadenName) {
        for (final BlumenLaden blumenLaden : verfuegbareBlumenLaden) {
            if (blumenLaden.getLadenName().equals(blumenLadenName)) {
                final double randomBlumeStelle = Math.random() * 4;
                final int blumenStelle = (int) randomBlumeStelle;
                final String blumenName = blumenLaden.gewählteBlume(blumenStelle);
                for (final Blume blume : blumenLaden.getBlumenImBesitz()) {
                    if (blume.getName() == blumenName) {
                        return blume;
                    }
                }
            }
        }
        return null;
    }
}
//TODO: Ideen: Eingeben welcher BlumenHändler