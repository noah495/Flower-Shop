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
            for (final Blume blume : blumenLaden.getBlumenImBesitz()) {
                if (blume.getName().equals(blumenName)) {
                    final ArrayList<Blume> gekaufteBlumen = blumenLaden.bestelle(anzahl);
                    System.out.println("Blume erfolgreich gekauft");
                    addBlumen(gekaufteBlumen);
                    System.out.println(gekaufteBlumen.size());
                    istGekauft = true;
                    break;
                }
            }
            if (istGekauft) {
                break;
            }
        }
        if (istGekauft == false) {
            System.out.println("Das gewünschte Objekt ist nicht vorhanden.");
        }
    }

    public String frageLadenbesitzerNachEigenschaft(final String blumeName) {
        return blumeName;
    }

    public void addBlumen(final ArrayList<Blume> blumen) {
        gekaufteBlumen.addAll(blumen);
        //System.out.println(gekaufteBlumen.size());
    }

  /*  public Blume[] getEinkauf() {
    }*/
}
