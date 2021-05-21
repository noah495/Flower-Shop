package ch.css.lernende.flowershop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {
    @Test
    void givenInventoryCurrency2100WhenAddCurrency200ThenReturnCurrency2300() {
        //Arrange
        Inventory testee = new Inventory();
        testee.addCurrency(200);
        //Act

        //Assert

    }

}