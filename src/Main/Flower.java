package Main;

public class Flower {

    private final Watering watering = new Watering();
    private final Factors factors = new Factors();
    private final boolean isAlive;
    private String name;
    private double buyPrice;
    private char InitialLetter;
    private boolean isOwned;

    Flower() {
        this.isAlive = true;
    }

    Flower(final String name, final char initialLetter, final double buyPrice, final int recommendedTemperature, final boolean hasLight, final int waterUse, final boolean isAlive) {
        this.name = name;
        this.buyPrice = buyPrice;
        this.InitialLetter = initialLetter;
        factors.setTemperature(recommendedTemperature);
        factors.setHasLight(hasLight);
        watering.setLiter(waterUse);
        this.isAlive = isAlive;
        isOwned = false;
    }

    public void printInfo() {
        System.out.println("Initial letter: " + InitialLetter);
        System.out.println("Price: " + buyPrice + " $");
        System.out.println("Light: " + getLight());
        System.out.println("Liter a week required to water: " + watering.getLiter());
        System.out.println("Status: " + getStatus());
        System.out.println("Is eatable: " + isEatable());
        System.out.println("Is sellable: " + isSellable());
    }



    private String getLight() {
        final String light;
        if (factors.isHasLight()) {
            light = "Required";
        } else {
            light = "not Required";
        }
        return light;
    }

    private String getStatus() {
        final String status;
        if (isAlive) {
            status = "Alive";
        } else {
            status = "Dead";
        }
        return status;
    }

    protected String isEatable() {
        return "No";
    }

    protected String isSellable() {
        return "No";
    }

    public void setIsOwned(final boolean isOwned) {
        this.isOwned = isOwned;
    }

    public String getName() {
        return name;
    }

}
