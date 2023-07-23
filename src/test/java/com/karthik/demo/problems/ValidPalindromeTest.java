package com.karthik.demo.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidPalindromeTest {

  ValidPalindrome validPalindrome = new ValidPalindrome();

  @Test
  void isValidPalindrome() {
    assertFalse(validPalindrome.isValidPalindrome("0P"));

  }
}