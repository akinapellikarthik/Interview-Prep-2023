package com.karthik.demo.multithreading.practice.chatgpt.exercises;

public class ThreadSleepAndJoinDemo {
  public static void main(String[] args) throws InterruptedException {
    Thread t1 =
        new Thread(
            () -> {
              System.out.println("Thread " + Thread.currentThread().getName() + " started working");
              try {
                Thread.sleep(12 * 1000L);
              } catch (InterruptedException e) {
                throw new RuntimeException(e);
              }
              System.out.println("Thread " + Thread.currentThread().getName() + " sleep completed");
            },
            "firstThread");
    Thread t2 =
        new Thread(
            () -> {
              System.out.println("Thread " + Thread.currentThread().getName() + " started working");
              try {
                Thread.sleep(11 * 1000L);
              } catch (InterruptedException e) {
                throw new RuntimeException(e);
              }
              System.out.println("Thread " + Thread.currentThread().getName() + " sleep completed");
            },
            "secondThread");
    Thread t3 =
        new Thread(
            () -> {
              System.out.println("Thread " + Thread.currentThread().getName() + " started working");
              try {
                Thread.sleep(10 * 1000L);
              } catch (InterruptedException e) {
                throw new RuntimeException(e);
              }
              System.out.println("Thread " + Thread.currentThread().getName() + " sleep completed");
            },
            "thirdThread");

    t1.start();
    t2.start();
    t3.start();

    t1.join();
    t2.join();
    t3.join();

    System.out.println(Thread.currentThread().getName() + " thread exiting.");
  }
}
