package com.karthik.demo.problems;

import java.util.Stack;

public class AlternatingCharacters {

  public int findAlternatingCharsCount(String s) {
    int counter = 0;
    Stack<Character> characterStack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      var ch = s.charAt(i);
      if(characterStack.isEmpty())
        characterStack.push(ch);
      else {
        if(ch == characterStack.peek())
          counter++;
        else
          characterStack.push(ch);
      }
    }
    return counter;
  }

}
