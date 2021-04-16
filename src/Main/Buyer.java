package Main;

import java.util.Scanner;

public class Buyer {
    private final Shop shop = new Shop();

    public void buyFlowers() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Which plant do you want to buy?");

        for (int i = 0; i < 1; ) {
            final String nextLine = scanner.nextLine();
            if (nextLine.equals("none")) {
                i++;
                System.out.println("next Step");
            } else {
                final Flower flower = shop.getFlower(nextLine);

                if (flower != null) {

                    shop.inventory.printInfo(flower);
                    System.out.println("Success");
                    shop.inventory.addFlower(flower);
                    shop.inventory.printInfo(flower);
                }
            }
        }
    }
}

      /* Arrays.stream(shop.blumen).forEach(blume -> {
            blume.printInfo();
        }); */