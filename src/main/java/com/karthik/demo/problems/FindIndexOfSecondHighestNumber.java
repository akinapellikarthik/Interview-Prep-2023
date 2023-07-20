package com.karthik.demo.problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindIndexOfSecondHighestNumber {

  public int secondHighestIndex(int[] a){

    if(a.length == 0)
      return -1;
    else if(a.length == 1)
      return 1;
    else {
      //1,4,3
      //Second Highest is 3, index is 2
      //Number, Index
      Map<Integer, Integer> indexMap = new LinkedHashMap<>();
      int maxNumber = 0;
      int secondHighestNumber = 0;
      for (int i = 0; i < a.length; i++) {
        indexMap.put(a[i], i);
        if (a[i] > maxNumber)
          maxNumber = a[i];//finds the highest number
      }

      //finds the second highest number
      for (int i = 0; i < a.length; i++) {

        if (a[i] < maxNumber)
          secondHighestNumber = a[i];
      }

      return indexMap.get(secondHighestNumber);
    }
  }

}
