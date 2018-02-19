package com.zipcodewilmington.assessment1.part1;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }


    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        int sum = 1;

        for (int i = 1; i <= n; i++) {

            sum *= i;
        }
        return sum;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        StringBuilder result = new StringBuilder(val.toString()); //turing val into a string
        //reversing string, turning from SB to string then parsing into Int.
        int result1 = Integer.parseInt(result.reverse().toString());
        return result1;

    }
}
