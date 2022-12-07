package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    public void calcWhenFewSguaresFound() {
        SQRService service = new SQRService();

        int actual = service.countSguares(200, 300);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfSquaresExceedingMinimumLimit() {
        SQRService service = new SQRService();

        int expected = 0;
        int min = 10;
        int max = 99;

        int actual = service.countSguares(min, max);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateNumberOfSquaresMinimumLimit() {
        SQRService service = new SQRService();

        int expected = 4;
        int min = 300;
        int max = 600;

        int actual = service.countSguares(min, max);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfSquaresMaximumLimit() {
        SQRService service = new SQRService();

        int expected = 1;
        int min = 100;
        int max = 10_000;

        int actual = service.countSguares(min, max);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfSquaresExceedingMaximumLimit() {
        SQRService service = new SQRService();

        int expected = 0;
        int min = 90;
        int max = 90;

        int actual = service.countSguares(min, max);

        assertEquals(expected, actual);
    }
}
