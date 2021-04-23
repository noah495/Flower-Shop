public class BlumeMitStachel extends Blume {

    int stachel;

    BlumeMitStachel(String name, final int stachel, final double preis, final int groesseInCm, final boolean istLebendig, final int bevorzugteTemperatur, final boolean brauchtTageslicht) {
        super(name, preis, groesseInCm, istLebendig, bevorzugteTemperatur, brauchtTageslicht);
        this.stachel = stachel;
    }
}

