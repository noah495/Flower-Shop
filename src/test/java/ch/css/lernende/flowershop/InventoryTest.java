package ch.css.lernende.flowershop;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InventoryTest {
    @Test
    void givenInventoryCurrency2100WhenAddCurrency200ThenReturnCurrency2300() {
        //Arrange
        final Inventory testee = new Inventory();
        testee.addCurrency(200);
        //Act
        final double actual = testee.getCurrency();
        //Assert
        assertEquals(2300, actual);
    }

    @Test
    void givenInventoryCurrency2100WhenSubtractCurrency100ThenReturnCurrency2000() {
        //Arrange
        final Inventory testee = new Inventory();
        testee.subtractCurrency(100);
        //Act
        final double actual = testee.getCurrency();
        //Assert
        assertEquals(2000, actual);
    }

    @Test
    void givenInventoryFlowersInPossessionWhenFlowerInPossessionIs20RoseThenReturnSize20() {
        //Arrange
        final FlowerDealer flowerDealer = new FlowerDealer("rose");
        final List<FlowerDealer> flowerDealers = Collections.singletonList(flowerDealer);
        final FlowerShop flowerShop = new FlowerShop("LeoniesParkShop", "Garden", flowerDealers);
        flowerShop.orderFlower(20, "rose");
        final Inventory testee = new Inventory();
        //Act
        final int actual = testee.getFlowerInPossession().size();
        //Assert
        assertEquals(20, actual);
    }
}