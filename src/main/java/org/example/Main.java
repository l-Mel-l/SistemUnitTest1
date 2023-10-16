package org.example;
public class Main {
    public static void main(String[] args) {
        Calculator Сalc1 = new Calculator();
        int y1 = Сalc1.calc1(3);
        int y2 = Сalc1.calc2(5, 2);
        int y3 = Сalc1.calc3(5, 3, 2);
        System.out.println("Значение выражения 1: " + y1);
        System.out.println("Значение выражения 2: " + y2);
        System.out.println("Значение выражения 3: " + y3);
    }
}
