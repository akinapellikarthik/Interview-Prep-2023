package com.karthik.demo.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/add-to-array-form-of-integer/description/
public class AddToArrayFormOfInteger {

  public static void main(String[] args) {
    int[] num = new int[]{0};
    int k = 23;
    new AddToArrayFormOfInteger().addToArrayForm(num , k);
  }

  //num = [1,2,0,0], k = 34
  //[1,2,3,4]
  //1200 + 34 = 1234
  public List<Integer> addToArrayForm(int[] num, int k) {
    Stack<Integer> tempStack = new Stack<>();
    List<Integer> result = new ArrayList<>();
    int[] kArray = new int[Math.max(num.length, String.valueOf(k).length())];
    int kLen = kArray.length - 1;
    int carry = 0;



    while (k > 0){
      kArray[kLen] = k % 10;
      k = k / 10;
      kLen--;
    }


    for (int i = num.length -1; i >= 0; i--) {
      int res = num[i] + kArray[i] + carry;
      if(res >= 10){
        carry = res / 10;
        res = res % 10;
      }
      else {
        carry = 0;
      }
      tempStack.push(res);
    }

    if(carry !=0)
      tempStack.push(carry);

    while(!tempStack.isEmpty())
      result.add(tempStack.pop());
    System.out.println(result);
    return result;


  }

  public List<Integer> addToArrayFormNewImpl(int[] num, int k) {

    List<Integer> result = new ArrayList<>();
    int cur = k;

    for (int i = num.length - 1; i >=0 ; i--) {
      int temp = num[i] + k;
      result.add(temp % 10);//4
      int carry = temp / 10;//3

    }

    return result;

  }

}
