package com.karthik.demo.problems.leetcode;

//https://leetcode.com/problems/move-zeroes/description/

import java.util.Arrays;

public class MoveZeros {

    //native way of solving the problem

    public static void main(String[] args) {
        MoveZeros m = new MoveZeros();
        m.moveZerosNative(new int[]{0, 1, 0, 3, 12});
        m.moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

    public void moveZerosNative(int[] nums) {
        int[] res = new int[nums.length];
        int j = 0;
        for (int num : nums) {
            if (num != 0) {
                res[j] = num;
                j++;
            }
        }
        System.out.println(Arrays.toString(res));
    }

    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[j] = num;
                j++;
            }
        }
        //back fill
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
