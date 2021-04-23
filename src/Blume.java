public class Blume {
    double preis;
    int groesseInCm;
    boolean istLebendig;
    int bevorzugteTemperatur;
    boolean brauchtTageslicht;
    boolean absterbend;

    Blume() {
        this.istLebendig = true;
    }

    public Blume(final double preis, final int groesseInCm, final boolean istLebendig, final int bevorzugteTemperatur, final boolean brauchtTageslicht) {
        this.preis = preis;
        this.groesseInCm = groesseInCm;
        this.istLebendig = istLebendig;
        this.bevorzugteTemperatur = bevorzugteTemperatur;
        this.brauchtTageslicht = brauchtTageslicht;
    }

    public void setAbsterbend(final boolean absterbend) {
        this.absterbend = absterbend;
    }

    public void wachsen(final int wachstumInCm) {
        this.groesseInCm += wachstumInCm;
    }
}
