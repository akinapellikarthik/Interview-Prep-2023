package com.karthik.demo.problems;

import java.util.Stack;

public class BuddyStrings {

  public static void main(String[] args) {
    BuddyStrings ob = new BuddyStrings();
    ob.buddyStrings("ab", "ba");

    String s = "";
    var split = s.split("[\\s]");
    split[split.length - 1].length();
  }

  public boolean buddyStrings(String s, String goal) {
    Stack<Character> tempStack = new Stack<>();
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != goal.charAt(i)) {
        tempStack.push(s.charAt(i));
      }
    }
    while (!tempStack.empty()) {
      sb.append(tempStack.pop());
    }
    return sb.toString().equalsIgnoreCase(goal);
  }
}
