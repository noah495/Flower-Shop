package ch.css.lernende.flowershop;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {
    @Test
    void givenCostumerBuys20TulipWhenCostumerBuys20FlowerThenBoughtFlowerSizeIs20() {
        //Arrange
        final FlowerDealer flowerDealerWithTulip = new FlowerDealer("tulip", 100);
        final List<FlowerDealer> flowerDealers = Collections.singletonList(flowerDealerWithTulip);
        final FlowerShop flowerShopWithTulip = new FlowerShop("Flower", "Tribschen", flowerDealers);
        flowerShopWithTulip.getInventory().addCurrency(2000);
        flowerShopWithTulip.orderFlower(20, "tulip");
        final List<FlowerShop> availableFlowers = Collections.singletonList(flowerShopWithTulip);
        final Customer testee = new Customer("John", availableFlowers);
        testee.buyFlower(20, "tulip");
        //Act
        final List<Flower> actual = testee.getBoughtFlowers();
        //Assert
        assertEquals(20, actual.size());
        assertEquals("tulip", actual.get(0).getName());
    }

    @Test
    void givenCustomerWithTulipWhenCustomerRequestInformationThenReturnTulipInformation() {
        //Arrange
        final FlowerDealer flowerDealer = new FlowerDealer("tulip", 100);
        final List<FlowerDealer> flowerDealers = Collections.singletonList(flowerDealer);
        final FlowerShop flowerShop = new FlowerShop("NoahsFlowerPower", "Hergiswil", flowerDealers);
        flowerShop.getInventory().addCurrency(2000);
        flowerShop.orderFlower(2, "tulip");

        final List<FlowerShop> flowerShops = Collections.singletonList(flowerShop);
        final Customer testee = new Customer("Natascha", flowerShops);
        testee.buyFlower(1, "tulip");
        final String expected = "Information about tulip\nRecommended temperature: 10\nPrice: 6.9\nRequires Light: No\nSize when bought: 14";
        //Act
        final Optional<String> actual = testee.getFlowerInformation("tulip");
        //Assert
        assertEquals(expected, actual.toString());
    }

    @Test
    void givenCustomerWithNoFlowerWhenCostumerRequestInformationThenReturnNull() {
        //Arrange
        final Customer testee = new Customer("Jack", Collections.emptyList());
        //Act
        final Optional<String> actual = testee.getFlowerInformation(null);
        //Assert
        assertEquals(null, actual);
    }
}
