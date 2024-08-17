package com.karthik.demo.problems;

public class BeautifulDaysAtMovie {

  public int beautifulDays(int i, int j, int k) {
    // Write your code here
    int result = 0;
    // i- startDate
    // j- endDate
    // k-divisibility
    for (int l = i; l <= j; l++) {

      // 1. find the reverse
      int r = reverse(l);
      // 2. int rem = Then do (i - reverse) / k
      int rem = (l - r) % k;
      // 3. if rem == 0 then result++;
      if (rem == 0) result++;
    }
    // 4. Return the result
    return result;
  }

  public int reverse(int l) {
    int result = 0;
    while (l > 0) {
      int rem = l % 10; // 1
      l = l / 10;
      result = (result * 10) + rem;
    }
    return result;
  }
}
