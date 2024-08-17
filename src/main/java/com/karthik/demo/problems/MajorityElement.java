package com.karthik.demo.problems;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

  // https://leetcode.com/problems/majority-element/
  public int majorityElement(int[] nums) {
    int searchCnt = (nums.length / 2) + 1;
    Map<Integer, Integer> countMap = new HashMap<>();
    for (int i : nums) {
      countMap.put(i, countMap.getOrDefault(i, 0) + 1);
    }

    var ele = countMap.entrySet().stream().filter(s -> s.getValue() >= searchCnt).findFirst();

    if (ele.isEmpty()) return -1;
    else return ele.get().getKey();
  }
}
