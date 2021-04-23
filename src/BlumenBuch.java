import java.util.ArrayList;

public class BlumenBuch {

    public String getInformationenUeber(final String blumenName) {
        return blumenName;
    }
    Blume sonnenblume = new Blume(5.4, 50, true, 20, true);
    BlumeMitSpitznameEinheimisch tulpe = new BlumeMitSpitznameEinheimisch(true, "tulpina", 6.3, 20, true, 16, false);
    BlumeMitSpitzname rose = new BlumeMitSpitzname("rousi", 3, 15, true, 2, false);
    BlumeMitStachel loewenzahn = new BlumeMitStachel(12, 7.5, 10, true, 25, false);
    ArrayList<Blume> blumen = new ArrayList<Blume>();



    public void addBlume(Blume neueBlume) {
        blumen.add(sonnenblume);
        blumen.add(tulpe);
        blumen.add(rose);
        blumen.add(loewenzahn);
    }
}
