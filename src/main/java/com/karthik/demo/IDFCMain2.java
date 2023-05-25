package com.karthik.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * Longest Distinct characters in string - input: geeksforgeeks
 * eksforg
 */
//ge - valid
//gee - not valid string
// g e e k s f o r g e e k s
// e
// e
// k
// s
// f
// o
// r
// g
// e
// e
// k
// s

//Console the coin occurrences in the target sum - N=15
//Coin - 1,2,5
//7 - 5, 2
//10 - 5
//ONE COIN MIN
public class IDFCMain2 {
    public static void main(String[] args) {
        int target = 15;
        int[] boxes = {1,2,5};
        int i = boxes.length - 1;
        Map<Integer, Integer> pickUpMap = new HashMap<>();
        while(target > 0){
            int redValue = boxes[i];
            target = target - redValue;
            i--;
            //if(pickUpMap.containsValue(redValue))
                pickUpMap.put(redValue,pickUpMap.getOrDefault(redValue,1));

        }
        System.out.println(pickUpMap);
    }
}
