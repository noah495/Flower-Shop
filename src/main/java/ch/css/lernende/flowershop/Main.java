package ch.css.lernende.flowershop;

import java.util.ArrayList;

public class Main {

    public static void main(final String[] args) {
        final FlowerDealer flowerDealerHansWithTulip = new FlowerDealer("tulip", 200);
        final FlowerDealer flowerDealerMaxWithRose = new FlowerDealer("rose", 300);
        final FlowerDealer flowerDealerOliviaWithSunflower = new FlowerDealer("sunflower", 100);
        final FlowerDealer flowerDealerAnaWithLotus = new FlowerDealer("lotus", 150);
        final ArrayList<FlowerDealer> availableFlowerDealer = new ArrayList<>();
        availableFlowerDealer.add(flowerDealerHansWithTulip);
        availableFlowerDealer.add(flowerDealerMaxWithRose);
        availableFlowerDealer.add(flowerDealerOliviaWithSunflower);
        availableFlowerDealer.add(flowerDealerAnaWithLotus);

        final FlowerShop flowerShopGiswiler =
                new FlowerShop("Giswiler", "Seestrasse 4, Giswil", availableFlowerDealer);
        final FlowerShop flowerShopRosesFromTheWholeWorld =
                new FlowerShop("Roses from the whole world", "Bahnhofstrasse 49, Weggis", availableFlowerDealer);

        final ArrayList<FlowerShop> availableFlowerShops = new ArrayList<>();
        availableFlowerShops.add(flowerShopGiswiler);
        availableFlowerShops.add(flowerShopRosesFromTheWholeWorld);

        final Customer customer1 = new Customer("Phil", availableFlowerShops);

        flowerShopGiswiler.orderFlower(5, "tulip");
        flowerShopGiswiler.orderFlower(30, "rose");

        final Flower pickedFlower = customer1.pickRandomFlowerinFlowerShop("Giswiler");

        final double randomAmount = Math.random() * 5;
        final int amount = (int) randomAmount;

        customer1.buyFlower(amount, pickedFlower.getName());
        flowerShopGiswiler.getInventory().getFlowerInformation("tulip");
        flowerShopGiswiler.getInventory().printFlowers();
        flowerShopGiswiler.getCurrency();
        customer1.getFlowerInformation("rose");
    }
}



