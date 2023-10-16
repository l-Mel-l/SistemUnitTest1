package org.example;

public class Calculator {

    public int calc1(int x) {

        return 3 * x + 5;
    }

    public int calc2(int a, int b) {
            return (a + b) / (a - b);
    }

    public int calc3(int a, int x, int b) {
        double y = (a * x / b);
        int result = 1;
        for (int i = 1; i <= y; i++) {
            result = result * i;
        }
        return result;
        }

    }

