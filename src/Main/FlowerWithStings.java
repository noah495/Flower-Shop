package Main;

public class FlowerWithStings extends Flower {

    private final int stings;

    public FlowerWithStings(final String name, final int stings, final char initialLetter, final double price, final int recommendedTemperature, final boolean hasLight, final int waterUse, final boolean isAlive) {
        super(name, initialLetter, price, recommendedTemperature, hasLight, waterUse, isAlive);
        this.stings = stings;
    }

    @Override
    public void printInfo() {
        System.out.println("Stings: " + stings);
        super.printInfo();
    }

    @Override
    protected String isEatable() {
        return "Yes";
    }
}