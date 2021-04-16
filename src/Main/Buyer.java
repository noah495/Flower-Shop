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
                    flower.printInfo();
                    System.out.println("Success");
                    flower.setIsOwned(true);
                    flower.addAmountInPossession(1);
                    flower.printInfo();
                }
            }
        }
    }
}

      /* Arrays.stream(shop.blumen).forEach(blume -> {
            blume.printInfo();
        }); */