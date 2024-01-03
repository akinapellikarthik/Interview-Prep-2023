package com.karthik.demo.problems;

public class RunningSum1D {

  public static void main(String[] args) {
    RunningSum1D ob = new RunningSum1D();
    ob.runningSum(new int[]{1,2,3,4});
  }

  public int[] runningSum(int[] nums) {
    int[] res = new int[nums.length];
    res[0] = nums[0];
    int sum = nums[0];
    for (int i = 1; i < nums.length; i++) {
      sum +=nums[i];
      res[i] = sum;
    }
    return res;
  }

}
