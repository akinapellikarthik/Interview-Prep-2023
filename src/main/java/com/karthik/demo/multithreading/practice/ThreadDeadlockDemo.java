package com.karthik.demo.multithreading.practice;

public class ThreadDeadlockDemo {



  public static void main(String[] args) {
    String lock1="lock1";
    String lock2="lock2";

    Thread t1 = new Thread(() ->{
      synchronized (lock1){
        try {
          Thread.sleep(1);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
        synchronized (lock2) {
          System.out.println("Lock1 and Lock2 acquired successfully by Thread1!!!!");
        }
      }
    },"Thread1");
    Thread t2 = new Thread(() -> {
        synchronized (lock2){
          try {
            Thread.sleep(1);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
          synchronized (lock1) {
            System.out.println("Lock1 and Lock2 acquired successfully by Thread2!!!!");
          }
        }
    },"Thread2");

    System.out.println("Main Thread started....");
    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    //all 3 threads - t1, t2, main thread will be waiting forever
    System.out.println("Main Thread exited...");
  }

}
