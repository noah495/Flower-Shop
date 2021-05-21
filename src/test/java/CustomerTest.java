package java;

import main.java.Customer;
import main.java.FlowerDealer;
import main.java.FlowerShop;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

class CustomerTest {
    @Test
    void givenCostumerBuys20TulipWhenCostumerBuys20FlowerBoughtFlowerSizeIs20() {
        //Arrange
        FlowerDealer flowerDealerWithTulip = new FlowerDealer("tulip");
        FlowerShop flowerShopWithTulip = new FlowerShop("Flower", "Tribschen", Collections.emptyList());
        List<FlowerShop> availableFlowers = Collections.singletonList(flowerShopWithTulip);
        Customer testee = new Customer("John", availableFlowers);
        //Act
        int actual = testee.
                //Assert
                        assertEquals(20, actual);
    }
}