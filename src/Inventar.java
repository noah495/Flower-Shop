import java.util.ArrayList;

public class Inventar {
    private final ArrayList<Blume> blumenImBesitz = new ArrayList<>();
    private double fluessigesGeldmittel = 223400;

    //TODO: printBlumenInfo return String
    public void printBlumenInfo(final String blumenName) {
        for (final Blume blume : blumenImBesitz) {
            if (blume.getName().equals(blumenName)) {
                System.out.println("Information zur " + blume.getName());
                System.out.println("Ideale Temperatur: " + blume.getRecommendedTemperature());
                System.out.println("Preis: " + blume.getPrice());
                System.out.println("Licht nötig: " + blume.getLightRequired());
                System.out.println("Kaufgrösse: " + blume.getSizeInCm());
                break;
            }
        }
    }

    public ArrayList<Blume> getBlumenZumVerkaufen(final String blumenName, final int anzahl) {
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

    public int getAnzahlBlumen() {
        final int getSizeBlumen = getBlumenImBesitz().size();
        return getSizeBlumen;
    }

    //TODO: In Englisch umbenennen
    public String chooseBlume(final int stelle) {
        if (blumenImBesitz.size() >= stelle) {
            final Blume gewählteBlume = blumenImBesitz.get(stelle);
            final String blumenName = gewählteBlume.getName();
            return blumenName;
        }
        return null;
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

