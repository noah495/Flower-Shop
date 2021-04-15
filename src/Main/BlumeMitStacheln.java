package Main;

public class BlumeMitStacheln extends Blume {

    private final int stacheln;

    public BlumeMitStacheln(final String name, final int stacheln, final char anfangsbuchstabe, final double preis, final int idealTemperatur, final boolean licht, final int wasserVerbrauch, final boolean istlebendig) {
        super(name, anfangsbuchstabe, preis, idealTemperatur, licht, wasserVerbrauch, istlebendig);
        this.stacheln = stacheln;
    }

    BlumeMitStacheln(final int stacheln) {
        this.stacheln = stacheln;
    }

    //TODO: (6th Step) Yagni
    @Override
    public void printInfo() {
        System.out.println("Stings: " + stacheln);
        super.printInfo();
    }

    @Override
    protected String istEssbar() {
        return "Yes";
    }
}