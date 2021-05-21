package main.java;

public class FlowerWithNickname extends Flower {

    String nickname;

    FlowerWithNickname(final String name, final String nickname, final double price, final int sizeInCm, final boolean isAlive, final int recommendedTemperature, final boolean needsLight) {
        super(name, price, sizeInCm, isAlive, recommendedTemperature, needsLight);
        this.nickname = nickname;
    }
}
