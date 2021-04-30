import java.util.ArrayList;
import java.util.Scanner;

public class BlumenBuch {

    private final Blume sonnenblume = new Blume("sonnenblume", 5.4, 50, true, 20, true);
    private final BlumeMitSpitznameEinheimisch tulpe = new BlumeMitSpitznameEinheimisch("tulpe", true, "tulpina", 6.3, 20, true, 16, false);
    private final BlumeMitSpitzname rose = new BlumeMitSpitzname("rose", "rousi", 3, 15, true, 2, false);
    private final BlumeMitStachel loewenzahn = new BlumeMitStachel("loewenzahn", 12, 7.5, 10, true, 25, false);
    private final ArrayList<Blume> blumen = new ArrayList<>();

    public ArrayList<Blume> getBlumen() {
        return blumen;
    }

    public String getInformationenUeber(final String blumenName) {
        return blumenName;
    }

    public void myFlowers() {
        blumen.add(sonnenblume);
        blumen.add(tulpe);
        blumen.add(rose);
        blumen.add(loewenzahn);
    }

    public String getInformationenUeber() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Über welche Blume möchten Sie Informationen erhalten");
        for (final int ii = 0; ii < 1; ) {

            final String abfrage = scanner.nextLine();
            for (int i = 0; i < blumen.size(); i++) {
                final String name = blumen.get(i).name;

                if (abfrage.equals(name)) {

                } else {
                    System.out.println("ungültige Eingabe, versuchen Sie es nochmals");
                }
            }
        }
        // return null;
    }

    public String getBlumenName(final String blumenName) {
        for (final int ii = 0; ii < 1; ) {

            for (int i = 0; i < blumen.size(); i++) {
                if (blumenName.equals(blumen.get(i).name)) {
                    final String name = blumen.get(i).name;
                    return name;
                } else {
                    System.out.println("ungültige Eingabe, versuchen Sie es nochmals");
                }
            }
        }
    }
}


