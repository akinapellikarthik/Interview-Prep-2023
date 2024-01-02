package com.karthik.demo.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    //return getInts(nums, target);
    Hashtable<Integer, Integer> hashTable = new Hashtable<Integer, Integer>();
    int i = 0;
    while ((i < nums.length) && (hashTable.get(nums[i]) == null)) {
      hashTable.put(target - nums[i], i);
      i++;
    }
    if (i < nums.length) {
      return new int[]{hashTable.get(nums[i]),i};
    }
    return null;
  }

  @NotNull
  private int[] getInts(int[] nums, int target) {
    int[] result = new int[2];
    //Value, Index
    Map<Integer, Integer> hashMap = new HashMap<>();
    //fill the hashMap
    for (int i = 0; i < nums.length; i++) {
      hashMap.put(nums[i],i);
    }
    for (int i = 0; i < nums.length; i++) {
      int remaining = target - nums[i];
      if(hashMap.containsKey(remaining) && hashMap.get(remaining) != i)
      {
        result[i] = hashMap.get(nums[i]);
        //result[1] = hashMap.get(remaining);
      }
    }

    return result;
  }

}
