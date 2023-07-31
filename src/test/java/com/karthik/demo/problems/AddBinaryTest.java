package com.karthik.demo.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddBinaryTest {

  private AddBinary addBinary = new AddBinary();
  @Test
  void addBinary() {
   // Assertions.assertEquals("10101",addBinary.addBinary("1010","1011"));
    Assertions.assertEquals("100",addBinary.addBinary("11","1"));
  }
}