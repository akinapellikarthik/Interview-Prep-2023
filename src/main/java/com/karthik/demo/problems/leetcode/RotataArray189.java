package com.karthik.demo.problems.leetcode;

public class RotataArray189 {

  public static void main(String[] args) {
    RotataArray189 r = new RotataArray189();
    r.rotate(new int[] {1, 2, 3, 4, 5, 6, 7}, 3);
  }

  public void rotate(int[] nums, int k) {
    int n = nums.length;
    k %= n;
    if (nums == null || n == 0) return;
    // first all rotate
    rotateArray(nums, 0, n - 1);
    // reverse first k elements
    rotateArray(nums, 0, k - 1);
    // reverse rest k to end
    rotateArray(nums, k, n - 1);
  }

  private void rotateArray(int[] nums, int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }
}
