package Main;

public class Main {

    public static void main(final String[] args) throws InterruptedException {
        final Text text = new Text();
        final Shop shop = new Shop();
        final Buyer buyer = new Buyer();

        final Factors factors = new Factors();
        shop.infoCheck();
        buyer.buyFlowers();
        shop.infoCheck();
        text.start();
        text.driving();
        text.startShop();
        System.out.println(factors.getTemperature());
    }
}

