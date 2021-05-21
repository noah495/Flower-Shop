package ch.css.lernende.flowershop;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private final ArrayList<Flower> flowersInPossession = new ArrayList<>();
    private double currency = 2100;

    public double getCurrency() {
        return currency;
    }

    public void addCurrency(final double moneyToAdd) {
        currency += moneyToAdd;
        System.out.println("Your new balance is: " + currency + "$\n");
    }

    public void subtractCurrency(final double money) {
        if (money <= currency) {
            currency -= money;
            System.out.println("Your new balance is: " + currency + "$\n");
        } else {
            System.out.println("You're too broke");
        }
    }

    public ArrayList<Flower> getFlowerInPossession() {
        return flowersInPossession;
    }

    public ArrayList<Flower> getFlowersToSell(final String flowerName, final int amount) {
        final ArrayList<Flower> flowers = new ArrayList<>();
        for (final Flower flower : flowersInPossession) {
            if (flower.getName().equals(flowerName)) {
                flowers.add(flower);

                if (flowers.size() == amount) {
                    break;
                }
            }
        }
        return flowers;
    }

    public boolean isFlowerAvailable(final String flowerName, final int amount) {
        int i = 0;
        for (final Flower flower : flowersInPossession) {
            if (flower.getName().equals(flowerName)) {
                i++;
                if (i == amount) {
                    return true;
                }
            }
        }
        if (i != 0) {
            System.out.println("We're Sorry, we only have " + i + " " + flowerName + "s in stock");
        }
        return false;
    }

    public int getAmountFlowers() {
        final int getSizeFlower = getFlowerInPossession().size();
        return getSizeFlower;
    }

    public void addFlowers(final List<Flower> flowers) {
        flowersInPossession.addAll(flowers);
    }

    public String chooseFlower(final int digit) {
        if (flowersInPossession.size() >= digit) {
            final Flower choosenFlower = flowersInPossession.get(digit);
            final String flowerName = choosenFlower.getName();
            return flowerName;
        }
        return null;
    }

    //TODO: printBlumenInfo return String!!!
    public StringBuilder returnFlowerInformation(final String flowerName) {
        for (final Flower flower : flowersInPossession) {
            if (flower.getName().equals(flowerName)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Information about " + flower.getName());
                stringBuilder.append("\nRecommended temperature: " + flower.getRecommendedTemperature());
                stringBuilder.append("\nPrice: " + flower.getPrice());
                stringBuilder.append("\nRequires Light: " + flower.getLightRequired());
                stringBuilder.append("\nSize when bought: " + flower.getSizeInCm());
                return stringBuilder;
            }
        }
        return null;
    }

    public void printBlumen() {
        final ArrayList<String> AvailableFlowers = new ArrayList<>();
        for (final Flower flower : flowersInPossession) {
            if (!AvailableFlowers.contains(flower.getName())) {
                AvailableFlowers.add(flower.getName());
            }
        }
        AvailableFlowers.forEach(System.out::println);
    }
}

