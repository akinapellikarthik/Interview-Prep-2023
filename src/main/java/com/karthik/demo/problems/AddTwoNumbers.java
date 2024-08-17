package com.karthik.demo.problems;

import java.util.Stack;

public class AddTwoNumbers {

  public static void main(String[] args) {
    ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
    ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
    Stack<Integer> tempStack1 = new Stack<>();
    Stack<Integer> tempStack2 = new Stack<>();
    ListNode result = null;

    // fill the stack
    while (l1 != null) {
      tempStack1.push(l1.val);
      l1 = l1.next;
    }

    // fill the stack
    while (l2 != null) {
      tempStack2.push(l2.val);
      l2 = l2.next;
    }

    int val = 0;
    while (!tempStack1.empty() && !tempStack2.empty()) {
      int sum = tempStack1.pop() + tempStack2.pop();
      sum = sum + val;
      if (sum % 10 == 0) {
        val = sum / 10; // 1
        sum = 0; // 0
      }
      if (result == null) {
        result = new ListNode(sum);
      } else {
        result = new ListNode(sum, result);
      }
    }

    System.out.println(result);

    while (!tempStack1.empty()) {}

    while (!tempStack2.empty()) {}
  }
}
