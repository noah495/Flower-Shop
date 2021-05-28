package ch.css.lernende.flowershop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlowerDealer {
    private final String specialisedFlower;
    private final Random rnd = new Random();
    private final int random = rnd.nextInt(101);
    private final List<Flower> flowersOnStock = new ArrayList<Flower>();

    public FlowerDealer(final String flowerName, final int amount) {
        this.specialisedFlower = flowerName;
        createFlowers(amount);
    }

    public List<Flower> getFlowersOnStock() {
        return flowersOnStock;
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
        }
    }

    public List<Flower> order(final int amount) {
        final List<Flower> flowersToDeliver = new ArrayList<>();
        if (amount <= flowersOnStock.size()) {
            for (int i = 0; i < amount; i++) {
                flowersToDeliver.add(flowersOnStock.get(i));
            }
        }
        return flowersToDeliver;
    }

    public void removeFlowers(final int amount) {
        flowersOnStock.remove(amount);
    }
}

