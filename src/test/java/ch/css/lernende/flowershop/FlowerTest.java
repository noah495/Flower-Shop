package ch.css.lernende.flowershop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FlowerTest {
    @Test
    void givenFlowerWithNameWhenNameRoseThenReturnRose() {
        //Arrange
        Flower testee = new Flower("rose", 39, 20, true, 25, true);
        //Act
        String actual = testee.getName();
        //Assert
        Assertions.assertEquals("rose", actual);
    }

    @Test
    void givenFlowerWithPriceWhenPrice39ThenReturn39() {
        //Arrange
        Flower testee = new Flower("rose", 39, 20, true, 25, true);
        //Act
        double actual = testee.getPrice();
        //Assert
        Assertions.assertEquals(39, actual);
    }

    @Test
    void givenFlowerWithLightWhenLightIsTrueThenReturnTrue() {
        //Arrange
        Flower testee = new Flower("rose", 39, 20, true, 25, true);
        //Act
        String actual = testee.getLightRequired();
        //Assert
        Assertions.assertEquals("Yes", actual);
    }

    @Test
    void givenFlowerWithSizeWhenSize20ThenReturn20() {
        //Arrange
        Flower testee = new Flower("rose", 39, 20, true, 25, true);
        //Act
        double actual = testee.getSizeInCm();
        //Assert
        Assertions.assertEquals(20, actual);
    }

    @Test
    void givenFlowerWithTemperatureWhenNameTemperature25ThenReturn25() {
        //Arrange
        Flower testee = new Flower("rose", 39, 20, true, 25, true);
        //Act
        int actual = testee.getRecommendedTemperature();
        //Assert
        Assertions.assertEquals(25, actual);
    }

    @Test
    void givenFlowerWhitPriceWhenSetPrice60ThenReturn60() {
        //Arrange
        Flower testee = new Flower("rose", 39, 20, true, 25, true);
        testee.setPrice(60);
        //Act
        double actual = testee.getPrice();
        //Assert
        Assertions.assertEquals(60, actual);
    }
}
