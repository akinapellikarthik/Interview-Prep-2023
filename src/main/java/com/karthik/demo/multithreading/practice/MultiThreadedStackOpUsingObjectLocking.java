package com.karthik.demo.multithreading.practice;

public class MultiThreadedStackOpUsingObjectLocking {

  private final int[] stackArray;
  private int stackTop;
  private Object lock;

  public MultiThreadedStackOpUsingObjectLocking(int capacity) {
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

  public boolean push(int element){

    synchronized (lock) {

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
  }

  public int pop(){

    synchronized (lock) {

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

}
