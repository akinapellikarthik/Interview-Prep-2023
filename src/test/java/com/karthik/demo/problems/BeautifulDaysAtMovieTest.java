package com.karthik.demo.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BeautifulDaysAtMovieTest {

  private final BeautifulDaysAtMovie ob = new BeautifulDaysAtMovie();

  @Test
  void verifyReverseFunctionality() {

    Assertions.assertEquals(12, ob.reverse(21));
    Assertions.assertEquals(99, ob.reverse(99));
    Assertions.assertEquals(1, ob.reverse(100));
  }

  @Test
  void verifyBeautifulDays() {
    Assertions.assertEquals(2, ob.beautifulDays(20, 23, 6));
    Assertions.assertEquals(33, ob.beautifulDays(13, 45, 3));
  }
}
