public class Blume {
    private final boolean isAlive;
    private String name;
    private double price;
    private int sizeInCm;
    private int recommendedTemperature;
    private boolean needsLight;
    private boolean isDying;

    Blume() {
        this.isAlive = true;
    }

    Blume(final String name, final double preis, final int groesseInCm, final boolean istLebendig, final int bevorzugteTemperatur, final boolean brauchtTageslicht) {
        this.name = name;
        this.price = preis;
        this.sizeInCm = groesseInCm;
        this.isAlive = istLebendig;
        this.recommendedTemperature = bevorzugteTemperatur;
        this.needsLight = brauchtTageslicht;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public String getLightRequired() {
        if (needsLight) {
            return "Ja";
        } else {
            return "Nein";
        }
    }

    public int getSizeInCm() {
        return sizeInCm;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getRecommendedTemperature() {
        return recommendedTemperature;
    }

    public boolean isNeedsLight() {
        return needsLight;
    }

    public boolean isDying() {
        return isDying;
    }

    public void setDying(final boolean dying) {
        this.isDying = dying;
    }

    public String getName() {
        return name;
    }

    public void wachsen(final int wachstumInCm) {
        this.sizeInCm += wachstumInCm;
    }
}
