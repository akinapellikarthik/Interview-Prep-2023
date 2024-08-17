package com.karthik.demo.problems;

import java.util.LinkedList;
import java.util.Queue;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Location {
  private int x;
  private int y;
}

public class ZombieEffect {

  public static void main(String[] args) {
    // int[][] zombieCells = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
    /*int[][] zombieCells = {  {1, 2, 2, 1, 2},
    {1, 2, 1, 2, 1},
    {1, 1, 1, 1, 2},
    {1, 2, 1, 1, 1} };*/

    int[][] zombieCells = {
      {2, 1, 1},
      {1, 1, 0},
      {0, 1, 1}
    };

    var i = zombieRotationCount(zombieCells);
    System.out.println(i);
  }

  public static boolean isValidLocation(int row, int col, int rowLen, int colLen) {
    return row >= 0 && row < rowLen && col >= 0 && col < colLen;
  }

  public static void printZombieMatrix(int[][] cells) {
    for (int i = 0; i < cells.length; i++) {
      for (int j = 0; j < cells[i].length; j++) {
        System.out.print(cells[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println(System.lineSeparator());
  }

  public static int zombieRotationCount(int[][] cells) {
    int count = 0;
    // int[][] zombieCells = {{2  ,1   ,1},{1  ,1   ,0},{0,   1,  2}};
    // 0 - empty cell
    // 1- human
    // 2 - zombie
    int rowLen = cells.length;
    int colLen = cells[0].length;
    int nextZombieCount = 0;
    int currentZombieCount = 0;
    int humanCount = 0;
    Queue<Location> locationQueue = new LinkedList<>();
    System.out.println("First Print");
    printZombieMatrix(cells);
    // count and find the zombies
    for (int i = 0; i < cells.length; i++) {
      for (int j = 0; j < cells[i].length; j++) {
        // hey I have found zombie
        if (cells[i][j] == 2) {
          locationQueue.add(new Location(i, j));
          currentZombieCount++;
        } else if (cells[i][j] == 1) {
          humanCount++;
        }
      }
    }

    while (!locationQueue.isEmpty()) {

      for (int i = 0; i < currentZombieCount; i++) {
        Location zombieLocation = locationQueue.poll();
        // once we find zombieLocation, traverse left, right, top and down
        // during traverse, check if human only act and also if co-ordinates are correct
        int x = zombieLocation.getX();
        int y = zombieLocation.getY();

        // bottom
        if (isValidLocation(x + 1, y, rowLen, colLen) && cells[x + 1][y] == 1) {
          cells[x + 1][y] = 2;
          locationQueue.add(new Location(x + 1, y));
          nextZombieCount++;
          humanCount--;
        }
        // up
        if (isValidLocation(x - 1, y, rowLen, colLen) && cells[x - 1][y] == 1) {
          cells[x - 1][y] = 2;
          locationQueue.add(new Location(x - 1, y));
          nextZombieCount++;
          humanCount--;
        }
        // right
        if (isValidLocation(x, y + 1, rowLen, colLen) && cells[x][y + 1] == 1) {
          cells[x][y + 1] = 2;
          locationQueue.add(new Location(x, y + 1));
          nextZombieCount++;
          humanCount--;
        }
        // left
        if (isValidLocation(x, y - 1, rowLen, colLen) && cells[x][y - 1] == 1) {
          cells[x][y - 1] = 2;
          locationQueue.add(new Location(x, y - 1));
          nextZombieCount++;
          humanCount--;
        }
      }

      if (nextZombieCount == 0) break;
      currentZombieCount = nextZombieCount;
      nextZombieCount = 0;

      count++;
      System.out.println("Next Iteration");
      printZombieMatrix(cells);
      System.out.println(locationQueue);
    }
    System.out.println(humanCount);
    return humanCount == 0 ? count : -1;
  }
}
