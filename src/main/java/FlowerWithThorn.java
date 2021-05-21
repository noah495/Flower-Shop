public class FlowerWithThorn extends Flower {

    int thorn;

    FlowerWithThorn(final String name, final int thorn, final double price, final int sizeInCm, final boolean isAlive, final int recommendedTemperature, final boolean needsLight) {
        super(name, price, sizeInCm, isAlive, recommendedTemperature, needsLight);
        this.thorn = thorn;
    }
}

