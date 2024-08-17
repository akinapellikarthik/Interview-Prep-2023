package com.karthik.demo.problems;


public class MultiplyStrings {

  public String multiply(String num1, String num2) {

    Long res = Long.parseLong(num1) * Long.parseLong(num2);
    return String.valueOf(res);
  }
}
