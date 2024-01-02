package com.karthik.demo.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class SingleNumber {

  public int singleNumber(int[] nums) {

    Set<Integer> hashSet = new HashSet<>();
    for (int i:nums) {
      if(hashSet.contains(i))
        hashSet.remove(i);
      else
        hashSet.add(i);
    }
    System.out.println(hashSet);

    ;

    return (int) Arrays.stream(hashSet.toArray()).findAny().get();
  }

}
