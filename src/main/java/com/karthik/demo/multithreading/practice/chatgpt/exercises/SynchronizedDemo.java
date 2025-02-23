package com.karthik.demo.multithreading.practice.chatgpt.exercises;

import java.util.concurrent.CompletableFuture;

public class SynchronizedDemo {
    int i= 1;
    public int getValue() {
        i++;
        return i;
    }
    public static void main(String[] args) {
        SynchronizedDemo demo = new SynchronizedDemo();
        for (int i = 0; i < 100 ; i++) {

            CompletableFuture.supplyAsync(demo::getValue).thenAccept(System.out::println);
        }

    }
}
