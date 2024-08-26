package com.karthik.demo.dsa2k24.datastructures.queue;

import java.util.Stack;

public class Main {

  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    Queue queue = new Queue(10);
    queue.enqueue(11);
    queue.enqueue(12);
    queue.enqueue(13);
    queue.enqueue(14);
    queue.enqueue(15);

    queue.printQueue();
    System.out.println("Dequeueing.....");
    System.out.println(queue.dequeue().value);
    System.out.println(queue.dequeue().value);
    System.out.println(queue.dequeue().value);
    System.out.println(queue.dequeue().value);
    System.out.println(queue.dequeue().value);
    System.out.println(queue.dequeue().value);
    System.out.println(queue.dequeue());

    queue.printQueue();
  }
}
