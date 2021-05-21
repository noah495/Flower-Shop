package ch.css.lernende.flowershop;

import java.util.ArrayList;
import java.util.List;

public class FlowerShop {
    private String shopName;
    private String address;
    private Inventory inventory;
    private List<FlowerDealer> availableFlowerDealers;
    private List<Flower> orderedFlowers = new ArrayList<>();

    public FlowerShop(final String storeName, final String address, final List<FlowerDealer> flowerDealers) {
        this.shopName = storeName;
        this.address = address;
        this.availableFlowerDealers = flowerDealers;

        this.inventory = new Inventory();
    }

    public FlowerShop() {

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

    public StringBuilder getFlowerInformation(final String flowerName) {
        return inventory.returnFlowerInformation(flowerName);
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

    public void orderFlower(final int amount, final String flowerName) {
        for (final FlowerDealer flowerDealer : availableFlowerDealers) {
            if (flowerDealer.getSpecialisedFlower().equals(flowerName)) {
                final List<Flower> orderedFlowers = flowerDealer.order(amount);
                System.out.println("Your current account balance is " + inventory.getCurrency() + "$\n");
                inventory.addFlowers(orderedFlowers);

                payFlowers(orderedFlowers);
                return;
            }
        }
    }

    public double getPurchasePrice(final String flowerName, final int amount) {
        for (final Flower flower : inventory.getFlowerInPossession()) {
            if (flowerName.equals(flower.getName())) {
                final double randomDouble = Math.round((flower.getPrice() - 1) + (Math.random() * (flower.getPrice() + 5)));
                return randomDouble * amount;
            }
        }
        return 0;
    }

    public void payFlowers(final List<Flower> orderedFlowers) {
        double price = 0;
        for (final Flower flower : orderedFlowers) {
            price += flower.getPrice();
        }
        System.out.println("Ordered " + orderedFlowers.size() + " flowers of type " + orderedFlowers.get(0).getName() + " (" + Math.round(price * 100) / 100 + "$)");
        inventory.subtractCurrency(price);
    }

    public ArrayList<Flower> sellFlowers(final String flowerName, final int amount) {
        return inventory.getFlowersToSell(flowerName, amount);
    }

    public String chosenFlower(final int digit) {
        return inventory.chooseFlower(digit);
    }

    public ArrayList<Flower> order(final int amount) {
        final ArrayList<Flower> boughtFlowers = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            boughtFlowers.add(getFlowersInPossession().get(i));
        }
        return boughtFlowers;
    }

    public void printInformation(final String flowerName) {
        inventory.returnFlowerInformation(flowerName);
    }

    public void receiveMoney(final int amount, final String flowerName) {
        getInventory().addCurrency(getPurchasePrice(flowerName, amount));
    }
}



