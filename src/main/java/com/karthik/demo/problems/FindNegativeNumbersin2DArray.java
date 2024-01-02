package com.karthik.demo.problems;

//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
public class FindNegativeNumbersin2DArray {

  public int countNegatives(int[][] grid) {
    int counter = 0;
    for(int i=0;i<grid.length;i++){
      for(int j= 0;j< grid[i].length;j++){
        if(grid[i][j]<0)
          ++counter;
      }
    }

    return counter;
  }

}
