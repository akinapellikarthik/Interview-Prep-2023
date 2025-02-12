package com.karthik.demo.multithreading.practice.chatgpt.exercises;

public class SimpleThreadDemo {
  public static void main(String[] args) {
    simpleThreadDemoUsingRunnableInterface();
    simpleThreadDemoUsingThreadClass();
  }

  static class ThreadDemo extends Thread {
    @Override
    public void run() {
      System.out.println("Thread started" + Thread.currentThread().getName());
      for (int i = 1; i <= 10; i++) {
        System.out.println(i);
        try {
          Thread.sleep(1 * 1000);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
      System.out.println("Thread finished" + Thread.currentThread().getName());
    }
  }

  private static void simpleThreadDemoUsingThreadClass() {
    ThreadDemo threadDemo = new ThreadDemo();
    threadDemo.start();
  }

  public static void simpleThreadDemoUsingRunnableInterface() {

    Thread thread =
        new Thread(
            () -> {
              System.out.println("Thread started" + Thread.currentThread().getName());
              for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try {
                  Thread.sleep(1 * 1000);
                } catch (InterruptedException e) {
                  throw new RuntimeException(e);
                }
              }
              System.out.println("Thread finished" + Thread.currentThread().getName());
            });
    thread.start();
  }
}
