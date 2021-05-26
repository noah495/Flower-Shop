package ch.css.lernende.flowershop;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final List<FlowerShop> availableFlowerShops;

    private final List<Flower> boughtFlowers = new ArrayList<>();

    private final String name;

    public Customer(final String costumerName, final List<FlowerShop> flowerShops) {
        this.name = costumerName;
        this.availableFlowerShops = flowerShops;
    }

    public StringBuilder getFlowerInformation(final String flowerName) {
        for (final FlowerShop flowerShop : availableFlowerShops) {
            final boolean flowerAvailable = flowerShop.isFlowerExisting(flowerName);
            if (flowerAvailable) {
                return flowerShop.getFlowerInformation(flowerName);
            }
        }
        return null;
    }

    public Flower pickRandomFlowerinFlowerShop(final String flowerShopName) {
        for (final FlowerShop FlowerShop : availableFlowerShops) {
            if (FlowerShop.getShopName().equals(flowerShopName)) {
                final double randomFlowerDigit = Math.random() * 4;
                final int flowerDigit = (int) randomFlowerDigit;
                final String flowerName = FlowerShop.chosenFlower(flowerDigit);
                for (final Flower flower : FlowerShop.getFlowersInPossession()) {
                    if (flower.getName().equals(flowerName)) {
                        return flower;
                    }
                }
            }
        }
        return null;
    }

    public void buyFlower(final int amount, final String flowerName) {
        boolean isBought = false;
        for (final FlowerShop flowerShop : availableFlowerShops) {
            if (flowerShop.isFlowerAvailable(flowerName, amount)) {
                System.out.println("Flower available");
                flowerShop.receiveMoney(amount, flowerName);
                final ArrayList<Flower> currentBoughtFlowers = flowerShop.sellFlowers(flowerName, amount);
                addFlowers(currentBoughtFlowers);

                System.out.println("Flower bought successfully\n");
                System.out.println(boughtFlowers.size());
                isBought = true;
                break;
            } else {
                System.out.println("The Flowershop " + flowerShop.getShopName() + " does not have the flower you wish. Please go to the next shop");
            }
        }
        if (!isBought) {
            System.out.println("We're Sorry, the flower you wish is not available in any Shops.");
        }
    }

    public List<Flower> getBoughtFlowers() {
        return boughtFlowers;
    }

    private void addFlowers(final ArrayList<Flower> flowers) {
        boughtFlowers.addAll(flowers);
    }
}
