package com.karthik.demo.multithreading.practice.chatgpt.exercises;

import java.util.ArrayList;
import java.util.List;

public class SyncDemo {
  private int i;

  public int getI() {
    return i;
  }

  public synchronized void increment() {
    ++i;
    System.out.println("after increment " + i);
  }

  public static void main(String[] args) {
    SyncDemo syncDemo = new SyncDemo();
    List<Thread> threadList = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
      threadList.add(new Thread(syncDemo::increment));
    }
    for (Thread t : threadList) {
      t.start();
    }
  }
}
