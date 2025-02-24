package com.karthik.demo.multithreading.practice.chatgpt.exercises;

public class ThreadPrintWithDelay {

  public static void main(String[] args) {
    Thread t =
        new Thread(
            () -> {
              for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try {
                  Thread.sleep(1000);
                } catch (InterruptedException e) {
                  throw new RuntimeException(e);
                }
              }
            });

    t.start();
  }
}
