public class Blume {
    private final boolean istLebendig;
    private String name;
    private double preis;
    private int groesseInCm;
    private int bevorzugteTemperatur;
    private boolean brauchtTageslicht;
    private boolean absterbend;

    Blume() {
        this.istLebendig = true;
    }

    Blume(final String name, final double preis, final int groesseInCm, final boolean istLebendig, final int bevorzugteTemperatur, final boolean brauchtTageslicht) {
        this.name = name;
        this.preis = preis;
        this.groesseInCm = groesseInCm;
        this.istLebendig = istLebendig;
        this.bevorzugteTemperatur = bevorzugteTemperatur;
        this.brauchtTageslicht = brauchtTageslicht;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(final double preis) {
        this.preis = preis;
    }

    public int getGroesseInCm() {
        return groesseInCm;
    }

    public boolean isIstLebendig() {
        return istLebendig;
    }

    public int getBevorzugteTemperatur() {
        return bevorzugteTemperatur;
    }

    public boolean isBrauchtTageslicht() {
        return brauchtTageslicht;
    }

    public boolean isAbsterbend() {
        return absterbend;
    }

    public void setAbsterbend(final boolean absterbend) {
        this.absterbend = absterbend;
    }

    public String getName() {
        return name;
    }

    public void wachsen(final int wachstumInCm) {
        this.groesseInCm += wachstumInCm;
    }
}
