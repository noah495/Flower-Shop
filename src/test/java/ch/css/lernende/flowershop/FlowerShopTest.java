package ch.css.lernende.flowershop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class FlowerShopTest {

    @Test
    void givenShopWithNamePaulaWhenGetShopNameThenReturnPaula() {
        // Arrange
        final FlowerShop testee = new FlowerShop("Paula", "Seestrasse", Collections.emptyList());
        // Act
        final String actual = testee.getShopName();
        // Assert
        Assertions.assertEquals("Paula", actual);
    }

    @Test
    void givenShopWithAddressSeestrasseWhenGetShopAddressThenReturnSeestrasse() {
        //Arange
        final FlowerShop testee = new FlowerShop("Paula", "Seestrasse", Collections.emptyList());
        //Act
        final String actual = testee.getAddress();
        //Assert
        Assertions.assertEquals("Seestrasse", actual);
    }

    @Test
    void givenShopWithCurrency2100WhenGetCurrencyThenReturn2100() {
        //Arrange
        final FlowerShop testee = new FlowerShop("Paula", "Seestrasse", Collections.emptyList());
        //Act
        final double actual = testee.getInventory().getCurrency();
        //Assert
        Assertions.assertEquals(2100, actual);
    }

    @Test
    void givenShopWithFlowerDealersTuilpAndRoseWhenIsFlowerExistingSunflowerThenReturnFalse() {
        //FlowerDealer > Blumen zuweisen > Blume bestellen! > Überprüfen
        //Arrange
        final FlowerDealer flowerDealerTulip = new FlowerDealer("tulip", 200);
        final FlowerDealer flowerDealerRose = new FlowerDealer("rose", 100);
        final List<FlowerDealer> availableFlowerDealer = new ArrayList<FlowerDealer>();
        final FlowerShop testee = new FlowerShop("Paula", "Seestrasse", availableFlowerDealer);
        //Act
        testee.orderFlower(10, "tulip");
        testee.orderFlower(10, "rose");
        final boolean actual = testee.getInventory().getFlowerInPossession().stream().filter(flower -> flower.getName().equals("sunflower")).findFirst().isPresent();
        //Arrange
        Assertions.assertEquals(false, actual);
    }

    @Test
    void givenShopWithFlowerDealersTuilpAndRoseWhenIsFlowerExistingTulipThenReturnTrue() {

        final FlowerDealer flowerDealerTulip = new FlowerDealer("tulip", 400);
        final FlowerDealer flowerDealerRose = new FlowerDealer("rose", 300);
        final List<FlowerDealer> availableFlowerDealer = new ArrayList<FlowerDealer>();
        availableFlowerDealer.add(flowerDealerTulip);
        availableFlowerDealer.add(flowerDealerRose);
        final FlowerShop testee = new FlowerShop("Paula", "Seestrasse", availableFlowerDealer);
        testee.orderFlower(10, "tulip");
        testee.orderFlower(10, "rose");

        //Act
        final boolean actual =  testee.getInventory().getFlowerInPossession().stream().filter(flower -> flower.getName().equals("tulip")).findFirst().isPresent();
        //Arrange
        Assertions.assertEquals(true, actual);
    }
}
