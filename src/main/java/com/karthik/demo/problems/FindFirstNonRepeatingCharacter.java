package com.karthik.demo.problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatingCharacter {

  public static Character firstNonRepeatingChar(String s) {
    Map<Character, Integer> tempMap = new LinkedHashMap<>();
    char[] allChars = s.toCharArray();
    for (Character ch : allChars) {
      tempMap.put(ch, tempMap.getOrDefault(ch, 0) + 1);
    }

    for (Map.Entry<Character, Integer> entry : tempMap.entrySet()) {
      if (entry.getValue() == 1) return entry.getKey();
    }

    return null;
  }
}
