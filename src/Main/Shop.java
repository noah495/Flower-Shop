package Main;

import java.util.Scanner;

public class Shop {

    //Blumen
    private final BlumeMitSpitzname sunflower = new BlumeMitSpitzname("sunflower", "sunny", 'S', 6.35, 25, true, 14, true);
    private final BlumeMitSpitzname tulip = new BlumeMitSpitzname("tulip", "tulpi", 'T', 5.67, 30, true, 2, true);
    private final Blume lotus = new Blume("lotus", 'L', 3.60, 24, true, 3, true);
    private final Blume lavender = new Blume("lavender", 'L', 2.70, 20, false, 6, true);
    private final BlumeMitStacheln rose = new BlumeMitStacheln("rose", 12, 'R', 5.95, 25, false, 5, false);
    // boolean imBesitz = false;
    protected final Blume[] blumen = {sunflower, tulip, lotus,
            lavender, rose};

    public Blume getFlower(final String name) {
        for (int i = 0; i < blumen.length; i++) {
            if (blumen[i].getName().equals(name)) {
                return blumen[i];
            }
        }
        return null;
    }

    public void infoCheck() {
        for (int i = 0; i < 1; ) {
            final Scanner infoScanner = new Scanner(System.in);
            final String nextLine = infoScanner.nextLine();

            if (nextLine.equals("y")) {
                i++;
                System.out.println("next Step");
            } else {
                for (int ii = 0; ii < blumen.length; ii++) {
                    if (blumen[ii].getName().equals(nextLine)) {
                        blumen[ii].printInfo();
                    }
                }
            }
        }
    }
}

