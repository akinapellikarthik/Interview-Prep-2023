package com.karthik.demo.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AlternatingDigitSumTest {

  AlternatingDigitSum alternatingDigitSum = new AlternatingDigitSum();

  @Test
  void alternatingDigitSum() {
    Assertions.assertEquals(4, alternatingDigitSum.alternatingDigitSum(521));
    Assertions.assertEquals(1, alternatingDigitSum.alternatingDigitSum(111));
    Assertions.assertEquals(0, alternatingDigitSum.alternatingDigitSum(886996));
  }
}