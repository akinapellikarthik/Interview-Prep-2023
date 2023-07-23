package com.karthik.demo.problems;

public class ValidPalindrome {

  public boolean isValidPalindrome(String s) {
    StringBuffer sb = new StringBuffer();
    StringBuffer sb1 = new StringBuffer();
    for(Character ch: s.toCharArray()){
      if(Character.isAlphabetic(ch) || Character.isDigit(ch)){
        sb.append(ch);
        sb1.append(ch);
      }
    }
    System.out.println(sb);
    System.out.println(sb1);
    return sb1.toString().equalsIgnoreCase(sb.reverse().toString());
  }

}
