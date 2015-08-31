package com.dermotherlihy.array;

import java.util.NoSuchElementException;

/**
 * Created by dermot.herlihy on 29/08/15
 *
 */
public class ArrayFinder {


    /**
     * Validate the input arguments. If validation fails return NoSuchElementException.
     *
     * Take the first element of second array and establish if is contained in first array.
     * Search the first array up until the length of second array from the end.
     * It is not possible for second array to exist in first array after this point.
     *
     * If first element of second array is found successfully, check other elements and return the index if successful.
     * Otherwise search for next instance of starting element and repeat checks.
     * if search completes without success, return a NoSuchElementException.
     *
     * @param firstArray
     * @param secondArray
     * @return
     */
    public int findStartingPosition(String[] firstArray, String[] secondArray) {

        if (secondArray.length > firstArray.length) {
            throw new NoSuchElementException();
        }
        else if (secondArray.length == 0 || firstArray.length == 0) {
            throw new NoSuchElementException();
        }
        else {
            String start = secondArray[0];
            for (int firstArrayIndex = 0; firstArrayIndex <= (firstArray.length - secondArray.length); firstArrayIndex++) {
                if (start.equals(firstArray[firstArrayIndex])) {
                    boolean matched = true;
                    if (secondArray.length > 1) {
                        for (int secondArrayIndex = 1; secondArrayIndex < secondArray.length; secondArrayIndex++) {
                            if (!secondArray[secondArrayIndex].equals(firstArray[firstArrayIndex + secondArrayIndex])) {
                                matched = false;
                            }
                        }
                        if (matched) {
                            return firstArrayIndex;
                        }
                    } else {
                        return firstArrayIndex;
                    }

                }
            }
            throw new NoSuchElementException();
        }
    }
}
