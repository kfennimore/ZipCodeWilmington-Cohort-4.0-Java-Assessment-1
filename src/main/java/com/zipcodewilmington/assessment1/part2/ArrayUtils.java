package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {

        Integer count = 0;
        for (Object value : objectArray) {
            if (value.equals(objectToCount)) count++;
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Integer [] removeValue(Object[] objectArray, Object objectToRemove) {
        ArrayList<Integer> newArray = new ArrayList<>();
        for(int i = 0; i < objectArray.length; i++){
            if(!objectArray[i].equals(objectToRemove)) {
                newArray.add((Integer) objectArray[i]);
            }
        }
        return newArray.toArray(new Integer[0]);

        //MADE THIS RETURN AN INTEGER ARRAY AND CHANGED IT IN THE METHOD BECAUSE THE TEST CASE SPECIFIES THAT IT WANTS
        //TO RETURN AN INTEGER ARRAY!
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int count = 1;
        int tempCount;

        Object mostCommon = objectArray[0];
        Object temp = 0;

        for (int i = 0; i < (objectArray.length - 1); i++) {
            temp = objectArray[i];
            tempCount = 0;
            for (int j = 1; j < objectArray.length; j++) {
                if (temp == objectArray[j])
                    tempCount++;
            }
            if (tempCount > count) {
                mostCommon = temp; //objectArray[i]
                count = tempCount;
            }
        }
        return mostCommon;
    }



    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        int count = objectArray.length;
        int tempCount;

        Object leastCommon = objectArray[0];
        Object temp;

        for (int i = 0; i < (objectArray.length - 1); i++) {
            temp = objectArray[i];
            tempCount = 0; //reinitialize to 0
            for (int j = 1; j < objectArray.length; j++) {
                if (temp == objectArray[j])
                    tempCount++;
            }
            if (tempCount <= count)
            {
                leastCommon = temp;
                count = tempCount;
            }
        }
        return leastCommon;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {

        Collection<Integer> result = new ArrayList<Integer>(objectArray.length + objectArrayToAdd.length);
        for (Object val : objectArray) {
            result.add((Integer) val);
        }
        for (Object val : objectArrayToAdd) {
            result.add((Integer) val);
        }
        return result.toArray(new Integer[0]);
    }
}
