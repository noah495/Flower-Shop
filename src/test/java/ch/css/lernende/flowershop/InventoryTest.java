package ch.css.lernende.flowershop;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InventoryTest {
   /* @Test
    voi*/

    @Test
    void givenInventoryCurrency2100WhenAddCurrency200ThenReturnCurrency2300() {
        //Arrange
        final Inventory testee = new Inventory();
        testee.addCurrency(200);
        //Act
        final double actual = testee.getCurrency();
        //Assert
        assertEquals(2200, actual);
    }

    @Test
    void givenInventoryCurrency2100WhenSubtractCurrency100ThenReturnStringAndBalance() {
        //Arrange
        final Inventory testee = new Inventory();

        //Act
        final String actual = testee.subtractCurrency(100);
        //Assert
        assertEquals("Your new balance is: 2000.0$\n", actual);
    }

    @Test
    void givenInventoryCurrency2100WhenSubtractCurrency2200ThenReturnStringNotEnoughMoney() {
        //Arrange
        final Inventory testee = new Inventory();
        //Act
        final String actual = testee.subtractCurrency(2200);
        //Assert
        assertEquals("You're too broke", actual);
    }

    @Test
    void givenInventoryFlowersInPossessionWhenFlowerInPossessionIs20RoseThenReturnSize20() {
        //Arrange
        final FlowerDealer flowerDealer = new FlowerDealer("rose", 200);
        final List<FlowerDealer> flowerDealers = Collections.singletonList(flowerDealer);
        final FlowerShop testee = new FlowerShop("LeoniesParkShop", "Garden", flowerDealers);
        testee.orderFlower(20, "rose");

        //Act
        final int actual = testee.getFlowersInPossession().size();

        //Assert
        assertEquals(20, actual);
    }

    @Test
    void givenInventoryIsFlowerAvailableWhenFlowerAvailable10roseThenReturnTrue() {
        //Arrange
        final FlowerDealer flowerDealer = new FlowerDealer("rose", 100);
        final List<FlowerDealer> flowerDealers = Collections.singletonList(flowerDealer);
        final FlowerShop testee = new FlowerShop("flowerz", "wallstreet", flowerDealers);
        testee.orderFlower(20, "rose");
        //Act
        final boolean actual = testee.isFlowerAvailable("rose", 10);
        //Assert
        assertEquals(true, actual);
    }

    @Test
    void givenInventoryGetAmountFlowersWhenFlowerAmountIs49TulipThenReturn10() {
        //Arrange
        final FlowerDealer flowerDealer = new FlowerDealer("tulip", 250);
        final List<FlowerDealer> flowerDealers = Collections.singletonList(flowerDealer);
        final FlowerShop testee = new FlowerShop("flowerz", "wallstreet", flowerDealers);
        testee.orderFlower(49, "tulip");
        //Act
        final int actual = testee.getInventory().getAmountFlowers();
        //Assert
        assertEquals(49, actual);
    }

    @Test
    void givenInventoryGetFlowersToSellWhenStoreHas32TulipThenReturnFlowersToSellSize32() {
        //Arrange
        final FlowerDealer flowerDealer = new FlowerDealer("tulip", 100);
        final List<FlowerDealer> flowerDealers = Collections.singletonList(flowerDealer);
        final FlowerShop testee = new FlowerShop("flowerz", "wallstreet", flowerDealers);
        testee.orderFlower(32, "tulip");
        //Act
        final int actual = testee.getInventory().getFlowersToSell("tulip", 32).size();
        //Assert
        assertEquals(32, actual);
    }

    @Test
    void givenInventoryReturnFlowerInformationWhenFlowerTulipThenReturnTulipInformation() {
        //Arrange
        final FlowerDealer flowerDealer = new FlowerDealer("tulip", 200);
        final List<FlowerDealer> flowerDealers = Collections.singletonList(flowerDealer);
        final FlowerShop testee = new FlowerShop("flowerz", "wallstreet", flowerDealers);
        testee.getInventory().addCurrency(2000);
        testee.orderFlower(50, "tulip");
        final String expected = "Information about tulip\nRecommended temperature: 10\nPrice: 6.9\nRequires Light: No\nSize when bought: 14";

        //Act
        final String actual = testee.getInventory().getFlowerInformation("tulip").get();
        //Assert
        assertEquals(expected, actual.toString());
    }
}
