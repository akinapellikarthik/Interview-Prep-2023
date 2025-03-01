package com.karthik.demo.java17.fp.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class FilterNumberGreaterThanValueTest {

  @Test
  void verifyFilterListFunctionality() {

    List<Integer> input = IntStream.rangeClosed(1, 100).boxed().toList();
    System.out.println(input);
    assertEquals(1, input.size());
  }
}
