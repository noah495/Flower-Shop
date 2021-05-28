package ch.css.lernende.flowershop;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FlowerShop {
    private final List<Flower> orderedFlowers = new ArrayList<>();
    private final String shopName;
    private final String address;
    private final Inventory inventory;
    private final List<FlowerDealer> availableFlowerDealers;
    private final FlowerShopOrderer flowerShopOrderer;

    public FlowerShop(final String storeName, final String address, final List<FlowerDealer> flowerDealers) {
        this.shopName = storeName;
        this.address = address;
        this.availableFlowerDealers = flowerDealers;
        this.inventory = new Inventory();
        flowerShopOrderer = new FlowerShopOrderer(inventory, availableFlowerDealers);
    }

    public void orderFlower(final int amount, final String flowerName) {
        flowerShopOrderer.orderFlower(amount, flowerName);
    }

    public List<FlowerDealer> getAvailableFlowerDealers() {
        return availableFlowerDealers;
    }

    public String getAddress() {
        return address;
    }

    public String getShopName() {
        return shopName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public List<Flower> getFlowerInPossession() {
        return inventory.getFlowerInPossession();
    }

    public double getCurrency() {
        return inventory.getCurrency();
    }

    public Optional<String> getFlowerInformation(final String flowerName) {
        return inventory.getFlowerInformation(flowerName);
    }

    public List<Flower> getOrderedFlowers() {
        return orderedFlowers;
    }

    public List<Flower> getFlowersInPossession() {
        return inventory.getFlowerInPossession();
    }

    public boolean isFlowerExisting(final String flowerName) {
        return inventory.isFlowerAvailable(flowerName, 1);
    }

    public boolean isFlowerAvailable(final String flowerName, final int amount) {
        return inventory.isFlowerAvailable(flowerName, amount);
    }

    //TODO: Freitag: Unterschied simple Datentypen zu Optional und zu Objekt und zu strukturierten Datentypen
    //TODO: Freitag: Optional (.empty(), .of(), ...)
    //(Double > double)

    public Double getCustomerPurchasePrice(final String flowerName, final int amount) {
        for (final Flower flower : inventory.getFlowerInPossession()) {
            if (flowerName.equals(flower.getName())) {
                final double randomDouble = Math.round((flower.getPrice() - 1) + (Math.random() * (flower.getPrice() + 5)));
                return randomDouble * amount;
            }
        }
        return null;
    }

    public ArrayList<Flower> sellFlowers(final String flowerName, final int amount) {
        return inventory.getFlowersToSell(flowerName, amount);
    }

    public Flower chosenFlower(final int digit) {
        return inventory.chooseFlower(digit);
    }

    public void receiveMoney(final int amount, final String flowerName) {
        getInventory().addCurrency(getCustomerPurchasePrice(flowerName, amount));
    }
}



