package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        int counter = 0;
        ArrayList<Integer> noEvens = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                noEvens.add(ints[i]);
            }
            counter++;
        }
        return noEvens.toArray(new Integer[0]); //toArray is casting to empty Integer Array
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        int counter = 0;
        ArrayList<Integer> noOdds = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                noOdds.add(ints[i]);
            }
            counter++;
        }
        return noOdds.toArray(new Integer[0]);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        int counter = 0;
        ArrayList<Integer> multiplesOf3 = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 3 != 0) {
                multiplesOf3.add(ints[i]);
            }
            counter++;
        }
        return multiplesOf3.toArray(new Integer[0]);
    }


    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        int counter = 0;
        ArrayList<Integer> multiplesOfN = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % multiple != 0) {
                multiplesOfN.add(ints[i]);
            }
            counter++;
        }
        return multiplesOfN.toArray(new Integer[0]);
    }
}
