import java.util.ArrayList;

public class FlowerDealer {
    private final String specialisedFlower;
    private final ArrayList<Flower> FlowerAtDealer = new ArrayList<>();

    FlowerDealer(final String flowerName) {
        this.specialisedFlower = flowerName;
        createFlowers(3000);
    }

    public String getSpecialisedFlower() {
        return specialisedFlower;
    }

    private void createFlowers(final int amount) {
        switch (specialisedFlower) {
            case "rose":
                for (int i = 0; i < amount; i++) {
                    FlowerAtDealer.add(new FlowerWithThorn("rose", 12, 5.6, 30, true,
                            20, true));
                }
            case "tulip":
                for (int i = 0; i < amount; i++) {
                    FlowerAtDealer.add(new FlowerWithNicknameLocal("tulip", true,
                            "tulpi", 6.9, 14, true, 10, false));
                }
            case "sunflower":
                for (int i = 0; i < amount; i++) {
                    FlowerAtDealer.add(new FlowerWithNickname("sonnenblume", "sunny", 11, 43,
                            true, 25, true));
                }
            case "lotus":
                for (int i = 0; i < amount; i++) {
                    FlowerAtDealer.add(new Flower("lotus", 1.6, 9, true,
                            20, true));
                }
        }
    }

    public ArrayList<Flower> order(final int amount) {
        final ArrayList<Flower> flowersToDeliver = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            flowersToDeliver.add(FlowerAtDealer.get(i));
        }
        return flowersToDeliver;
    }
}

