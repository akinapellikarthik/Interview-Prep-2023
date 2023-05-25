package com.karthik.demo;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import lombok.SneakyThrows;

public class ThreadDemo {

  //@SneakyThrows
  public static void main(String[] args) {
    CyclicBarrier cb = new CyclicBarrier(3, () -> System.out.println("finally I am freed"));


    Thread t1 = new Thread(new ThreadGroup("tg1"),() -> {
      for (int i = 0; i < 10; i++) {
        System.out.println(Thread.currentThread()+""+i);
      }
      try {
        cb.await();
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      } catch (BrokenBarrierException e) {
        throw new RuntimeException(e);
      }
    },"Hello Thread");

    Thread t2 = new Thread(new ThreadGroup("tg1"),() -> {
      for (int i = 0; i < 10; i++) {
        try {
          Thread.sleep( 2 * 1000);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread()+""+i);
        try {
          cb.await();
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
          throw new RuntimeException(e);
        }
      }
    },"Hello Thread");

    Thread t3 = new Thread(new ThreadGroup("tg1"),() -> {
      for (int i = 0; i < 10; i++) {
        try {
          Thread.sleep( 3 * 1000);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread()+""+i);
        try {
          cb.await();
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
          throw new RuntimeException(e);
        }
      }
    },"Hello Thread");

    t1.start();
    t2.start();
    t3.start();

  }

}
