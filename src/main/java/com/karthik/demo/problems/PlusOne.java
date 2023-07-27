package com.karthik.demo.problems;

import java.util.Stack;

public class PlusOne {

  public static void main(String[] args) {
    var ints = new PlusOne().plusOne(new int[]{1,2,3});
    for (int i: ints
    ) {
      System.out.print(i);
    }
  }


  public int[] plusOne(int[] digits) {
    Stack<Integer> tempStack = new Stack<>();
    int[] result = new int[digits.length];
    int ctr = 0;
    int counter = digits.length - 1;
    int tempSum = 0;
    for(int i=0;i<digits.length;i++){
      tempSum+= (digits[i] * Math.pow(10, counter));
      counter--;
    }
    tempSum+=1;
    System.out.println(tempSum);

    int [] temp = new int[String.valueOf(tempSum).length()]; // Calculate the length of digits
    int i = String.valueOf(tempSum).length()-1 ;  // Initialize the value to the last index

    do {
      temp[i] = tempSum % 10;
      tempSum = tempSum / 10;
      i--;
    } while(tempSum>0);

    return temp;

    //return Integer.toString(tempSum).chars().map(c -> c-'0').toArray();

    //return result;
  }

}
