package test.java;

import main.java.Flower;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlowerTest {
    @Test
    void givenFlowerWithNameWhenNameRoseThenReturnRose() {
        //Arrange
        Flower testee = new Flower("rose", 39, 20, true, 25, true);
        //Act
        String actual = testee.getName();
        //Assert
        assertEquals("rose", actual);
    }

    @Test
    void givenFlowerWithPriceWhenPrice39ThenReturn39() {
        //Arrange
        Flower testee = new Flower("rose", 39, 20, true, 25, true);
        //Act
        double actual = testee.getPrice();
        //Assert
        assertEquals(39, actual);
    }

    @Test
    void givenFlowerWithLightWhenLightIsTrueThenReturnTrue() {
        //Arrange
        Flower testee = new Flower("rose", 39, 20, true, 25, true);
        //Act
        String actual = testee.getLightRequired();
        //Assert
        assertEquals("Yes", actual);
    }

    @Test
    void givenFlowerWithSizeWhenSize20ThenReturn20() {
        //Arrange
        Flower testee = new Flower("rose", 39, 20, true, 25, true);
        //Act
        double actual = testee.getSizeInCm();
        //Assert
        assertEquals(20, actual);
    }

    @Test
    void givenFlowerWithTemperatureWhenNameTemperature25ThenReturn25() {
        //Arrange
        Flower testee = new Flower("rose", 39, 20, true, 25, true);
        //Act
        int actual = testee.getRecommendedTemperature();
        //Assert
        assertEquals(25, actual);
    }

    @Test
    void givenFlowerWhitPriceWhenSetPrice60ThenReturn60() {
        //Arrange
        Flower testee = new Flower("rose", 39, 20, true, 25, true);
        testee.setPrice(60);
        //Act
        double actual = testee.getPrice();
        //Assert
        assertEquals(60, actual);
    }
}
