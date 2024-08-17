package com.karthik.demo;

/**
 * Have the function SeatingStudents(arr) read the array of integers stored in arr which will be in
 * the following format: [K, r1, r2, r3, ...] where K represents the number of desks in a classroom,
 * and the rest of the integers in the array will be in sorted order and will represent the desks
 * that are already occupied. All of the desks will be arranged in 2 columns, where desk #1 is at
 * the top left, desk #2 is at the top right, desk #3 is below #1, desk #4 is below #2, etc. Your
 * program should return the number of ways 2 students can be seated next to each other. This means
 * 1 student is on the left and 1 student on the right, or 1 student is directly above or below the
 * other student.
 *
 * <p>For example: if arr is [12, 2, 6, 7, 11] then this classrooms looks like the following
 * picture:
 *
 * <p>Based on above arrangement of occupied desks, there are a total of 6 ways to seat 2 new
 * students next to each other. The combinations are: [1, 3], [3, 4], [3, 5], [8, 10], [9, 10], [10,
 * 12]. So for this input your program should return 6. K will range from 2 to 24 and will always be
 * an even number.
 *
 * <p>After K, the number of occupied desks in the array can range from 0 to K.
 */
public class CalixMain {

  public static int SeatingStudents(int[] arr) {

    // code goes here
    // [12, 2, 6, 7, 11]
    int noOfDesks = arr[0];
    int[] occupiedDesks = new int[noOfDesks + 1];
    for (int i = 1; i < arr.length; i++) {
      int occupiedDeskIndex = arr[i];
      occupiedDesks[occupiedDeskIndex] = 1;
    }
    int tempCounter = 0;
    for (int i = 0; i < occupiedDesks.length; i++) {
      if (i + 1 < occupiedDesks.length && (occupiedDesks[i] == occupiedDesks[i + 1])) tempCounter++;
    }
    // System.out.println(tempCounter);
    return tempCounter;
    // [0,0,0,1,0,0]

    // 2,6,7,11 - Occupied desks, so no students can sit in these positions
    // 2 students
    // [0,1,0,0,0,1,1,0,0,0,1,0]
    // [
    // [0,1],
    // [0,0],
    // [0,1],
    // [1,0],
    // [0,0],
    // [1,0]
    // ]
    // [0,1,0,0,0,1,1,0,0,0,1,0]
    // 0,1,1,0,0,1,1,0,0,0,1,0
    // 0,1,1,1,0,1,1,0,0,0,1,0
    // 0,1,1,1,1,1,1,0,0,0,1,0
    // 0,1,1,1,1,1,1,1,0,0,1,0
    // 0,1,1,1,1,1,1,1,1,0,1,0
    // 0,1,1,1,1,1,1,1,1,1,1,0
    // 0,1,1,1,1,1,1,1,1,1,1,1
    // 1,1,1,1,1,1,1,1,1,1,1,1

    // return arr[0];
  }

  public static void main(String[] args) {

    System.out.print("Test 1 passing: " + (SeatingStudents(new int[] {6, 4}) == 4) + "\r\n");
    System.out.print(
        "Test 2 passing: "
            + (SeatingStudents(new int[] {8, 1, 8}) == 6)
            + "\r\n"); // [0,1,0,0,0,0,0,1]
    /** 1 0 0 0 0 0 0 1 */
    System.out.print(
        "Test 2 passing: " + (SeatingStudents(new int[] {12, 2, 6, 7, 11}) == 6) + "\r\n");
  }
}
