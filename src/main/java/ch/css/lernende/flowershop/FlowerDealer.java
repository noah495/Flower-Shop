package ch.css.lernende.flowershop;


import java.util.ArrayList;
import java.util.List;

public class FlowerDealer {
    private final String specialisedFlower;
    private final List<Flower> flowersOnStock = new ArrayList<Flower>();

    public FlowerDealer(final String flowerName) {
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
                    flowersOnStock.add(new FlowerWithThorn("rose", 12, 5.6, 30, true,
                            20, true));
                }
                break;
            case "tulip":
                for (int i = 0; i < amount; i++) {
                    flowersOnStock.add(new FlowerWithNicknameLocal("tulip", true,
                            "tulpi", 6.9, 14, true, 10, false));
                }
                break;
            case "sunflower":
                for (int i = 0; i < amount; i++) {
                    flowersOnStock.add(new FlowerWithNickname("sonnenblume", "sunny", 11, 43,
                            true, 25, true));
                }
                break;

            case "lotus":
                for (int i = 0; i < amount; i++) {
                    flowersOnStock.add(new Flower("lotus", 1.6, 9, true,
                            20, true));
                }
                break;
            default:
                System.out.println("Flower couldn't be created");
                //TDOD: Break und Default --> Google What happends when switch is missing a break
        }
    }

    public List<Flower> order(final int amount) {
        final List<Flower> flowersToDeliver = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            flowersToDeliver.add(flowersOnStock.get(i));
        }
        return flowersToDeliver;
    }
}

