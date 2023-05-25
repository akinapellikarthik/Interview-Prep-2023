package com.karthik.demo.multithreading.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SingletonDemoUsingMultithreadingTest {


  @Test
  void verifyGetInstanceCalledOnceOnly() {
    SingletonDemoUsingMultithreading.getInstance();
    SingletonDemoUsingMultithreading.getInstance();
    Assertions.assertEquals(1,SingletonDemoUsingMultithreading.getInstance().getCounter());

  }
}