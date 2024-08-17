package com.karthik.demo.problems;

/*
A string is encoded using the rule, n[subString], where the subString inside the square brackets is repeated n times. Can you decode the compressed string to give the expanded form of the original string.

Example 1
input:cr2[m]3[op4[s]] output:crmmopssssopssssopssss

Example 2
input:2[2[2[y]]] output:yyyyyyyy
 */

import java.util.Stack;

public class StringDecoding {

  public String decodedString(String encodedString) {

    StringBuilder decodedStr = new StringBuilder();
    Stack<Character> characterStack = new Stack<>();
    Stack<Integer> integerStack = new Stack<>();
    int num = 0;

    for (int i = 0; i < encodedString.length(); i++) {
      var ch = encodedString.charAt(i);
      if (Character.isDigit(ch)) {
        num = num * 10 + (ch - '0');
      } else if (ch == '[') {
        integerStack.push(num);
        num = 0;
        characterStack.push(ch);
      } else if (ch == ']') {
        StringBuilder temp = new StringBuilder();
        int value = integerStack.pop(); // repeat the string for this number of times
        // pop the integer stack and characterStack until [ brace is not found
        Character ch1;
        while (characterStack.peek() != '[') {
          ch1 = characterStack.pop();
          temp.append(ch1);
        }
        temp.reverse();
        characterStack.pop();
        String s = temp.toString();
        for (int j = 0; j < value - 1; j++) {
          temp.append(s);
        }
        for (int j = 0; j < temp.length(); j++) {
          characterStack.push(temp.charAt(j));
        }

      } else {
        characterStack.push(ch);
      }
    }

    while (!characterStack.isEmpty()) {
      decodedStr.append(characterStack.pop());
    }

    return decodedStr.reverse().toString();
  }
}
