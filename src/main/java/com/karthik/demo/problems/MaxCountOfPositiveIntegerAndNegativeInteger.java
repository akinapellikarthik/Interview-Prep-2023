package com.karthik.demo.problems;

//https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/
public class MaxCountOfPositiveIntegerAndNegativeInteger {


  public int maximumCount(int[] nums) {
    int positiveCounter = 0;
    int negativeCounter = 0;

    for (int i:nums) {
      if(i <0)
        negativeCounter++;
      else if(i !=0)
        positiveCounter++;
    }

    return Math.max(positiveCounter, negativeCounter);

  }

}
