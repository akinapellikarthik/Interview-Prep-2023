package com.karthik.demo.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindIndexOfSecondHighestNumberTest {

  FindIndexOfSecondHighestNumber findIndexOfSecondHighestNumber =
      new FindIndexOfSecondHighestNumber();

  @Test
  void verifySecondHighestIndexFunctionality() {
    Assertions.assertEquals(
        2, findIndexOfSecondHighestNumber.secondHighestIndex(new int[] {1, 4, 3}));
  }

  @Test
  void verifySecondHighestIndexFunctionalityForEmptyArray() {
    Assertions.assertEquals(-1, findIndexOfSecondHighestNumber.secondHighestIndex(new int[] {}));
  }

  @Test
  void verifySecondHighestIndexFunctionalityForSingleValueArray() {
    Assertions.assertEquals(1, findIndexOfSecondHighestNumber.secondHighestIndex(new int[] {4}));
  }

  @Test
  void verifySecondHighestIndexFunctionalityForDualValueArray() {
    Assertions.assertEquals(0, findIndexOfSecondHighestNumber.secondHighestIndex(new int[] {3, 4}));
  }

  @Test
  void verifySecondHighestIndexFunctionality1() {
    Assertions.assertEquals(
        8,
        findIndexOfSecondHighestNumber.secondHighestIndex(
            new int[] {1, 4, 3, 5, 8, 9, 10, 55, 54}));
  }
}
