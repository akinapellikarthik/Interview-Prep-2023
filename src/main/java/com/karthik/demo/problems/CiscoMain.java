package com.karthik.demo.problems;

public class CiscoMain {

  public static void main(String[] args) {
    System.out.println("Hello");
    String s = "42";
    // Integer
    /**
     * Input: s = "42" from Abhishek Ghiya (Cisco) to everyone: 5:20 PM Output: 42 from Abhishek
     * Ghiya (Cisco) to everyone: 5:20 PM Input: s = "4193 with words" Output: 4193
     */

    // s.length();//2
    // Math.pow()
    CiscoMain ob = new CiscoMain();
    Integer result = ob.strToIntConverter("42");
    System.out.println(result);

    String s1 = ob.cleaner("nnnn");

    Integer result1 = ob.strToIntConverter(s1);
    System.out.println(result1);

    Integer roboCount = ob.robotMove(new int[3][2]);
    System.out.println(roboCount);
  }

  public String cleaner(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (Character.isDigit(s.charAt(i))) sb.append(s.charAt(i));
    }

    return sb.length() == 0 ? "0" : sb.toString();
  }

  public Integer strToIntConverter(String s) {
    int res = 0;
    int temp = s.length() - 1;
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i); // 4
      if (Character.isDigit(ch)) {
        res += (Character.getNumericValue(ch) * Math.pow(10, temp));
        temp--;
      }
    }

    return res;
  }

  /*

      There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]).
      The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]).
      The robot can only move either down or right at any point in time.
      Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.



  Input: m = 3, n = 2
  Output: 3

  Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:

  1. Right -> Down -> Down
  [0,0] -> [1,0] -> [2,0]
  2. Down -> Down -> Right
  [1,0] -> [
  3. Down -> Right -> Down

      [m][n]
      [0][0]
      [1][1] - Target
      //Down - right only
      //r,c
      //Recursive call until the condition is met
      if(r<=row.length && c<=col.length)
      {
      count++;
      }
      //r+,c - Down
      //r,c+ - Right
       */

  public boolean validLocation(int r, int c, int totalRows, int totalCols) {
    return (r < totalRows - 1) && (c < totalCols - 1);
  }

  // whatsapp - lot of users
  // Millions or Billions
  // Mobile - Up and Running -
  // Websockets, PUB-SUB - Kafka -
  // Admin - 1
  // UUID - Each message - UUID - Sent - V - Received - VV
  // NOSQL - Elastic Search
  // Cache
  // CPU Scaling -

  // UI - Drop Down - AD Group -
  //

  public Integer robotMove(int[][] grid) {
    int counter = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {

        // down
        if (validLocation(i + 1, j, grid.length, grid[i].length)
            || validLocation(i, j + 1, grid.length, grid[i].length)) {
          counter += 2;
        }
        // right
        /*if(validLocation(i,j+1, grid.length, grid[i].length)){
            counter++;
        }*/
      }
    }

    return counter;
  }
}
