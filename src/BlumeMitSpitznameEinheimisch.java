public class BlumeMitSpitznameEinheimisch extends BlumeMitSpitzname {

    boolean einheimisch;

    BlumeMitSpitznameEinheimisch(final boolean einheimisch, final String spitzname, final float preis, final int groesseInCm, final boolean istLebendig, final int bevorzugteTemperatur, final boolean brauchtTageslicht) {
        super(spitzname, preis, groesseInCm, istLebendig, bevorzugteTemperatur, brauchtTageslicht);
        this.einheimisch = einheimisch;
    }
}

