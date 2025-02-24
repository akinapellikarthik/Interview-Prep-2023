package com.karthik.demo.multithreading.practice.chatgpt.exercises;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class NumberPrinter {
  private int number = 1; // Start from 1
  private final int limit;
  private final Lock lock = new ReentrantLock();
  private final Condition oddCondition = lock.newCondition();
  private final Condition evenCondition = lock.newCondition();

  public NumberPrinter(int limit) {
    this.limit = limit;
  }

  public void printOdd() {
    try {
      lock.lock();
      while (number <= limit) {
        if (number % 2 == 0) {
          oddCondition.await(); // Wait if it's not odd
        }
        if (number <= limit) {
          System.out.println(Thread.currentThread().getName() + ": " + number);
          number++;
          evenCondition.signal(); // Wake up even thread
        }
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      lock.unlock();
    }
  }

  public void printEven() {
    try {
      lock.lock();
      while (number <= limit) {
        if (number % 2 != 0) {
          evenCondition.await(); // Wait if it's not even
        }
        if (number <= limit) {
          System.out.println(Thread.currentThread().getName() + ": " + number);
          number++;
          oddCondition.signal(); // Wake up odd thread
        }
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      lock.unlock();
    }
  }
}

public class OddEvenThreadsWithLock {
  public static void main(String[] args) {
    NumberPrinter printer = new NumberPrinter(10); // Print numbers up to 10

    Thread oddThread = new Thread(printer::printOdd, "Odd-Thread");
    Thread evenThread = new Thread(printer::printEven, "Even-Thread");

    oddThread.start();
    evenThread.start();
  }
}
