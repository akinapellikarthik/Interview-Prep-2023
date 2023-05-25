package com.karthik.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Count triplet - sum of 2 element equal to 3rd element - {1, 5, 3, 2} - op = 2. (1+2=3, 2+3=5)
 */

//1, 5, 3, 2
//1, 2, 3, 5
public class IDFCMain {

    public static void main(String[] args) {

        int tripletCount = 0;
        List<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(5);
        inputList.add(3);
        inputList.add(2);
        inputList.add(8);
        inputList.add(9);
        Collections.sort(inputList);//1,2,3,5,8,9
        for (int i = 0; i < inputList.size(); i++) {

            int firstEle = inputList.get(i);
            List<Integer> subList = inputList.subList(i + 1, inputList.size());

            for (int j = 0; j < subList.size(); j++) {
                int secEle = subList.get(j);
                if (inputList.contains(firstEle + secEle)){
                    System.out.println(firstEle+","+secEle);
                    tripletCount++;
                }
            }
        }
        System.out.println(tripletCount);


    }
}
