package com.karthik.demo.multithreading.practice;

import java.util.ArrayDeque;
import java.util.Queue;

public class ProducerConsumerProblem {

  private Queue<Integer> queue;
  private Integer capacity;

  public ProducerConsumerProblem(int capacity) {
    this.capacity = capacity;
    queue = new ArrayDeque<>();
  }

  public boolean add(int item) {

    synchronized (queue) {

      while (queue.size() == capacity) {
        //queue full, so wait
        System.out.println("I will be waiting....");
        try {
          queue.wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }

      boolean operationState = queue.add(item);
      queue.notifyAll();
      return operationState;

    }
  }

  public int remove(){
    synchronized (queue) {
      while(queue.size() == 0){
        try {
          System.out.println("I am waiting for consumption...");
          queue.wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      Integer itemPolled = queue.poll();
      try {
        Thread.sleep(5 * 1000);// doing some operation
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      queue.notifyAll();
      return itemPolled;

    }
  }

  public static void main(String[] args) {
    ProducerConsumerProblem producerConsumerProblem = new ProducerConsumerProblem(5);
    Thread t1 = new Thread(() -> {
      for (int i = 0; i < 10; i++) {
        System.out.println("added ::"+producerConsumerProblem.add(i));
      }
    });


    Thread t2 = new Thread(() -> {
      for (int i = 0; i < 100; i++) {
        System.out.println("Polled Item::"+producerConsumerProblem.remove());
      }
    });

    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

}
