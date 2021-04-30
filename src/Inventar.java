import java.util.ArrayList;

public class Inventar {
    private final ArrayList<Blume> blumenImBesitz = new ArrayList<>();
    private BlumenBuch blumenBuch;

    public void setBlumenBuch(final BlumenBuch blumenBuch) {
        this.blumenBuch = blumenBuch;
    }

    public ArrayList<Blume> getBlumenImBesitz() {
        return blumenImBesitz;
    }

    public void addBlumen(final ArrayList<Blume> blumen) {
        blumenImBesitz.addAll(blumen);
    }
}

//TODO: Mehr Blumen erzeugen; Kunde --> kauft in Blumenladen Giswil 3x Tulpen;
//TODO: Freitag: Methodenaufruf auf Objekt und verwendung des Rückgabewertes;