package com.fizzbuzz;

import java.util.Optional;
import java.util.stream.IntStream;

/**
 * Created by nehamansha on 04/12/2019.
 */

public class FizzBuzz {

    private static String FIZZ = "Fizz";
    private static String BUZZ = "Buzz";
    private static String FIZZ_BUZZ = "FizzBuzz";


    /**
     * prints the numbers from 1 to 100.
     *
     * @param args
     */
    public static void main(String[] args) {
        IntStream.range(0, 100).forEach(
                n -> System.out.println(fizzBuzz(n))
        );
    }


    /**
     * For multiples of three print “Fizz”. For the multiples of five print “Buzz”.
     * For numbers which are multiples of both three and five print “FizzBuzz”.
     *
     * @param input
     * @return String
     */
    public static String fizzBuzz(int input) {

        return Optional.of(input).map(i -> {
            if (i % (3 * 5) == 0) {
                return FIZZ_BUZZ;
            } else if (i % 3 == 0) {
                return FIZZ;
            } else if (i % 5 == 0) {
                return BUZZ;
            } else {
                return Integer.toString(i);
            }
        }).get();
    }

}