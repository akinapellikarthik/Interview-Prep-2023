package com.karthik.demo.java17.fp.examples;

public class StringReverseImpl implements StringReverse {
  @Override
  public String reverseStr(String s) {
    return new StringBuffer(s).reverse().toString();
  }
}
