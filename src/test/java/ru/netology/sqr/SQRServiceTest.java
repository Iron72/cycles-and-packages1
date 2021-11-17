package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldValue() {
        SQRService service = new SQRService();

        int limitLow = 100;
        int limitUp = 200;
        int expected = 5;
        int actual = service.calculateSquare(limitLow, limitUp);
        assertEquals(expected, actual);
    }

    @Test
    void shouldLimitsAreLessFirstValue() {
        SQRService service = new SQRService();

        int limitLow = 1;
        int limitUp = 99;
        int expected = 0;
        int actual = service.calculateSquare(limitLow, limitUp);
        assertEquals(expected, actual);
    }

    @Test
    void shouldLimitsAreFirstValue() {
        SQRService service = new SQRService();

        int limitLow = 100;
        int limitUp = 100;
        int expected = 1;
        int actual = service.calculateSquare(limitLow, limitUp);
        assertEquals(expected, actual);
    }

    @Test
    void shouldLimitUpIsGreaterFirstValueByOne() {
        SQRService service = new SQRService();

        int limitLow = 100;
        int limitUp = 101;
        int expected = 1;
        int actual = service.calculateSquare(limitLow, limitUp);
        assertEquals(expected, actual);
    }

    @Test
    void shouldLimitsAreLessLastValueByOne() {
        SQRService service = new SQRService();

        int limitLow = 9799;
        int limitUp = 9800;
        int expected = 0;
        int actual = service.calculateSquare(limitLow, limitUp);
        assertEquals(expected, actual);
    }

    @Test
    void shouldLimitsAreLastValue() {
        SQRService service = new SQRService();

        int limitLow = 9801;
        int limitUp = 9801;
        int expected = 1;
        int actual = service.calculateSquare(limitLow, limitUp);
        assertEquals(expected, actual);
    }

    @Test
    void shouldLimitsAreGreaterLastValue() {
        SQRService service = new SQRService();

        int limitLow = 9802;
        int limitUp = 9900;
        int expected = 0;
        int actual = service.calculateSquare(limitLow, limitUp);
        assertEquals(expected, actual);
    }
}