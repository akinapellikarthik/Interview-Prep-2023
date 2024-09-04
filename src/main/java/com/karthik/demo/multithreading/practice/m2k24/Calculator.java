package com.karthik.demo.multithreading.practice.m2k24;

public class Calculator implements Runnable {

  @Override
  public void run() {
    long current = 1L;
    long max = 20000L;
    long numPrimes = 0L;
    System.out.printf("Thread '%s' START.%n", Thread.currentThread().getName());
    while (current <= max) {
      if (isPrime(current)) numPrimes++;
      current++;
    }
    System.out.printf(
        "Thread '%s' END. Number of primes: %d %n", Thread.currentThread().getName(), numPrimes);
  }

  public boolean isPrime(long n) {
    if (n <= 2) return true;
    for (long i = 2; i < n; i++) {
      if (n % i == 0) return false;
    }
    return true;
  }
}
