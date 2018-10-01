package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void displayNextDay() {
        String expected = "The next day: 2/1/2018";
        NextDayCalculator nextDayCalculator = new NextDayCalculator(1, 1, 2018);
        String result = nextDayCalculator.displayNextDay();
        assertEquals(expected, result);
    }

    @Test
    void displayNextDay2(){
        String expected = "The next day: 1/2/2018";
        NextDayCalculator nextDayCalculator = new NextDayCalculator(31, 1, 2018);
        String result = nextDayCalculator.displayNextDay();
        assertEquals(expected, result);
    }

    @Test
    void displayNextDay3(){
        String expected = "The next day: 1/5/2018";
        NextDayCalculator nextDayCalculator = new NextDayCalculator(30, 4, 2018);
        String result = nextDayCalculator.displayNextDay();
        assertEquals(expected, result);
    }

    @Test
    void displayNextDay4(){
        String expected = "The next day: 1/3/2018";
        NextDayCalculator nextDayCalculator = new NextDayCalculator(28, 2, 2018);
        String result = nextDayCalculator.displayNextDay();
        assertEquals(expected, result);
    }

    @Test
    void displayNextDay5(){
        String expected = "The next day: 1/3/2020";
        NextDayCalculator nextDayCalculator = new NextDayCalculator(29, 2, 2020);
        String result = nextDayCalculator.displayNextDay();
        assertEquals(expected, result);
    }

    @Test
    void displayNextDay6(){
        String expected = "The next day: 1/1/2019";
        NextDayCalculator nextDayCalculator = new NextDayCalculator(31, 12, 2018);
        String result = nextDayCalculator.displayNextDay();
        assertEquals(expected, result);
    }
}