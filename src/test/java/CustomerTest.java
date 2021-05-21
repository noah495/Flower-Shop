package test.java;

import main.java.Customer;
import org.junit.jupiter.api.Test;

class CustomerTest {
    @Test
    void givenCostumerBuys20TulipWhenCostumerBuys20FlowerBoughtFlowerSizeIs20() {
        //Arrange

        Customer testee = new Customer("John", );
        //Act
        int actual = boughtFlowers.size();
        //Assert
        assertEquals(20, actual);
    }
}