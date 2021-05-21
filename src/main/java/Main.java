package main.java;

import java.util.ArrayList;

public class Main {

    public static void main(final String[] args) {
        final FlowerDealer FlowerDealerHansWithTulip = new FlowerDealer("tulip");
        final FlowerDealer FlowerDealerMaxWithRose = new FlowerDealer("rose");
        final FlowerDealer FlowerDealerOliviaWithSunflower = new FlowerDealer("sunflower");
        final FlowerDealer flowerDealerAnaWithLotus = new FlowerDealer("lotus");
        final ArrayList<FlowerDealer> availableFlowerDealer = new ArrayList<>();
        availableFlowerDealer.add(FlowerDealerHansWithTulip);
        availableFlowerDealer.add(FlowerDealerMaxWithRose);
        availableFlowerDealer.add(FlowerDealerOliviaWithSunflower);
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
        flowerShopGiswiler.getInventory().printFlowerInformation("tulip");
        flowerShopGiswiler.getInventory().printBlumen();
        flowerShopGiswiler.getCurrency();
        customer1.getFlowerInformation("rose");
    }
}



