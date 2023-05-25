package com.karthik.demo.multithreading.practice;

public class StackMain {

  public static void main(String[] args) {
    MultiThreadedStackOpUsingObjectLocking multiThreadedStackOpUsingObjectLocking = new MultiThreadedStackOpUsingObjectLocking(5);
    MultiThreadedStackOpUsingSyncMethod multiThreadedStackOpUsingSyncMethod = new MultiThreadedStackOpUsingSyncMethod(5);

    Thread t1 = new Thread(() -> {
      int counter = 0;
      while (++counter < 10) {
        System.out.println("Pushed:: multiThreadedStackOpUsingObjectLocking:"+ multiThreadedStackOpUsingObjectLocking.push(counter));
      }
    });

    Thread t2 = new Thread(() -> {
      int counter = 0;
      while (++counter < 10) {
        System.out.println("Pop:: multiThreadedStackOpUsingObjectLocking:"+ multiThreadedStackOpUsingObjectLocking.pop());
      }
    });

    Thread t3 = new Thread(() -> {
      int counter = 0;
      while (++counter < 10) {
        System.out.println("Pushed:: multiThreadedStackOpUsingSyncMethod:"+ multiThreadedStackOpUsingSyncMethod.push(counter));
      }
    });

    Thread t4 = new Thread(() -> {
      int counter = 0;
      while (++counter < 10) {
        System.out.println("Pop:: multiThreadedStackOpUsingSyncMethod:"+ multiThreadedStackOpUsingSyncMethod.pop());
      }
    });


    t1.start();
    t2.start();
    t3.start();
    t4.start();
  }

}
