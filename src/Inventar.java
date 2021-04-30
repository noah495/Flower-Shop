import java.util.ArrayList;

public class Inventar {
    private final ArrayList<Blume> blumenImBesitz = new ArrayList<>();
    private double fluessigesGeldmittel = 223400;

    public void printBlumenInfo(final String blumenName) {
        for (final Blume blume : blumenImBesitz) {
            if (blume.getName().equals(blumenName)) {
                System.out.println("Information zur " + blume.getName());
                System.out.println("Ideale Temperatur: " + blume.getBevorzugteTemperatur());
                System.out.println("Preis: " + blume.getPreis());
                break;
            }
        }
    }

    public ArrayList<Blume> getBlumeZumVerkaufen(final String blumenName, final int anzahl) {
        final ArrayList<Blume> blumen = new ArrayList<>();
        for (final Blume blume : blumenImBesitz) {
            if (blume.getName().equals(blumenName)) {
                blumen.add(blume);

                if (blumen.size() == anzahl) {
                    break;
                }
            }
        }
        return blumen;
    }

    public boolean isBlumenVerfuegbar(final String blumenName, final int anzahl) {
        int i = 0;
        for (final Blume blume : blumenImBesitz) {
            if (blume.getName().equals(blumenName)) {
                i++;
                if (i == anzahl) {
                    return true;
                }
            }
        }
        return false;
    }

    public ArrayList<Blume> getBlumenImBesitz() {
        return blumenImBesitz;
    }

    public void addBlumen(final ArrayList<Blume> blumen) {
        blumenImBesitz.addAll(blumen);
    }

    public void printBlumen() {
        final ArrayList<String> vorhandeneBlumen = new ArrayList<>();
        for (final Blume blume : blumenImBesitz) {
            if (!vorhandeneBlumen.contains(blume.getName())) {
                vorhandeneBlumen.add(blume.getName());
            }
        }
        vorhandeneBlumen.forEach(System.out::println);
    }

    public double getFluessigesGeldmittel() {
        return fluessigesGeldmittel;
    }

    public void setFluessigesGeldmittel(final double geld) {
        this.fluessigesGeldmittel = geld;
    }


    /*public int anzahl(final String blumenName) {

    }*/
}

//TODO: Mehr Blumen erzeugen; Kunde --> kauft in Blumenladen Giswil 3x Tulpen; DONE;
//TODO: Freitag: Methodenaufruf auf Objekt und verwendung des Rückgabewertes;