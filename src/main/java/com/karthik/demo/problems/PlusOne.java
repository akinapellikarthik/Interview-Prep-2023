package com.karthik.demo.problems;

import java.util.Stack;

public class PlusOne {

  public static void main(String[] args) {
    //var ints = new PlusOne().plusOne(new int[]{1,2,3});
    /*for (int i: ints) {
      System.out.print(i);
    }*/
    //int[] ip = new int[]{1,2,3};
    //int[] ip = new int[]{4,3,2,1};
    //int[] ip = new int[]{9,9};
    int[] ip = new int[]{8,9,9,9};
    for (int i : new PlusOne().plusOneNewImpl(ip)) {
      System.out.print(i+":");
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

  public int[] plusOneNewImpl(int[] digits){
    int len = digits.length;
    int start = 1;
    int rem = 0;
    Stack<Integer> tempStack = new Stack<>();
    while(len != 0){
      if(start > 0 || rem !=0){
       int res= digits[len -1] + 1;
       if(res > 9){
         tempStack.push(0);
         rem = 1;
       }else {
         tempStack.push(res);
         rem = 0;
       }
       start--;
      }
      else {

        tempStack.push(digits[len-1] + rem);
      }
      len--;
    }
    if(rem == 1)
      tempStack.push(rem);

    int[] result = new int[tempStack.size()];
    int ctr = 0;

    while(!tempStack.empty()){
      result[ctr] = tempStack.pop();
      ctr++;
    }

    return result;
  }

}
