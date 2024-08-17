package com.karthik.demo.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingleNumberTest {

  SingleNumber sb = new SingleNumber();

  @Test
  void singleNumber() {
    int[] nums = new int[] {2, 2, 1};
    sb.singleNumber(nums);
  }
}
