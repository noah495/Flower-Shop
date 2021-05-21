package ch.css.lernende.flowershop;


public class FlowerWithNicknameLocal extends FlowerWithNickname {

    boolean local;

    FlowerWithNicknameLocal(final String name, final boolean local, final String nickname, final double price, final int sizeInCm, final boolean isAlive, final int recommendedTemperature, final boolean needsLight) {
        super(name, nickname, price, sizeInCm, isAlive, recommendedTemperature, needsLight);
        this.local = local;
    }
}

