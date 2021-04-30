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
        verfuegbareBlumenLaden.forEach(blumenLaden -> {
            if (blumenLaden.getBlumenImBesitz().equals(blumenName)) {
                final ArrayList<Blume> gekaufteBlumen = blumenLaden.bestelle(anzahl);
                System.out.println("Blume erfolgreich bestellt");
                addBlumen(gekaufteBlumen);
                System.out.println("Blumen erfolgreich dem Inventar hinzugefügt");
                System.out.println(gekaufteBlumen.size());
            }
        });
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
