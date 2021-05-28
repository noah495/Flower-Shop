package ch.css.lernende.flowershop;

import java.util.ArrayList;
import java.util.Optional;

public class Main {

    public static void main(final String[] args) throws Exception {
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

        final Optional<Flower> pickedFlower = customer1.pickRandomFlowerinFlowerShop("Giswiler");

        if (!pickedFlower.isPresent()) {
            throw new RuntimeException("Whoops, we weren't able to find this Flower. Try again.");
        }

        final double randomAmount = Math.random() * 5;
        final int amount = (int) randomAmount;

        customer1.buyFlower(amount, pickedFlower.get().getName());
        flowerShopGiswiler.getInventory().getFlowerInformation("tulip");
        flowerShopGiswiler.getInventory().printFlowers();
        flowerShopGiswiler.getCurrency();
        customer1.getFlowerInformation("rose");
    }
}



