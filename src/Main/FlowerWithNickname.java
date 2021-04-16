package Main;

public class BlumeMitSpitzname extends Blume {
    private String spitzname;

    BlumeMitSpitzname() {
    }

    public BlumeMitSpitzname(final String name, final String spitzname, final char anfangsbuchstabe, final double preis, final int idealTemperatur, final boolean licht, final int wasserVerbrauch, final boolean istlebendig) {
        super(name, anfangsbuchstabe, preis, idealTemperatur, licht, wasserVerbrauch, istlebendig);
        this.spitzname = spitzname;
    }

    public String getSpitzname() {
        spitznameCheck();
        return spitzname;
    }

    public void spitznameCheck() {
        if (spitzname == null) {
            this.spitzname = "-";
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Nickname: " + spitzname);
        super.printInfo();
    }

    @Override
    protected String istVerkaufbar() {
        return "Yes";
    }
}
