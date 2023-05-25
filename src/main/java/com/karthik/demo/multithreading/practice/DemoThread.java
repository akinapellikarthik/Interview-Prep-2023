package com.karthik.demo.multithreading.practice;

public class DemoThread {

  public static void main(String[] args) {
    Thread t = new Thread(() -> System.out.println("Helloo Thread"));
    t.start();
  }

}
