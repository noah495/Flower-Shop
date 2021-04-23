public class BlumeMitSpitzname extends Blume {

    String spitzname;

    BlumeMitSpitzname(final String spitzname, final float preis, final int groesseInCm, final boolean istLebendig, final int bevorzugteTemperatur, final boolean brauchtTageslicht) {
        super(preis, groesseInCm, istLebendig, bevorzugteTemperatur, brauchtTageslicht);
        this.spitzname = spitzname;
    }
}
