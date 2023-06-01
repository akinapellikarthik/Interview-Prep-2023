package com.karthik.demo.multithreading.practice;

import java.lang.Thread.State;

public class ThreadStateDemo {
  

  public static void main(String[] args) {
    Thread t = new Thread(() -> {
      try {
        Thread.sleep(1);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      for (int i = 10_000; i >0 ; i--);
    },"States");

    t.start();

    while(true){
      State state = t.getState();
      System.out.println(state);
      if(state == State.TERMINATED)
        break;
    }
  }

}
