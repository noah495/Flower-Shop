package Main;

public class Blume {

    //TODO: (2nd Step) Make all fields private
//TODO: (7th Step) Search whole project for Yagni
    private final Bewaesserung bewaesserung = new Bewaesserung();
    private final Faktoren faktoren = new Faktoren();
    private final Groesse groesse = new Groesse();
    private boolean istGekauft;
    private String name;
    private int mengeImBesitz;
    private double kaufPreis;
    private char anfangsbuchstabe;
    private boolean istLebendig = true;

    Blume() {
        this.istLebendig = true;
    }

    Blume(final double preis) {
        this.kaufPreis = preis;
    }

    Blume(final String name, final char anfangsbuchstabe, final double preis, final int idealeTemperatur, final boolean beleuchtet, final int wasserVerbrauch, final boolean istLebendig) {
        this.name = name;
        this.kaufPreis = preis;
        this.anfangsbuchstabe = anfangsbuchstabe;
        faktoren.setTemperatur(idealeTemperatur);
        faktoren.setBeleuchtet(beleuchtet);
        bewaesserung.setLiter(wasserVerbrauch);
        this.istLebendig = istLebendig;
        istGekauft = false;
        mengeImBesitz = 0;
    }

    Blume(final char anfangsbuchstabe) {
        this.anfangsbuchstabe = anfangsbuchstabe;
    }

    Blume(final double preis, final boolean istZustand) {
        this.kaufPreis = preis;
        this.istLebendig = istZustand;
    }

    Blume(final double preis, final char anfangsbuchstabe, final boolean istLebendig) {
        this.kaufPreis = preis;
        this.anfangsbuchstabe = anfangsbuchstabe;
        this.istLebendig = istLebendig;
    }

    public String getName() {
        return name;
    }

    public void setIstGekauft(final boolean istGekauft) {
        this.istGekauft = istGekauft;
    }

    public void setMengeImBesitz(final int mengeImBesitz) {
        this.mengeImBesitz = mengeImBesitz;
    }

    public void printInfo() {
        // System.out.println("Nickname: " +);
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


