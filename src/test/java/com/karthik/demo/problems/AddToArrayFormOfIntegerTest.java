package com.karthik.demo.problems;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddToArrayFormOfIntegerTest {

  AddToArrayFormOfInteger ob = new AddToArrayFormOfInteger();

  @Test
  void addToArrayForm() {
    Assertions.assertEquals(List.of(2,3),ob.addToArrayForm(new int[]{0}, 23));
  }
}