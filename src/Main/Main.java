package Main;

public class Main {

    public static void main(final String[] args) throws InterruptedException {
        final Text text = new Text();
        final Shop shop = new Shop();
        final Kaeufer kaeufer = new Kaeufer();

        final Faktoren faktoren = new Faktoren();
        shop.infoCheck();
        kaeufer.blumeKaufen();
        shop.infoCheck();
        text.start();
        text.driving();
        text.startShop();
        System.out.println(faktoren.getTemperatur());
    }
}

