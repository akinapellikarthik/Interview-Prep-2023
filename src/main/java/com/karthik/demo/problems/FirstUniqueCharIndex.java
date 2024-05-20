package com.karthik.demo.problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharIndex {

    public int firstUniqCharIdx(String s) {
        Map<Character, Integer> uniqueCharMap = new LinkedHashMap<>();
        Map<Character, Integer> uniqueCharIdxMap = new LinkedHashMap<>();
        int idx = 0;
        for(Character ch: s.toCharArray()){
            uniqueCharMap.put(ch, uniqueCharMap.getOrDefault(ch,0) + 1);
            uniqueCharIdxMap.put(ch, idx);
            idx++;
        }

        var first = uniqueCharMap.entrySet().stream()
                .filter(characterIntegerEntry -> characterIntegerEntry.getValue() == 1)
                .findFirst();

        if(first.isEmpty())
            return  -1;
        else
            return uniqueCharMap.get(first.get().getKey());
    }
}
