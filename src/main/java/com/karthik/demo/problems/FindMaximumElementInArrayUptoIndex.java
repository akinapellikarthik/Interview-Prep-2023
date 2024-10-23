package com.karthik.demo.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class FindMaximumElementInArrayUptoIndex {

  public static List<Integer> streamMax(int[] nums) {

    List<Integer> maxResults = new ArrayList<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    for (int i : nums) {
      maxHeap.add(i);
      int maxNum = maxHeap.peek();
      maxResults.add(maxNum);
    }

    return maxResults;
  }
}
