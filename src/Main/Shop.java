package Main;

import java.util.Scanner;

public class Shop {
    //TODO: YAGNI, Unterschied get, set, add etc. Methoden (return, parameter...)
    //Blumen
    private final FlowerWithNickname sunflower = new FlowerWithNickname("sunflower", "sunny", 'S', 6.35, 25, true, 14, true);
    private final FlowerWithNickname tulip = new FlowerWithNickname("tulip", "tulpi", 'T', 5.67, 30, true, 2, true);
    private final Flower lotus = new Flower("lotus", 'L', 3.60, 24, true, 3, true);
    private final Flower lavender = new Flower("lavender", 'L', 2.70, 20, false, 6, true);
    private final FlowerWithStings rose = new FlowerWithStings("rose", 12, 'R', 5.95, 25, false, 5, false);
    final Flower[] flowers = {sunflower, tulip, lotus,
            lavender, rose};

    public Flower getFlower(final String name) {
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i].getName().equals(name)) {
                return flowers[i];
            }
        }
        return null;
    }

    public void infoCheck() {
        for (int i = 0; i < 1; ) {
            final Scanner infoScanner = new Scanner(System.in);
            final String nextLine = infoScanner.nextLine();

            if (nextLine.equals("done")) {
                i++;
                System.out.println("next Step");
            } else {
                for (int ii = 0; ii < flowers.length; ii++) {
                    if (flowers[ii].getName().equals(nextLine)) {
                        flowers[ii].printInfo();
                    }
                }
            }
        }
    }
}

