package com.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static com.fizzbuzz.FizzBuzz.fizzBuzz;
import static com.fizzbuzz.FizzBuzzTest.BUZZ;
import static com.fizzbuzz.FizzBuzzTest.FIZZ;
import static com.fizzbuzz.FizzBuzzTest.FIZZ_BUZZ;

public class FizzBuzzAppTest {


    /**
     * Write a program that prints the numbers from 1 to 100.
     * For multiples of three print “Fuzz” instead of the number
     * For the multiples of five print “Buzz”.
     * For numbers which are multiples of both three and five print “FuzzBuzz”
     */

    @Test
    public void testAllNumbers() {

        boolean isMultipleOfFivenThree;
        boolean isMultipleOfThree;
        boolean isMultipleOfFive;
        for (int testThis = 1; testThis <= 100; testThis++) {

            String expectedVal = String.valueOf(testThis);

            isMultipleOfFivenThree = testThis % (3 * 5) == 0 ? true : false;
            isMultipleOfFive = testThis % 5 == 0 ? true : false;
            isMultipleOfThree = testThis % 3 == 0 ? true : false;

            if (isMultipleOfFivenThree) {
                expectedVal = FIZZ_BUZZ;
            } else if (isMultipleOfFive) {
                expectedVal = BUZZ;
            } else if (isMultipleOfThree) {
                expectedVal = FIZZ;
            }

            Assert.assertEquals(expectedVal, fizzBuzz(testThis));
        }


    }


    /**
     * Test for pre-created list of numbers
     * FuzzBuzz = 15, 30, 45, 60, 75, 90
     * Buzz 5, 10,..
     * Fuzz 3, 6, 9, 12,..
     */
    @Test
    public void testValueForNumbers1To100BasedOnList() {

        Integer fizzBuzz[] = {15, 30, 45, 60, 75, 90};
        Integer buzz[] = {5, 10, 20, 25, 35, 40, 50, 55, 65, 70, 80, 85, 95, 100};
        Integer fizz[] = {3, 6, 9, 12, 18, 21, 24, 27, 33, 36, 39,
                42, 48, 51, 54, 57, 63, 66, 69, 72, 78,
                81, 84, 87, 93, 96, 99};


        for (int checkThis = 1; checkThis <= 100; checkThis++) {

            boolean checkedIt = false;

            if (Arrays.asList(fizz).contains(checkThis)) {
                Assert.assertEquals(FIZZ, fizzBuzz(checkThis));
                checkedIt = true;
            }

            if (Arrays.asList(buzz).contains(checkThis)) {
                Assert.assertEquals(BUZZ, fizzBuzz(checkThis));
                checkedIt = true;
            }

            if (Arrays.asList(fizzBuzz).contains(checkThis)) {
                Assert.assertEquals(FIZZ_BUZZ, fizzBuzz(checkThis));
                checkedIt = true;
            }

            if (!checkedIt) {
                Assert.assertEquals(String.valueOf(checkThis), fizzBuzz(checkThis));
                checkedIt = true;
            }

            Assert.assertEquals(true, checkedIt);

        }
    }


}
