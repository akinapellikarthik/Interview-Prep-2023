package com.karthik.demo.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HummingWeightTest {

  HummingWeight hummingWeight = new HummingWeight();

  @Test
  void hammingWeight() {

    Assertions.assertEquals(31, hummingWeight.hammingWeightNewImpl(-3));
    Assertions.assertEquals(32, hummingWeight.hammingWeightNewImpl(-1));
    Assertions.assertEquals(2, hummingWeight.hammingWeightNewImpl(3));
    Assertions.assertEquals(1, hummingWeight.hammingWeightNewImpl(-2147483648));
  }
}
