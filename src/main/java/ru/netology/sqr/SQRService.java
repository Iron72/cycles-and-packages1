package ru.netology.sqr;

public class SQRService {

    public int calculateSquare(int limitLow, int limitUp) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= limitLow && i * i <= limitUp) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}