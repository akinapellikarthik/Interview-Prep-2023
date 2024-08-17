package com.karthik.demo.problems;

public class PalindromeNumber {

  public static void main(String[] args) {
    var palindrome = new PalindromeNumber().isPalindrome(121);
    System.out.println(palindrome);
  }

  public boolean isPalindrome(int x) {
    int temp = x;
    StringBuffer sb = new StringBuffer();

    while (x > 9) {
      int rem = x % 10;
      sb.append(rem);
      x = x / 10;
    }
    sb.append(x);
    return temp >= 0 && temp == Integer.parseInt(sb.toString());
  }
}
