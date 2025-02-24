package com.karthik.demo.multithreading.practice.chatgpt.exercises;

public class EvenOddPrintWIthWaitNotify {
  private int number;
  private final int limit;

  EvenOddPrintWIthWaitNotify(int limit) {
    this.limit = limit;
  }

  public synchronized void printOddNumber() {
    while (number <= limit) {

      if (number % 2 == 0) {
        try {
          wait();
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
      System.out.println(Thread.currentThread().getName() + "::" + number);
      notify();
      number++;
    }
  }

  public synchronized void printEvenNumber() {
    while (number <= limit) {

      if (number % 2 != 0) {
        try {
          wait();
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
      System.out.println(Thread.currentThread().getName() + "::" + number);
      notify();
      number++;
    }
  }

  public static void main(String[] args) {

    EvenOddPrintWIthWaitNotify evenOddPrintWIthWaitNotify = new EvenOddPrintWIthWaitNotify(10);
    Thread t1 = new Thread(evenOddPrintWIthWaitNotify::printEvenNumber, "Even-Thread");
    Thread t2 = new Thread(evenOddPrintWIthWaitNotify::printOddNumber, "Odd-Thread");

    t1.start();
    t2.start();
  }
}
