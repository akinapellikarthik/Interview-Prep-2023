package com.karthik.demo.multithreading.practice.chatgpt.exercises;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
  public void executorServiceDemoFn() {
    ExecutorService executorService = Executors.newFixedThreadPool(10);
    for (int i = 0; i < 10; i++) {
      int finalI = i;
      executorService.submit(
          () -> {
            System.out.println(Thread.currentThread().getName() + "::" + finalI);
            try {
              Thread.sleep(finalI * 1000);
            } catch (InterruptedException e) {
              throw new RuntimeException(e);
            }
          });
    }
    executorService.shutdown();
  }

  public static void main(String[] args) {
    ExecutorServiceDemo executorServiceDemo = new ExecutorServiceDemo();
    executorServiceDemo.executorServiceDemoFn();
  }
}
