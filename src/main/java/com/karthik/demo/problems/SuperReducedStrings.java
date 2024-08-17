package com.karthik.demo.problems;

import java.util.Stack;

public class SuperReducedStrings {

  public static void main(String[] args) {
    var sup = superReducedString("aa");
    System.out.println(sup);
  }

  // Input: aaabccddd
  // Output: abd
  public static String superReducedString(String s) {

    Stack<Character> characterStack = new Stack<>();
    StringBuffer sb = new StringBuffer();

    for (int i = 0; i < s.length(); i++) {
      var ch = s.charAt(i);

      if (characterStack.empty()) {
        characterStack.push(ch);
      } else {
        var peekCharacter = characterStack.peek();
        if (peekCharacter == ch) characterStack.pop();
        else characterStack.push(ch);
      }
    }

    // construct the final String
    while (!characterStack.empty()) {
      sb.append(characterStack.pop());
    }

    return sb.length() == 0 ? "" : sb.reverse().toString();
  }
}
