package com.karthik.demo.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringDecodingTest {

  StringDecoding stringDecoding = new StringDecoding();

  @Test
  void decodedStringFunctionality() {
    Assertions.assertEquals(
        "crmmopssssopssssopssss", stringDecoding.decodedString("cr2[m]3[op4[s]]"));
    Assertions.assertEquals("yyyyyyyy", stringDecoding.decodedString("2[2[2[y]]]"));
    // Below test case need to be fixed
    Assertions.assertEquals(
        "leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcode",
        stringDecoding.decodedString("100[leetcode]"));
  }
}
