package java;

import main.java.Customer;
import main.java.FlowerDealer;
import main.java.FlowerShop;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {
    @Test
    void givenCostumerBuys20TulipWhenCostumerBuys20FlowerBoughtFlowerSizeIs20() {
        //Arrange
        FlowerDealer flowerDealerWithTulip = new FlowerDealer("tulip");
        FlowerShop flowerShopWithTulip = new FlowerShop("Flower", "Tribschen", Collections.emptyList());
        flowerShopWithTulip.orderFlower(20, "tulip");
        List<FlowerShop> availableFlowers = Collections.singletonList(flowerShopWithTulip);
        Customer testee = new Customer("John", availableFlowers);
        testee.buyFlower(20, "tulip");
        //Act
        int actual = testee.getBoughtFlowers().size();
        //Assert
        assertEquals(20, actual);
    }
}