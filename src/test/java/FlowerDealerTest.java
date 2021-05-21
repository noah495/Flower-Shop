package java;

import main.java.Flower;
import main.java.FlowerDealer;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlowerDealerTest {

    @Test
    void givenFlowerDealerWithRoseWhenCreateRoseThenReturnRose() {
        //Arrange
        FlowerDealer testee = new FlowerDealer("rose");
        //Act
        String actual = testee.getSpecialisedFlower();
        //Assert
        assertEquals("rose", actual);
    }

    @Test
    void givenFlowerDealerWithTulipDeliverWhenOrderFlowerThenReturnOrderedFlowers() {
        //Arrange
        FlowerDealer testee = new FlowerDealer("tulip");
        //Act
        List<Flower> actual = testee.order(10);
        //Assert
        assertEquals(10, actual.size());
    }
}