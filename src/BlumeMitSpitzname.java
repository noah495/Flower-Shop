public class BlumeMitSpitzname extends Blume {

    String spitzname;

    BlumeMitSpitzname(String name, final String spitzname, final double preis, final int groesseInCm, final boolean istLebendig, final int bevorzugteTemperatur, final boolean brauchtTageslicht) {
        super(name, preis, groesseInCm, istLebendig, bevorzugteTemperatur, brauchtTageslicht);
        this.spitzname = spitzname;
    }
}
