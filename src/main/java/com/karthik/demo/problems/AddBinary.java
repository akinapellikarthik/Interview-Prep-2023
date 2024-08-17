package com.karthik.demo.problems;

import java.util.Stack;

public class AddBinary {

  public static void main(String[] args) {
    // new AddBinary().addBinary("11","1");
    // new AddBinary().addBinaryNew("11","1");
  }

  /*
  Input: a = "11", b = "1"
  Output: "100"
   */

  public String addBinary(String a, String b) {
    // 1. read and populate the Queue backed by linkedList
    // 2. Do a sum if sum == 2 then rem and 0
    // 3. Print for now
    // 4. Finally save to stack
    // 5. Read Stack and return the value
    // Queue<Integer> aQueue = new LinkedList<>();
    // Queue<Integer> bQueue = new LinkedList<>();

    String s1 = "";
    String s2 = "";
    s2.contains(s1);

    Stack<Integer> firstStack = new Stack<>();
    Stack<Integer> secondStack = new Stack<>();
    Stack<Integer> tempStack = new Stack<>();
    StringBuffer sb = new StringBuffer();
    int highSize = Math.max(a.length(), b.length());

    for (Character ch : a.toCharArray()) {
      // aQueue.offer(Character.getNumericValue(ch));
      firstStack.push(Character.getNumericValue(ch));
    }

    for (Character ch : b.toCharArray()) {
      // bQueue.offer(Character.getNumericValue(ch));
      secondStack.push(Character.getNumericValue(ch));
    }

    if (firstStack.size() != highSize) {
      firstStack.push(0);
    }
    if (secondStack.size() != highSize) {
      secondStack.push(0);
    }

    int rem = 0;
    while (!firstStack.isEmpty() || !secondStack.isEmpty()) {
      int first = 0;
      int second = 0;

      // if(aQueue.peek() !=null) {
      first = firstStack.pop();
      // }

      // if(bQueue.peek() != null)
      second = secondStack.pop();

      if (first + second + rem == 2) {
        tempStack.push(0);
        rem = 1;
      } else {
        tempStack.push(first + second + rem);
        rem = 0;
      }
    }
    if (rem == 1) tempStack.push(rem);

    while (!tempStack.isEmpty()) sb.append(tempStack.pop());

    return sb.toString();
  }

  public String addBinaryForSmallNumbers(String a, String b) {
    int powIdx = 0;
    long first = 0;
    long second = 0;
    long res = 0;
    Stack<Long> tempStack = new Stack<>();
    StringBuffer sb = new StringBuffer();

    for (int i = a.length() - 1; i >= 0; i--) {
      first += Character.getNumericValue(a.charAt(i)) * Math.pow(2, powIdx);
      powIdx++;
    }
    powIdx = 0;
    System.out.println(first);
    for (int i = b.length() - 1; i >= 0; i--) {
      second += Character.getNumericValue(b.charAt(i)) * Math.pow(2, powIdx);
      powIdx++;
    }
    System.out.println(second);
    res = first + second;
    System.out.println(res);
    // now res has to be converted to 1's 0's impl
    while (res > 0) {
      long rem = res % 2;
      tempStack.push(rem);
      res = res / 2;
    }

    while (!tempStack.isEmpty()) {
      sb.append(tempStack.pop());
    }

    return sb.toString().equalsIgnoreCase("") ? "0" : sb.toString();
  }

  public String addBinaryForAll(String a, String b) {
    StringBuffer sb = new StringBuffer();

    int firstStart = a.length() - 1;
    int secondStart = b.length() - 1;
    int rem = 0;
    int sum = 0;
    while (firstStart >= 0 || secondStart >= 0) {
      sum = rem;
      if (firstStart >= 0) sum += a.charAt(firstStart) - '0';

      if (secondStart >= 0) sum += a.charAt(secondStart) - '0';

      rem = sum / 2;

      sb.append(sum % 2);

      firstStart--;
      secondStart--;
    }

    return sb.toString();
  }
}
