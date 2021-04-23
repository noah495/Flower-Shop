public class Blume {
    String name;
    double preis;
    int groesseInCm;
    boolean istLebendig;
    int bevorzugteTemperatur;
    boolean brauchtTageslicht;
    boolean absterbend;

    Blume() {
        this.istLebendig = true;
    }

    public Blume(String name,final double preis, final int groesseInCm, final boolean istLebendig, final int bevorzugteTemperatur, final boolean brauchtTageslicht) {
        this.name = name;
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
