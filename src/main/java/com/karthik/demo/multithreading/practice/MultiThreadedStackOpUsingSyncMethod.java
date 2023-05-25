package com.karthik.demo.multithreading.practice;

public class MultiThreadedStackOpUsingSyncMethod {

  private final int[] stackArray;
  private int stackTop;
  private Object lock;

  public MultiThreadedStackOpUsingSyncMethod(int capacity) {
    this.stackArray = new int[capacity];
    stackTop = -1;
    lock = new Object();
  }

  public boolean isFull(){
    return stackTop >= stackArray.length - 1;
  }

  public boolean isEmpty() {
    return stackTop < 0;
  }

  public synchronized boolean push(int element){

      if(isFull())
        return false;
      stackTop++;
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      stackArray[stackTop] = element;
      return true;

  }

  public synchronized int pop(){

     if(isEmpty())
        return Integer.MIN_VALUE;

      int obj = stackArray[stackTop];
      stackArray[stackTop] = Integer.MIN_VALUE;

      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      stackTop--;
      return obj;
    }

}
