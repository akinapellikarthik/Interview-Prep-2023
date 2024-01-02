package com.karthik.demo.problems;

import java.util.Arrays;

public class HummingWeight {

  public static void main(String[] args) {
    int n = 3;
    System.out.println(Integer.toBinaryString(3));
    System.out.println(3 & 1);
    System.out.println(4 & 1);
    n = n >>> 1;
    System.out.println(Integer.toBinaryString(16 >>> 1));

  }

  public int hammingWeight(int n) {
    int[] inputArray = new int[32];
    boolean flag = n < 0;
    int temp =0;
    int carry = 0;

    if(n == -2147483648) {
      return 1;
    }
    n = n < 0 ? (n * -1) : n;

    for(int i=inputArray.length - 1 ; i>=0;i--){
        inputArray[i] = n % 2;
        n = n / 2;
    }

    if(flag){ //represents negative number
      for(int i = inputArray.length - 1 ; i>=0;i--) {
        inputArray[i] = 1 - inputArray[i];
        temp = inputArray[i] + 1;
        if(temp == 1){
          inputArray[i] = inputArray[i] + 1 + carry;
          carry = 0;
        }
        else{
          inputArray[i] = carry;
          carry = 1;
        }
      }
    }

    return (int)Arrays.stream(inputArray).peek(System.out::print).filter(item -> item == 1).count();


  }

  public int hammingWeightNewImpl(int n) {
    int count = 0;
    while(n != 0){
      int lastBit = n & 1;
      count += lastBit;
      n = n >>> 1;
    }
    return count;
  }
}
