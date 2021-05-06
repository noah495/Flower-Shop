import java.util.ArrayList;

public class Costumer {
    private final ArrayList<FlowerShop> availableFlowerShops;
    private final ArrayList<Flower> boughtFlowers = new ArrayList<>();

    private final String name;

    Costumer(final String costumerName, final ArrayList<FlowerShop> flowerShops) {
        this.name = costumerName;
        this.availableFlowerShops = flowerShops;
    }

    public void buyFlower(final int amount, final String flowerName) {
        boolean isBought = false;
        for (final FlowerShop flowerShops : availableFlowerShops) {
            final boolean flowerAvailable = flowerShops.isFlowerAvailable(flowerName, amount);
            if (flowerAvailable) {
                System.out.println("Flower available");
                final ArrayList<Flower> currentBoughtFlowers = flowerShops.sellFlowers(flowerName, amount);
                addBlumen(currentBoughtFlowers);
                System.out.println("Flower bought successfully");
                System.out.println(boughtFlowers.size());
                isBought = true;
                break;
            } else {
                System.out.println("The Flowershop " + flowerShops.getShopName() + " does not have the flower you wish. Please go to the next shop");
            }
        }
        if (isBought == false) {
            System.out.println("We're Sorry, the flower you wish is not available in any Shops.");
        }
    }

    public void getFlowerInformation(final String flowerName) {
        for (final FlowerShop flowerShop : availableFlowerShops) {
            final boolean flowerAvailable = flowerShop.isFlowerExisting(flowerName);
            if (flowerAvailable) {
                flowerShop.getFlowerInformation(flowerName);
            }
        }
    }

    public void addBlumen(final ArrayList<Flower> flowers) {
        boughtFlowers.addAll(flowers);
    }

    public Flower pickRandomFlowerinFlowerShop(final String flowerShopName) {
        for (final FlowerShop FlowerShop : availableFlowerShops) {
            if (FlowerShop.getShopName().equals(flowerShopName)) {
                final double randomFlowerDigit = Math.random() * 4;
                final int flowerDigit = (int) randomFlowerDigit;
                final String flowerName = FlowerShop.choosenFlower(flowerDigit);
                for (final Flower flower : FlowerShop.getFlowersInPossession()) {
                    if (flower.getName() == flowerName) {
                        return flower;
                    }
                }
            }
        }
        return null;
    }
}
//TODO: Ideas: Enter which FlowerDealer you want to go to