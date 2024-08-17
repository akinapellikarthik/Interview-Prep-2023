package com.karthik.demo;

import java.util.Stack;

public class removeStars {

  public String removeStars(String s) {
    Stack<Character> tempStack = new Stack<>();
    StringBuffer sb = new StringBuffer();
    for (Character ch : s.toCharArray()) {
      if (ch != '*') tempStack.push(ch);
      else {
        tempStack.pop();
      }
    }

    while (!tempStack.isEmpty()) {
      sb.append(tempStack.pop());
    }
    return sb.reverse().toString();
  }
}
