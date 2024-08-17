package com.karthik.demo.problems;

import java.util.LinkedList;
import java.util.Queue;

// This program is the solution for LeetCode Medium Problem:
// https://leetcode.com/problems/rotting-oranges/

class RottenOrangesSolution {

  boolean isValidLocation(int row, int col, int rowLen, int colLen) {
    return row >= 0 && row < rowLen && col >= 0 && col < colLen;
  }

  public int orangesRotting(int[][] grid) {
    int count = 0;
    // 0 - empty cell
    // 1 - fresh orange
    // 2 - rotten orange
    int rowLen = grid.length;
    int colLen = grid[0].length;
    int nextRottenOrangesCount = 0;
    int currentRottenOrangesCount = 0;
    int freshOranges = 0;
    Queue<Location> locationQueue = new LinkedList<>();
    // count and find the rotten oranges
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        // hey I have found rotten orange
        if (grid[i][j] == 2) {
          locationQueue.add(new Location(i, j));
          currentRottenOrangesCount++;
        } else if (grid[i][j] == 1) {
          freshOranges++;
        }
      }
    }

    while (!locationQueue.isEmpty()) {

      for (int i = 0; i < currentRottenOrangesCount; i++) {
        Location rottenOrangeLocation = locationQueue.poll();
        // once we find rotten orange location, traverse left, right, top and down
        // during traverse, check if fresh orange only act and also if co-ordinates are correct
        int x = rottenOrangeLocation.getX();
        int y = rottenOrangeLocation.getY();

        // bottom
        if (isValidLocation(x + 1, y, rowLen, colLen) && grid[x + 1][y] == 1) {
          grid[x + 1][y] = 2;
          locationQueue.add(new Location(x + 1, y));
          nextRottenOrangesCount++;
          freshOranges--;
        }
        // up
        if (isValidLocation(x - 1, y, rowLen, colLen) && grid[x - 1][y] == 1) {
          grid[x - 1][y] = 2;
          locationQueue.add(new Location(x - 1, y));
          nextRottenOrangesCount++;
          freshOranges--;
        }
        // right
        if (isValidLocation(x, y + 1, rowLen, colLen) && grid[x][y + 1] == 1) {
          grid[x][y + 1] = 2;
          locationQueue.add(new Location(x, y + 1));
          nextRottenOrangesCount++;
          freshOranges--;
        }
        // left
        if (isValidLocation(x, y - 1, rowLen, colLen) && grid[x][y - 1] == 1) {
          grid[x][y - 1] = 2;
          locationQueue.add(new Location(x, y - 1));
          nextRottenOrangesCount++;
          freshOranges--;
        }
      }

      if (nextRottenOrangesCount == 0) {
        break;
      }
      currentRottenOrangesCount = nextRottenOrangesCount;
      nextRottenOrangesCount = 0;

      count++;
    }
    return freshOranges == 0 ? count : -1;
  }
}
