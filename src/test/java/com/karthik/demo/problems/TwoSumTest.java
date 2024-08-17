package com.karthik.demo.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoSumTest {

  TwoSum ob = new TwoSum();

  @Test
  void twoSum() {
    int[] nums = new int[] {3, 3};
    int target = 6;
    for (int i : ob.twoSum(nums, target)) {
      System.out.println(i);
    }
  }
}
