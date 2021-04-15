package Main;

public class Faktoren {

    private boolean beleuchtet;
    private int temperatur = 30;
    private int luftfeuchtigkeit;

    public int getTemperatur() {
        return temperatur;
    }

    public void setTemperatur(final int temperatur) {
        this.temperatur = temperatur;
    }

    public boolean isBeleuchtet() {
        return beleuchtet;
    }

    public void setBeleuchtet(final boolean beleuchtet) {
        this.beleuchtet = beleuchtet;
    }

    public int getLuftfeuchtigkeit() {
        return luftfeuchtigkeit;
    }

    public void setLuftfeuchtigkeit(final int luftfeuchtigkeit) {
        this.luftfeuchtigkeit = luftfeuchtigkeit;
    }
}
