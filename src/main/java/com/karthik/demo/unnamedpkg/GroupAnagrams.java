package com.karthik.demo.unnamedpkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    List<List<String>> result = new ArrayList<>();
    for (String s : strs) {
      var sCharArray = s.toCharArray();
      Arrays.sort(sCharArray);
      String s1 = new String(sCharArray);
      if (!map.containsKey(s1)) {
        List<String> arr = new ArrayList<>();
        arr.add(s);
        map.put(s1, arr);
      } else {
        map.get(s1).add(s);
      }
    }
    result.addAll(map.values());
    return result;
  }
}
