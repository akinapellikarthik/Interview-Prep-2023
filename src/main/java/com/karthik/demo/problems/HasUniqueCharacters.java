package com.karthik.demo.problems;

import java.util.HashSet;
import java.util.Set;

public class HasUniqueCharacters {

  public static boolean hasUniqueChars(String string) {
    char[] chars = string.toCharArray();
    Set<Character> set = new HashSet<>();
    for (char c : chars) {
      boolean flag = set.add(c);
      if (!flag) {
        return false;
      }
    }
    return true;
  }
}
