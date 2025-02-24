package com.karthik.demo.multithreading.practice.chatgpt.exercises;

import java.util.List;
import java.util.concurrent.*;

public class ExecutorSrDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Callable<String> task1 = () -> {
            System.out.println("First t");
            Thread.sleep(1 * 1000);
            return "firstThread";
        };Callable<String> task2 = () -> {
            System.out.println("Second t");
            Thread.sleep(2 * 1000);
            return "secondThread";
        };Callable<String> task3 = () -> {
            System.out.println("Third t");
            Thread.sleep(3 * 1000);
            return "thirdThread";
        };
        /*executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);*/

        List<Future<String>> futures = executorService.invokeAll(List.of(task1, task2, task3));
        for(Future<String> f: futures){
            System.out.println(f.get());
        }

        executorService.shutdown();

        if(!executorService.awaitTermination(15, TimeUnit.SECONDS)){
            executorService.shutdown();
        }
    }
}
