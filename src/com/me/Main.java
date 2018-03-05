package com.me;
//directions
/*
- create a program using arrays that sort a list of integers in ascending order
- set up the program so that the numbers to sort are read in from the keyboard
- implement the following methods - getIntegers, printArray, and sortIntegers
- getIntegers returns an array of entered integers from keyboard
- printArray prints out the contents of the array
and sortIntegers should sort the array and return a new array containing the sorted numbers
-you will have to figure out how to copy the array elements from the passed array into a new
array and sort them and return the new sorted array
 */

//step 1
import java.util.Scanner;

public class Main {

    //step 1
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //step 2 create int array
        int[] myIntegers = getIntegers(4);

    }

    //step 3 method to get ints, from step 2
    public static int[] getIntegers(int capacity) {     //parameter in method name
        int[] array = new int[capacity];                //defining our array, not capacity
        System.out.println("Enter " + capacity + " integer values: \r"); //r is for input in console
        for (int i = 0; i < array.length; i++) {        //looping through array
            array[i] = scanner.nextInt();  //for console input
        }

        //step 4 return array step 2, step 3
        return array;
    }

    //step 5 next create print array method
    //for step 2, step 3, step 4
    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++ ) {        //looping through to print array
            //System.out.println("Element " + i + " contents " + array[i]);
        }

    }


}
