import java.util.ArrayList;

public class Inventory {
    private final ArrayList<Flower> FlowersInPossession = new ArrayList<>();
    private double currency = 223400;

    public double getCurrency() {
        return currency;
    }

    public void setCurrency(final double money) {
        this.currency = money;
    }

    public ArrayList<Flower> getFlowerInPossession() {
        return FlowersInPossession;
    }

    public ArrayList<Flower> getFlowersToSell(final String flowerName, final int amount) {
        final ArrayList<Flower> flowers = new ArrayList<>();
        for (final Flower flower : FlowersInPossession) {
            if (flower.getName().equals(flowerName)) {
                flowers.add(flower);

                if (flowers.size() == amount) {
                    break;
                }
            }
        }
        return flowers;
    }

    public boolean isFlowerAvailable(final String flowerName, final int amount) {
        int i = 0;
        for (final Flower flower : FlowersInPossession) {
            if (flower.getName().equals(flowerName)) {
                i++;
                if (i == amount) {
                    return true;
                }
            }
        }
        return false;
    }

    public int getAmountFlowers() {
        final int getSizeFlower = getFlowerInPossession().size();
        return getSizeFlower;
    }

    public void addFlowers(final ArrayList<Flower> flowers) {
        FlowersInPossession.addAll(flowers);
    }

    public String chooseFlower(final int digit) {
        if (FlowersInPossession.size() >= digit) {
            final Flower choosenFlower = FlowersInPossession.get(digit);
            final String flowerName = choosenFlower.getName();
        }
        return null;
    }

    //TODO: printBlumenInfo return String!!!
    public void printFlowerInformation(final String flowerName) {
        for (final Flower flower : FlowersInPossession) {
            if (flower.getName().equals(flowerName)) {
                System.out.println("Information about " + flower.getName());
                System.out.println("Recommended temperature: " + flower.getRecommendedTemperature());
                System.out.println("Price: " + flower.getPrice());
                System.out.println("Requires Light: " + flower.getLightRequired());
                System.out.println("Size when bought: " + flower.getSizeInCm());
                break;
            }
        }
    }

    public void printBlumen() {
        final ArrayList<String> AvailableFlowers = new ArrayList<>();
        for (final Flower flower : FlowersInPossession) {
            if (!AvailableFlowers.contains(flower.getName())) {
                AvailableFlowers.add(flower.getName());
            }
        }
        AvailableFlowers.forEach(System.out::println);
    }


}

