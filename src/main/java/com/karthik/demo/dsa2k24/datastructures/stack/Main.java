package com.karthik.demo.dsa2k24.datastructures.stack;

public class Main {

  public static void main(String[] args) {
    Stack stack = new Stack(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.pop();
    stack.printStack();
  }
}
