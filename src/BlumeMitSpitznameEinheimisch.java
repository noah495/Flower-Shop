public class BlumeMitSpitznameEinheimisch extends BlumeMitSpitzname {

    boolean einheimisch;

    BlumeMitSpitznameEinheimisch(String name,final boolean einheimisch, final String spitzname, final double preis, final int groesseInCm, final boolean istLebendig, final int bevorzugteTemperatur, final boolean brauchtTageslicht) {
        super(name, spitzname, preis, groesseInCm, istLebendig, bevorzugteTemperatur, brauchtTageslicht);
        this.einheimisch = einheimisch;
    }
}

