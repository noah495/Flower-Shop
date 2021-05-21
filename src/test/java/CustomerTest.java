package test.java;

import main.java.Customer;
import main.java.FlowerDealer;
import main.java.FlowerShop;
import main.java.Inventory;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {
    @Test
    void givenCostumerBuys20TulipWhenCostumerBuys20FlowerBoughtFlowerSizeIs20() {
        //Arrange
        FlowerDealer flowerDealerWithTulip = new FlowerDealer("tulip");
        List<FlowerDealer> flowerDealers = Collections.singletonList(flowerDealerWithTulip);
        FlowerShop flowerShopWithTulip = new FlowerShop("Flower", "Tribschen", flowerDealers);
        flowerShopWithTulip.orderFlower(20, "tulip");
        List<FlowerShop> availableFlowers = Collections.singletonList(flowerShopWithTulip);
        Customer testee = new Customer("John", availableFlowers);
        testee.buyFlower(20, "tulip");
        //Act
        int actual = testee.getBoughtFlowers().size();
        //Assert
        assertEquals(20, actual);
    }

    @Test
    void givenCustomerWithTulipWhenCustomerRequestInformationThenReturnTulipInformation() {
        //Arrange
        Inventory inventory = new Inventory();
        FlowerDealer flowerDealer = new FlowerDealer("tulip");
        List<FlowerDealer> flowerDealers = Collections.singletonList(flowerDealer);
        FlowerShop flowerShop = new FlowerShop("NoahsFlowerPower", "Hergiswil", flowerDealers);
        flowerShop.orderFlower(1, "tulip");
        List<FlowerShop> flowerShops = Collections.singletonList(flowerShop);
        Customer testee = new Customer("Natascha", flowerShops);
        testee.buyFlower(1, "tulip");

        //Act
        StringBuilder actual = testee.getFlowerInformation("tulip");
        //Assert

    }
}