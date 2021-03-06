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
        int[] myIntegers = getIntegers(5);

        //step 9 after method 6 sortIntegers
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);    //then run

    }

    //step 3 method to get ints, from step 2
    public static int[] getIntegers(int capacity) {     //parameter in method name
        int[] array = new int[capacity];                //defining our array, not capacity
        //the message displayed when initiate program
        System.out.println("Enter " + capacity + " integer values: \r"); //r is for input in console
        for (int i = 0; i < array.length; i++) {        //looping through array
            array[i] = scanner.nextInt();  //for console input
        }

        //step 4 return array step 2, step 3
        return array;
    }

    //step 5 next create print array method, accept array and printout contents
    //for step 2, step 3, step 4
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {        //looping through to print array
            System.out.println("Element " + i + " contents " + array[i]);
        }

    }

    //step 6 method for sorting, creates a copy of array passed to a sorted array
    public static int[] sortIntegers(int[] array) {//passing the unsorted array
        int[] sortedArray = new int[array.length];  //creating an array that is same size as array that has been passed
        for (int i = 0; i < array.length; i++) {    //loops through to put values in
            sortedArray[i] = array[i];              //creates new sorted array
        }

        //this takes a copy of the array with the right length and automatically makes a new array called
        //sortedArray for us
        //step 7 while loop to actually sort the array
        boolean flag = true;            //set boolean to true
        int temp;                       //stores num temporarily
        while (flag) {
            flag = false;       //continue while loop if only assigned flag to true
            //checking code
            //loop will continue only after all have been sorted in order desired
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] > sortedArray[i + 1]) {  //swapping ints, ***important for order
                    temp = sortedArray[i];  //stores current value of sorted array temporarily
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;   //while loop will continue processing until false
                    //then exist out
                }
            }
        }

        //step 8 return
        return sortedArray;

    }

}

//example results;
/*
Enter 5 integer values:
9
8
7
6
5
Element 0 contents 5
Element 1 contents 6
Element 2 contents 7
Element 3 contents 8
Element 4 contents 9
 */
