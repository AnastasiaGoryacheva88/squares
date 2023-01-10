package ru.netology.sqr;

public class SQRService {
    public int numberOfSquares(int minLimit, int maxLimit) {
        int number = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i <= maxLimit & i * i >= minLimit) {
                number++;
            }
        }
        return number;
    }

}

