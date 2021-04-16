package Main;

public class Faktoren {

    private boolean beleuchtet;
    private int temperatur = 30;

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
}
