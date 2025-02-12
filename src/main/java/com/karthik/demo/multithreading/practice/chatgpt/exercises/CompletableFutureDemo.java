package com.karthik.demo.multithreading.practice.chatgpt.exercises;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;

public class CompletableFutureDemo {

  public static void main(String[] args) {
    completableFutureDemo();
  }

  public static void completableFutureDemo() {

    List<String> futuresCompletedList = new CopyOnWriteArrayList<>();

    CompletableFuture<String> firstCompletableThreadFuture =
        CompletableFuture.supplyAsync(
            () -> {
              System.out.println(Thread.currentThread().getName() + ": First Thread started");
              try {
                Thread.sleep(1 * 1000);
              } catch (InterruptedException e) {
                throw new RuntimeException(e);
              }
              System.out.println(Thread.currentThread().getName() + ": First Thread completed");
              futuresCompletedList.add(Thread.currentThread().getName());
              return Thread.currentThread().getName();
            });

    CompletableFuture<String> secondCompletableFuture =
        CompletableFuture.supplyAsync(
            () -> {
              System.out.println(Thread.currentThread().getName() + ": Second Thread started");
              // int i = 1  / 0;
              try {
                Thread.sleep(10 * 1000);
              } catch (InterruptedException e) {
                throw new RuntimeException(e);
              }
              System.out.println(Thread.currentThread().getName() + ": Second Thread completed");
              futuresCompletedList.add(Thread.currentThread().getName());
              return Thread.currentThread().getName();
            });

    CompletableFuture<Void> voidCompletableFuture =
        CompletableFuture.allOf(firstCompletableThreadFuture, secondCompletableFuture);
    voidCompletableFuture
        .whenCompleteAsync(
            (res, ex) -> {
              if (null != ex) {
                System.out.println("Exception occurred: " + ex.getMessage());
              }
              System.out.println("result: " + res);
              System.out.println(futuresCompletedList);
            })
        .join();
    System.out.println(firstCompletableThreadFuture.join());
    System.out.println(secondCompletableFuture.join());
    System.out.println(Thread.currentThread().getName() + ": All threads completed");
  }
}
