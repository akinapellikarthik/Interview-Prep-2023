package com.karthik.demo.unnamedpkg;

import java.util.regex.Pattern;

public class PatternTest {

  public static void main(String[] args) {
    Pattern p = Pattern.compile("^\\d{9}$");
    String managerWin = "SUP_US_1016120";
    java.util.regex.Matcher matcher = p.matcher(managerWin);
    if (matcher.matches()) {
      System.out.println("matching ");

    } else System.out.println("Not Matching");
  }
}
