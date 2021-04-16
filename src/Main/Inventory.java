package Main;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Flower> flowers = new ArrayList<>();

    public List<Flower> getFlowers(){
        return flowers;
    }

    public void setFlowers(List<Flower> flowers){
        this.flowers = flowers;
    }

    public void addFlower(Flower flower){
        flowers.add(flower);
    }

    public void removeFlower(Flower flower){
        flowers.remove(flower);
    }

    public void printInfo(Flower flower){
        flower.printInfo();
        System.out.println("In possession: " + countFlower(flower.getName()));
    }

    public int countFlower(String flowerName){
        int matches = 0;
        for (int i = 0; i < flowers.size(); i++) {
            if (flowers.get(i).getName().equals(flowerName)) {
                matches++;
            }
        }
        return matches;
    }
}



