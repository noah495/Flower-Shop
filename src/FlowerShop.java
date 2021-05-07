import java.util.ArrayList;

public class FlowerShop {
    private final String shopName;
    private final String address;
    private final Inventory inventory;
    private final ArrayList<FlowerDealer> availableFlowerDealers;
    private final ArrayList<Flower> orderedFlowers = new ArrayList<>();

    FlowerShop(final String storeName, final String address, final ArrayList<FlowerDealer> flowerDealers) {
        this.shopName = storeName;
        this.address = address;
        this.availableFlowerDealers = flowerDealers;

        this.inventory = new Inventory();
    }

    public String getShopName() {
        return shopName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public ArrayList<Flower> getFlowerInPossession() {
        return inventory.getFlowerInPossession();
    }

    public double getCurrency() {
        return inventory.getCurrency();
    }

    public void setCurrency(final double money) {
        inventory.setCurrency(money);
    }

    public void getFlowerInformation(final String flowerName) {
        inventory.printFlowerInformation(flowerName);
    }

    public ArrayList<Flower> getOrderedFlowers() {
        return orderedFlowers;
    }

    public ArrayList<Flower> getFlowersInPossession() {
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
                final ArrayList<Flower> orderedFlowers = flowerDealer.order(amount);
                System.out.println("Flower ordered successfully");
                inventory.addFlowers(orderedFlowers);
                System.out.println("Flower successfully added to Inventory");
                System.out.println(orderedFlowers.size());
                return;
            }
        }
    }

    public ArrayList<Flower> sellFlowers(final String flowerName, final int amount) {
        return inventory.getFlowersToSell(flowerName, amount);
    }

    public String choosenFlower(final int digit) {
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
        inventory.printFlowerInformation(flowerName);
    }
}



