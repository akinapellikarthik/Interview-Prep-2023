package com.karthik.demo.multithreading.practice;

public class SingletonDemoUsingMultithreading {

  private static volatile SingletonDemoUsingMultithreading instance = null;
  private static int counter = 0;

  private SingletonDemoUsingMultithreading() {
    System.out.println("Object Initialized");
    counter++;
  }

  public static SingletonDemoUsingMultithreading getInstance() {
    if (instance == null) {
      synchronized (SingletonDemoUsingMultithreading.class) {
        if (instance == null) // double locking mechanism
        instance = new SingletonDemoUsingMultithreading();
      }
    }
    return instance;
  }

  public int getCounter() {
    return counter;
  }
}
