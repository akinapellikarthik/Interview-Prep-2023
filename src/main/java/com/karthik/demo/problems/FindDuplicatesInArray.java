package com.karthik.demo.problems;

import java.util.Arrays;

public class FindDuplicatesInArray {

  public boolean isDuplicateArray(int[] inputArray) {
    Arrays.sort(inputArray);
    for (int i = 0, j = 1; i < inputArray.length && j < inputArray.length; i++, j++) {
      if (inputArray[i] == inputArray[j]) return false;
    }
    return false;
  }
}
