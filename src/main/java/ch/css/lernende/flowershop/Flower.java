package ch.css.lernende.flowershop;


public class Flower {
    private final boolean isAlive;
    private final String name;
    private double price;
    private final int sizeInCm;
    private final int recommendedTemperature;
    private final boolean needsLight;
    private boolean isDying;

    public Flower(final String name, final double price, final int sizeInCm, final boolean isAlive, final int recommendedTemperature, final boolean needsLight) {
        this.name = name;
        this.price = price;
        this.sizeInCm = sizeInCm;
        this.isAlive = isAlive;
        this.recommendedTemperature = recommendedTemperature;
        this.needsLight = needsLight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public String getLightRequired() {
        if (needsLight) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public int getSizeInCm() {
        return sizeInCm;
    }

    public int getRecommendedTemperature() {
        return recommendedTemperature;
    }

    public String getName() {
        return name;
    }
}
