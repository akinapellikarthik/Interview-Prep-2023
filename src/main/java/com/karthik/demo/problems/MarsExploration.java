package com.karthik.demo.problems;

public class MarsExploration {

  public int countOfChanges(String s) {

    // This is optimised solution
    int counter = 0;
    String base = "SOS";
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != base.charAt(i % 3)) counter++;
    }

    // This is one solution
    StringBuffer s1 = new StringBuffer(s.length());
    for (int i = 0; i < s.length(); i = i + 3) {
      s1.append("SOS");
    }
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != s1.charAt(i)) counter++;
    }
    return counter;
  }
}
