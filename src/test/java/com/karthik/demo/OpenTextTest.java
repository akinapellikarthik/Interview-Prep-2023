package com.karthik.demo;

import java.util.List;
import org.junit.jupiter.api.Test;

class OpenTextTest {

  @Test
  void findItems() {
    OpenText openText = new OpenText();
    System.out.println(openText.findItems(List.of("KA", "ab", "KS"), "ka"));
  }
}
