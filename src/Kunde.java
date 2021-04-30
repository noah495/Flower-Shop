import java.util.ArrayList;

public class Kunde {
    private final ArrayList<BlumenLaden> verfuegbareBlumenLaden;
    private final ArrayList<Blume> gekaufteBlumen = new ArrayList<>();

    String name;

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
                final ArrayList<Blume> aktuellGekaufteBlumen = blumenLaden.kaufeBlumen(blumenName, anzahl);
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

    public void addBlumen(final ArrayList<Blume> blumen) {
        gekaufteBlumen.addAll(blumen);
        //System.out.println(gekaufteBlumen.size());
    }

  /*  public Blume[] getEinkauf() {
    }*/
}
