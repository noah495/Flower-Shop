package Main;

import java.util.Scanner;

public class Kaeufer {
    private final Shop shop = new Shop();

    public void blumeKaufen() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Which plant do you want to buy?");
        System.out.println("tulip\n" +
                "lavender\n" +
                "rose");
        final String nextLine = scanner.nextLine();
        switch (nextLine) {
            //TODO: (3rd Step) Shorten
            case "tulip":
                final Blume tulip = shop.getFlower("tulip");
                tulip.setIstGekauft(true);
                tulip.setMengeImBesitz(1);
                break;
            case "lavender":
                // TODO: (1st Step) Make like tulip
                final Blume lavender = shop.getFlower("lavender");
                lavender.setIstGekauft(true);
                lavender.setMengeImBesitz(1);

                break;
            case "rose":
                final Blume rose = shop.getFlower("rose");
                rose.setIstGekauft(true);
                rose.setMengeImBesitz(1);

                break;
            default:
                System.out.println("Plant not found");
        }
    }
}