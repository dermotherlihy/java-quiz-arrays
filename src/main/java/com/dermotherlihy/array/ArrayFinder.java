package com.dermotherlihy.array;

import java.util.NoSuchElementException;

/**
 * Created by dermot.herlihy on 29/08/15
 *
 * First, I validate the input arguments,
 * if for example the second array is larger than first, then there is no point continuing or if either array is empty.
 *
 * Next, I take the first element of second array and establish if the first array contains it. I will only search the first array up until the length of second array elements from the end.
 * As even if the element is contained in the first array but it is after this point, I do not need to check it as it is not possible for second array to fit in first array after this point.
 *
 * If I find the first element of second array in the first array successfully, I then proceed to check for the other elements. If found, I will return the index, otherwise,
 * code will search for next instance of second array starting element in first array and repeat checks.
 * If I have exhaused all possiblities and have not found the second array, I return a NoSuchElementException.
 *
 *
 *
 */
public class ArrayFinder {

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
