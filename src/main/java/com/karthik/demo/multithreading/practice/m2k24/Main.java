package com.karthik.demo.multithreading.practice.m2k24;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
  public static void main(String[] args) {

    System.out.printf("Min Priority: %s %n", Thread.MIN_PRIORITY);
    System.out.printf("Normal Priority: %s %n", Thread.NORM_PRIORITY);
    System.out.printf("Max Priority: %s %n", Thread.MAX_PRIORITY);

    Thread[] threads = new Thread[10];
    Thread.State[] status = new Thread.State[10];
    for (int i = 0; i < 10; i++) {
      threads[i] = new Thread(new Calculator());
      if (i % 2 == 0) {
        threads[i].setPriority(Thread.MAX_PRIORITY);
      } else {
        threads[i].setPriority(Thread.MIN_PRIORITY);
      }
      threads[i].setName("My Thread " + i);
    }

    try (FileWriter fw =
            new FileWriter(
                "src/main/java/com/karthik/demo/multithreading/practice/m2k24/data/MyThreads.txt");
        PrintWriter pw = new PrintWriter(fw)) {
      for (int i = 0; i < threads.length; i++) {
        pw.println("Main: Status of Thread " + i + ":" + threads[i].getState());
        status[i] = threads[i].getState();
        threads[i].start();
      }

      boolean finish = false;
      while (!finish) {
        for (int i = 0; i < threads.length; i++) {
          if (threads[i].getState() != status[i]) {
            writeThreadInfo(pw, threads[i], status[i]);
          }
        }
        finish = true;
        for (Thread thread : threads) {
          finish = finish && (thread.getState() == Thread.State.TERMINATED);
        }
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private static void writeThreadInfo(PrintWriter pw, Thread thread, Thread.State state) {
    pw.printf("Main : Id %d - %s %n", thread.getId(), thread.getName());
    pw.printf("Main: Priority : %d %n", thread.getPriority());
    pw.printf("Main: Old State : %s %n", state);
    pw.printf("Main: New State : %s %n", thread.getState());
    pw.println("Main: New State : **********");
  }
}
