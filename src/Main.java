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

        final FlowerShop flowerShopGiswilerMountainFlower =
                new FlowerShop("Giswiler", "Seestrasse 4, Giswil", availableFlowerDealer);
        final FlowerShop flowerShopRosesFromTheWholeWorld =
                new FlowerShop("Roses from the whole world", "Bahnhofstrasse 49, Weggis", availableFlowerDealer);

        final ArrayList<FlowerShop> availableFlowerShops = new ArrayList<>();
        availableFlowerShops.add(flowerShopGiswilerMountainFlower);
        availableFlowerShops.add(flowerShopRosesFromTheWholeWorld);

        final Costumer costumer1 = new Costumer("Phil", availableFlowerShops);

        flowerShopGiswilerMountainFlower.orderFlower(5, "tulip");
        flowerShopGiswilerMountainFlower.orderFlower(300, "rose");

        flowerShopGiswilerMountainFlower.getCurrency();

        final Flower pickedFlower = costumer1.pickRandomFlowerinFlowerShop("Giswiler");

        final double randomAmount = Math.random() * 10;
        final int amount = (int) randomAmount;

        costumer1.buyFlower(amount, pickedFlower.getName());
        flowerShopGiswilerMountainFlower.getInventory().printFlowerInformation("tulip");
        flowerShopGiswilerMountainFlower.getInventory().printBlumen();
        flowerShopGiswilerMountainFlower.getCurrency();
        costumer1.getFlowerInformation("rose");
    }
}



