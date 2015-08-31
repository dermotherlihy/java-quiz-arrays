package com.dermotherlihy.array;

import java.util.NoSuchElementException;

/**
 * Created by dermot.herlihy on 31/08/15.
 */
public class Main {

    private static ArrayFinder testObj = new ArrayFinder();

    public static void main (String args[]){

        if(args.length ==2) {
            String[] array1 = args[0].split(",");
            String[] array2 = args[1].split(",");
            try{
                int result = testObj.findStartingPosition(array1,array2);
                System.out.println("Array 2 is located at position " + result +" in first array");
            }catch (NoSuchElementException e){
                System.out.println("Cannot locate elements in first array");
            }
        } else{
            System.out.print("You must provide two arrays e.g 1,2,3,4 1,2");
        }

    }

}
