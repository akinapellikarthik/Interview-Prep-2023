package com.karthik.demo.java17.fp.examples;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

  // swiss -> w
  // programming -> p
  // aabbcc -> empty
  // via Normal Programming
  public Character findFirstNonRepeatingChar(String s) {
    Map<Character, Integer> countMap = new LinkedHashMap<>();
    for (char ch : s.toCharArray()) {
      countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
    }
    for (Map.Entry<Character, Integer> characterIntegerEntry : countMap.entrySet()) {
      if (characterIntegerEntry.getValue() == 1) {
        return characterIntegerEntry.getKey();
      }
    }
    return null;
  }

  public Optional<String> findFirstNonRepeatingCharUsingFunctionalProgramming(String s) {
    String[] split = s.split("");
    Map<String, Long> groupByMap =
        Arrays.stream(split)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    /*for(Map.Entry<String,Long> entry: groupByMap.entrySet()){
        if(entry.getValue() ==1){
            return Optional.of(entry.getKey());
        }
    }
    return Optional.empty();*/
    return Arrays.stream(split).filter(c -> groupByMap.get(c) == 1).findFirst();
  }

  public static void main(String[] args) {
    FirstNonRepeatingCharacter firstNonRepeatingCharacter = new FirstNonRepeatingCharacter();
    Character swiss = firstNonRepeatingCharacter.findFirstNonRepeatingChar("aabbcc");
    Optional<String> swiss1 =
        firstNonRepeatingCharacter.findFirstNonRepeatingCharUsingFunctionalProgramming(
            "programming");
    System.out.println(swiss);
    System.out.println(swiss1.get());
  }
}
