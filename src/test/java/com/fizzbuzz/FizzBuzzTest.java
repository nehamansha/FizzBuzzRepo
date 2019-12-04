package com.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static com.fizzbuzz.FizzBuzz.fizzBuzz;

public class FizzBuzzTest {

    protected static String FIZZ = "Fizz";
    protected static String BUZZ = "Buzz";
    protected static String FIZZ_BUZZ = "FizzBuzz";

    @Test
    public void printNumber_NonMultiplesNumbersTest() {

        Assert.assertEquals("1", fizzBuzz(1));
        Assert.assertEquals("2", fizzBuzz(2));

    }

    @Test
    public void printFizz_MultiplesOfThreeTest() {

        Assert.assertEquals(FIZZ, fizzBuzz(3));

    }

    @Test
    public void printBuzz_MultiplesOfFiveTest() {

        Assert.assertEquals(BUZZ, fizzBuzz(5));

    }

    @Test
    public void printFizzBuzz_MultiplesOfBothThreeAndFive() {

        Assert.assertEquals(FIZZ_BUZZ, fizzBuzz(15));
    }


    /**
     * Using model based on the acceptance criteria
     * 1 == 1
     * 2 == 2
     * 3 == Fizz
     * 4 == 4
     * 5 == Buzz
     * 6 == Fizz
     * 7 == 7
     * 8 == 8
     * 9 == Fizz
     * 10 == Buzz
     * ... 12
     * 15 == FizzBuzzTest
     * 100 == Buzz
     */

    @Test
    public void checkAcceptanceCriteriaTest() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals("1", fizzBuzz.fizzBuzz(1));
        Assert.assertEquals("2", fizzBuzz.fizzBuzz(2));
        Assert.assertEquals(FIZZ, fizzBuzz.fizzBuzz(3));
        Assert.assertEquals("4", fizzBuzz.fizzBuzz(4));
        Assert.assertEquals(BUZZ, fizzBuzz.fizzBuzz(5));
        Assert.assertEquals(FIZZ, fizzBuzz.fizzBuzz(6));
        Assert.assertEquals("7", fizzBuzz.fizzBuzz(7));
        Assert.assertEquals("8", fizzBuzz.fizzBuzz(8));
        Assert.assertEquals(FIZZ, fizzBuzz.fizzBuzz(9));
        Assert.assertEquals(BUZZ, fizzBuzz.fizzBuzz(10));
        Assert.assertEquals("11", fizzBuzz.fizzBuzz(11));
        Assert.assertEquals(FIZZ, fizzBuzz.fizzBuzz(12));
        Assert.assertEquals("13", fizzBuzz.fizzBuzz(13));
        Assert.assertEquals("14", fizzBuzz.fizzBuzz(14));
        Assert.assertEquals(FIZZ_BUZZ, fizzBuzz.fizzBuzz(15));
        Assert.assertEquals("16", fizzBuzz.fizzBuzz(16));
        Assert.assertEquals(BUZZ, fizzBuzz.fizzBuzz(100));

    }

}
