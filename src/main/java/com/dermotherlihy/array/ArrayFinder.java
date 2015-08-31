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
     * Next, take the first element of second array and establish if is contained in first array contains it. Search the first array up until the length of second array from the end.
     * It is not possible for second array to fit after this point.
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
            for (int i = 0; i <= (firstArray.length - secondArray.length); i++) {
                if (start.equals(firstArray[i])) {
                    boolean matched = true;
                    if (secondArray.length > 1) {
                        for (int j = 1; j < secondArray.length; j++) {
                            if (!secondArray[j].equals(firstArray[i + j])) {
                                matched = false;
                            }
                        }
                        if (matched) {
                            return i;
                        }
                    } else {
                        return i;
                    }

                }
            }
            throw new NoSuchElementException();
        }
    }
}
