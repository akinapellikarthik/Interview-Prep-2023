package com.karthik.demo.problems;

public class AlternatingDigitSum {

  public int alternatingDigitSum(int n) {
    int sum = 0;
    String s1 = String.valueOf(n);
    for (int i = 0; i < s1.length(); i++) {
      var ch = s1.charAt(i);
      // 0,2,4 - even
      if (i % 2 == 0) {
        sum = sum + (Character.getNumericValue(ch));
      } else sum = sum + (Character.getNumericValue(ch) * -1);
    }
    return sum;
  }
}
