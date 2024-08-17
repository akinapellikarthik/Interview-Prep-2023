package com.karthik.demo.unnamedpkg;

/**
 * Given two unsorted arrays A of size N and B of size M of distinct elements, the task is to find
 * all pairs from both arrays whose sum is equal to X.
 *
 * <p>Note: All pairs should be printed in increasing order of u. For eg. for two pairs (u1,v1) and
 * (u2,v2), if u1 < u2 then (u1,v1) should be printed first else second.
 *
 * <p>Example 1:
 *
 * <p>Input: A[] = {1, 2, 4, 5, 7} -- sorting --> {1,2,4,5,7} - N B[] = {5, 6, 3, 4, 8} -- sorting
 * --> {3,4,5,6,8} - M - TC: O(N * M) - SC: O(1) X = 9 Output: 1 8 4 5 5 4 Explanation: (1, 8), (4,
 * 5), (5, 4) are the pairs which sum to 9. Example 2: Input: A[] = {-1, -2, 4, -6, 5, 7} B[] = {6,
 * 3, 4, 0} X = 8 Output: 4 4 5 3
 */
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

  static class Pair {
    int first;
    int second;

    public Pair(int first, int second) {
      this.first = first;
      this.second = second;
    }

    @Override
    public String toString() {
      return first + " " + second;
    }
  }

  static List<Pair> solution(int[] a, int[] b, int x) {
    List<Pair> pairs = new ArrayList<>();

    Arrays.sort(a); // sorted
    Arrays.sort(b); // sorted
    /*
    A[] = {1, 2, 4, 5, 7} -- sorting --> {1,2,4,5,7} - N
    B[] = {5, 6, 3, 4, 8} -- sorting --> {3,4,5,6,8, 10} - M - TC: O(N * M) - SC: O(1)
     */
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        if (a[i] + b[j] == x) {
          // we got success
          pairs.add(new Pair(a[i], b[j]));
          break;
        }
      }
    }
    return pairs;
  }

  // A[] = {1, 2, 4, 5, 7}
  // B[] = {5, 6, 3, 4, 8}
  // X = 9
  // Output:
  // 1 8
  // 4 5
  // 5 4

  public static void main(String[] args) {
    int[] a = {1, 2, 4, 5, 7};
    int[] b = {5, 6, 3, 4, 8};
    int x = 9;
    List<Pair> ans = solution(a, b, x);
    System.out.println(ans);
  }
}
