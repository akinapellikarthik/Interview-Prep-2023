package com.karthik.demo.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddBinaryTest {

  private AddBinary addBinary = new AddBinary();

  @Test
  void addBinary() {
    Assertions.assertEquals("101", addBinary.addBinary("11", "1"));
  }
}
