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
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {

        for (int i = 0; i < objectArray.length; i++) {
            if (!getNumberOfOccurrences(objectArray[i]).equals(objectToRemove)) {
                extractIndexValueAndAppendToOutput(i);
            }

        }
        return getOutput();
    }
    protected void extractIndexValueAndAppendToOutput (Object[] objectArray){
        // Getting value from Input array at index
        Integer value = objectArray[indexValue];

        // create a new array that is one size bigger than current output
        Integer[] tempArray = new Integer[objectArray.length + 1];

        //Copy all of the contents from the original output array into our temp array
        System.arraycopy(objectArray, 0, tempArray, 0, objectArray.length);

        // new value and place in the last slot of temp array
        tempArray[tempArray.length - 1] = value;

        // no longer point to original array point to temp array
        this.output = tempArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        return null;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        return null;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {

        Collection<Object> result = new ArrayList<Object>(objectArray.length + objectArrayToAdd.length);
        for (Object val : objectArray) {
            result.add(val);
        }
        for (Object val : objectArrayToAdd) {
            result.add(val);
        }
        return result.toArray();
    }
}
