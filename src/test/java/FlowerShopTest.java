package test.java;

import main.java.FlowerDealer;
import main.java.FlowerShop;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlowerShopTest {

    //TODO: Google für Test-Naming Java (given.. when.. then..)
    //TODO: Google List, ArrayList, Hashlist Java (unterschied, ...)
    @Test
    void givenShopWithNamePaulaWhenGetShopNameThenReturnPaula() {
        // Arrange
        FlowerShop testee = new FlowerShop("Paula", "Seestrasse", Collections.emptyList());
        // Act
        String actual = testee.getShopName();
        // Assert
        assertEquals("Paula", actual);
    }

    @Test
    void givenShopWithAddressSeestrasseWhenGetShopAddressThenReturnSeestrasse() {
        //Arange
        FlowerShop testee = new FlowerShop("Paula", "Seestrasse", Collections.emptyList());
        //Act
        String actual = testee.getAddress();
        //Assert
        assertEquals("Seestrasse", actual);
    }

    @Test
    void givenShopWithCurrency2100WhenGetCurrencyThenReturn2100() {
        //Arrange
        FlowerShop testee = new FlowerShop("Paula", "Seestrasse", Collections.emptyList());
        //Act
        double actual = testee.getInventory().getCurrency();
        //Assert
        assertEquals(2100, actual);
    }

    @Test
    void givenShopWithFlowerDealersTuilpAndRoseWhenIsFlowerExistingSunflowerThenReturnFalse() {
        //FlowerDealer > Blumen zuweisen > Blume bestellen! > Überprüfen
        //Arrange
        FlowerDealer flowerDealerTulip = new FlowerDealer("tulip");
        FlowerDealer flowerDealerRose = new FlowerDealer("rose");
        List<FlowerDealer> availableFlowerDealer = new ArrayList<FlowerDealer>();
        FlowerShop testee = new FlowerShop("Paula", "Seestrasse", availableFlowerDealer);
        //Act
        testee.orderFlower(10, "tulip");
        testee.orderFlower(10, "rose");
        boolean actual = testee.isFlowerExisting("sunflower");
        //Arrange
        assertEquals(false, actual);
    }

    @Test
    void givenShopWithFlowerDealersTuilpAndRoseWhenIsFlowerExistingTulipThenReturnTrue() {

        FlowerDealer flowerDealerTulip = new FlowerDealer("tulip");
        FlowerDealer flowerDealerRose = new FlowerDealer("rose");
        List<FlowerDealer> availableFlowerDealer = new ArrayList<FlowerDealer>();
        availableFlowerDealer.add(flowerDealerTulip);
        availableFlowerDealer.add(flowerDealerRose);
        FlowerShop testee = new FlowerShop("Paula", "Seestrasse", availableFlowerDealer);
        testee.orderFlower(10, "tulip");
        testee.orderFlower(10, "rose");

        //Act
        boolean actual = testee.isFlowerExisting("tulip");
        //Arrange
        assertEquals(true, actual);
    }
}