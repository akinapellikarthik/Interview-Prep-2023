package com.karthik.demo.dsa2k24.algorthims.sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SelectionSortTest {

  @Test
  void verifySelectionSortFunctionality() {
    int[] INPUT = {6, 5, 4, 3, 2, 1};
    int[] OUTPUT = {1, 2, 3, 4, 5, 6};
    SelectionSort.selectionSort(INPUT);
    assertEquals(Arrays.toString(OUTPUT), Arrays.toString(INPUT));
  }
}
