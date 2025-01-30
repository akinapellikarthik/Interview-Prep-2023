package com.karthik.demo.dsa2k24.algorthims.sorting;

/**
 *
 */
public class BubbleSort {

  public static void bubbleSort(int[] input) {
    for (int i = input.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (input[j] > input[j + 1]) {
          int temp = input[j];
          input[j] = input[j + 1];
          input[j + 1] = temp;
        }
      }
    }
  }
}
