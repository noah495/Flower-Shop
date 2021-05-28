package ch.css.lernende.flowershop;

import java.util.List;

public class FlowerShopOrderer {

    private final Inventory inventory;
    private final List<FlowerDealer> availableFlowerDealers;

    public FlowerShopOrderer(final Inventory inventory, final List<FlowerDealer> availableFlowerDealers) {

        this.inventory = inventory;
        this.availableFlowerDealers = availableFlowerDealers;
    }

    public void orderFlower(final int amount, final String flowerName) {
        System.out.println("Your order costs " + getPriceOfOrder(flowerName, amount) + "$ and your balance is " + inventory.getCurrency() + "$");

        if (getPriceOfOrder(flowerName, amount) <= inventory.getCurrency()) {
            System.out.println("Ordering " + amount + flowerName + " for " + getPriceOfOrder(flowerName, amount) + "$");

            for (final FlowerDealer flowerDealer : availableFlowerDealers) {
                if (flowerDealer.getSpecialisedFlower().equals(flowerName)) {

                    final List<Flower> orderedFlowers = flowerDealer.order(amount);
                    payFlowers(orderedFlowers);
                    inventory.addFlowers(orderedFlowers);
                    flowerDealer.removeFlowers(amount);
                    return;
                }
            }
        } else {
            System.out.println("We're sorry, you don't have enough money");
        }
    }

    public Double getPriceOfOrder(final String flowerName, final int amount) {
        for (final FlowerDealer flowerDealer : availableFlowerDealers) {
            final String specialisedFlower = flowerDealer.getSpecialisedFlower();
            if (flowerName.equals(specialisedFlower)) {
                final boolean hasEnoughFlowers = flowerDealer.getFlowersOnStock().size() >= amount;
                if (hasEnoughFlowers) {
                    return flowerDealer.getFlowersOnStock().get(0).getPrice() * amount;
                }
            }
        }
        return null;
    }

    public void payFlowers(final List<Flower> orderedFlowers) {
        double price = 0;
        for (final Flower flower : orderedFlowers) {
            price += flower.getPrice();
        }
        System.out.println("Ordered " + orderedFlowers.size() + " flowers of type " + orderedFlowers.get(0).getName() + " (" + Math.round(price * 100) / 100 + "$)");
        inventory.subtractCurrency(price);
    }
}