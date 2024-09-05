package com.karthik.demo.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
  public static List<List<String>> groupAnagrams(String[] strings) {
    Map<String, List<String>> tempMap = new LinkedHashMap<>();

    for (String s : strings) {
      char[] ch = s.toCharArray();
      Arrays.sort(ch);
      String tempString = new String(ch);
      if (!tempMap.containsKey(tempString)) {
        List<String> tempArrayList = new ArrayList<>();
        tempArrayList.add(s);
        tempMap.put(tempString, tempArrayList);
      } else {
        tempMap.get(tempString).add(s);
      }
    }
    return tempMap.values().stream().toList();
  }
}
