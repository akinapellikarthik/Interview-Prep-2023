package com.karthik.demo;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class OT {

    ReentrantLock lock = new ReentrantLock();

    public void fn(){

        Thread t1 = new Thread(() -> {
            int counter = 0;
            for (int i = 0; i < 10; i++) {
                try {
                    if(lock.tryLock()){
                        lock.lock();
                        System.out.println("Even Thread 1");
                        if(counter % 2 == 0) {
                            System.out.println(counter);
                        }
                        counter++;
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }finally {
                    lock.unlock();
                }
            }

        });
        Thread t2 = new Thread(() -> {
            int counter = 0;
            for (int i = 0; i < 10; i++) {
                try {
                    if(lock.tryLock()){
                        lock.lock();
                        System.out.println("Even Thread 2");
                        if(counter % 2 != 0) {
                            System.out.println(counter);
                        }
                        counter++;
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }finally {
                    lock.unlock();
                }
            }

        });
        t1.start();
        t2.start();
    }




    public static void main(String[] args) {

        OT ot = new OT();

        ot.fn();




    }
}
