import java.util.ArrayList;

public class BlumenHaendler {
    private final String spezialisierteBlume;
    private final ArrayList<Blume> blumenBeimHaendler = new ArrayList<>();

    BlumenHaendler(final String blumeName) {
        this.spezialisierteBlume = blumeName;
        createBlumen(3000);
    }

    public ArrayList<Blume> bestelle(final int anzahl) {
        final ArrayList<Blume> zuLieferndeBlumen = new ArrayList<>();
        for (int i = 0; i < anzahl; i++) {
            zuLieferndeBlumen.add(blumenBeimHaendler.get(i));
        }
        return zuLieferndeBlumen;
    }

    private void createBlumen(final int anzahl) {
        switch (spezialisierteBlume) {
            case "rose":
                for (int i = 0; i < anzahl; i++) {
                    blumenBeimHaendler.add(new BlumeMitStachel("rose", 12, 5.6, 30, true,
                            20, true));
                }
            case "tulpe":
                for (int i = 0; i < anzahl; i++) {
                    blumenBeimHaendler.add(new BlumeMitSpitznameEinheimisch("tulpe", true,
                            "tulpi", 6.9, 14, true, 10, false));
                }
            case "sonnenblume":
                for (int i = 0; i < anzahl; i++) {
                    blumenBeimHaendler.add(new BlumeMitSpitzname("sonnenblume", "sunny", 11, 43,
                            true, 25, true));
                }
            case "loewenzahn":
                for (int i = 0; i < anzahl; i++) {
                    blumenBeimHaendler.add(new Blume("loewenzahn", 1.6, 9, true,
                            20, true));
                }
        }
    }

    public String getSpezialisierteBlume() {
        return spezialisierteBlume;
    }
}

