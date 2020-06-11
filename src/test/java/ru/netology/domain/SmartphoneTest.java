package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartphoneTest {

    @Test
    public void shouldFindSmartphoneOfName() {
        Smartphone smartphone = new Smartphone();

        smartphone.setName("Iphone 11");
        smartphone.setManufacturer("Apple");

        boolean expected = true;
        boolean actual = smartphone.matches("Iphone 11");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindSmartphoneOfManufacturer() {
        Smartphone smartphone = new Smartphone();

        smartphone.setName("Iphone 11");
        smartphone.setManufacturer("Apple");

        boolean expected = true;
        boolean actual = smartphone.matches("Apple");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotFindSmartphoneOfName() {
        Smartphone smartphone = new Smartphone();

        smartphone.setName("Iphone 11");
        smartphone.setManufacturer("Apple");

        boolean expected = false;
        boolean actual = smartphone.matches("Samsung A30");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotFindSmartphoneOfManufacturer() {
        Smartphone smartphone = new Smartphone();

        smartphone.setName("Iphone 11");
        smartphone.setManufacturer("Apple");

        boolean expected = false;
        boolean actual = smartphone.matches("Samsung");

        assertEquals(expected, actual);
    }
}