package ch.css.lernende.flowershop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class FlowerDealerTest {

    @Test
    void givenFlowerDealerWithRoseWhenCreateRoseThenReturnRose() {
        //Arrange
        final FlowerDealer testee = new FlowerDealer("rose", 200);
        //Act
        final String actual = testee.getSpecialisedFlower();
        //Assert
        Assertions.assertEquals("rose", actual);
    }

    @Test
    void givenFlowerDealerWithTulipDeliverWhenOrderFlowerThenReturnOrderedFlowers() {
        //Arrange
        final FlowerDealer testee = new FlowerDealer("tulip", 300);
        //Act
        final List<Flower> actual = testee.order(10);
        //Assert
        Assertions.assertEquals(10, actual.size());
    }
}
