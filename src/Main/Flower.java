package Main;

public class Blume {

    private final Bewaesserung bewaesserung = new Bewaesserung();
    private final Faktoren faktoren = new Faktoren();
    private String name;
    private int mengeImBesitz;
    private double kaufPreis;
    private char anfangsbuchstabe;
    private final boolean istLebendig;

    Blume() {
        this.istLebendig = true;
    }

    Blume(final String name, final char anfangsbuchstabe, final double preis, final int idealeTemperatur, final boolean beleuchtet, final int wasserVerbrauch, final boolean istLebendig) {
        this.name = name;
        this.kaufPreis = preis;
        this.anfangsbuchstabe = anfangsbuchstabe;
        faktoren.setTemperatur(idealeTemperatur);
        faktoren.setBeleuchtet(beleuchtet);
        bewaesserung.setLiter(wasserVerbrauch);
        this.istLebendig = istLebendig;
        mengeImBesitz = 1;
    }

    public String getName() {
        return name;
    }

    public void addMengeImBesitz(final int anzahlBlumen) {
        this.mengeImBesitz += anzahlBlumen;
    }

    public void printInfo() {
        System.out.println("Initial letter: " + anfangsbuchstabe);
        System.out.println("Price: " + kaufPreis + " $");
        System.out.println("Light: " + getBeleuchtung());
        System.out.println("Liter a week required to water: " + bewaesserung.getLiter());
        System.out.println("Status: " + getStatus());
        System.out.println("Is eatable: " + istEssbar());
        System.out.println("Is sellable: " + istVerkaufbar());
        System.out.println("In possession: " + mengeImBesitz);
    }

    private String getBeleuchtung() {
        final String beleuchtung;
        if (faktoren.isBeleuchtet()) {
            beleuchtung = "Required";
        } else {
            beleuchtung = "not Required";
        }
        return beleuchtung;
    }

    private String getStatus() {
        final String status;
        if (istLebendig) {
            status = "Alive";
        } else {
            status = "Dead";
        }
        return status;
    }

    protected String istEssbar() {
        return "No";
    }

    protected String istVerkaufbar() {
        return "No";
    }
}


