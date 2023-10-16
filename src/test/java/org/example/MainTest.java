package org.example;

import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void main() {
        Calculator Сalc1 = new Calculator();
        int actual1 = Сalc1.calc1(3);
        int actual2 = Сalc1.calc2(5, 2);
        int actual3 = Сalc1.calc3(5, 3, 2);
        int expected1 = 14;
        int expected2 = 2;
        int expected3 = 5040;
        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
        assertEquals(expected3,actual3);
    }
}