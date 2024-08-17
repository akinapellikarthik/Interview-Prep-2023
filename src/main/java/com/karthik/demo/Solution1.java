package com.karthik.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution1 {

  static boolean Solution1(String a, String b) {

    if (a.length() != b.length()) return false;
    else {

      Map<Character, Integer> firstMap = new HashMap<>();
      Map<Character, Integer> secondMap = new HashMap<>();

      for (Character ch : a.toCharArray()) {
        firstMap.put(ch, firstMap.getOrDefault(ch, 1) + 1);
      }

      for (Character ch : b.toCharArray()) {
        secondMap.put(ch, secondMap.getOrDefault(ch, 1) + 1);
      }

      for (Entry<Character, Integer> entrySet : firstMap.entrySet()) {
        Character key = entrySet.getKey();
        if (secondMap.get(key) == null) return false;
        else {
          // value comparsion
          if (secondMap.get(key) != firstMap.get(key)) return false;
          else return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    boolean b = Solution1("Mother In Law", "Hitler Woman");
    System.out.println(b);
  }
}
