package com.karthik.demo.dsa2k24.algorthims.sorting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

  @Test
  void verifyBubbleSortFunctionality() {
    int[] INPUT = {6, 5, 4, 3, 2, 1};
    int[] OUTPUT = {1, 2, 3, 4, 5, 6};
    BubbleSort.bubbleSort(INPUT);
    assertEquals(Arrays.toString(OUTPUT), Arrays.toString(INPUT));
  }
}
