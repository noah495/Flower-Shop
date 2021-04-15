package Main;

import java.util.Scanner;

public class Kaeufer {
    private final Shop shop = new Shop();

    public void blumeKaufen() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Which plant do you want to buy?");

        //TODO: (3rd Step) Shorten
        for (int i = 0; i < 1; ) {
            final String nextLine = scanner.nextLine();
            if (nextLine.equals("y")) {
                i++;
                System.out.println("next Step");
            } else {
                for (int ii = 0; ii < shop.blumen.length; ii++) {
                    if (shop.getFlower(nextLine) == shop.blumen[ii]) {
                        System.out.println("Success");

                        shop.blumen[ii].setIstGekauft(true);
                        shop.blumen[ii].setMengeImBesitz(2);
                    }
                }
            }
        }
    }
}