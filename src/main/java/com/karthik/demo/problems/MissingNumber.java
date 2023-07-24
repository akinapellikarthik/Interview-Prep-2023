package com.karthik.demo.problems;

public class MissingNumber {

  public int missingNumber(int[] arr){

    int sum = ((arr.length )* (arr.length + 1 )) / 2;
    int calSum = 0;
    for (int i: arr) {
      calSum += i;
    }

    
    return sum - calSum;
  }

}
