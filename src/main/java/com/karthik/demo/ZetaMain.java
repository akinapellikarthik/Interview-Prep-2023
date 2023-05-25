package com.karthik.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class CustomList extends ArrayList {

    public boolean add(int i) {


        return false;
    }
}

public class ZetaMain {

    public static void main(String[] args) {
        System.out.println("Zeta Main demo...");
        //[1,2,3,2,4] -->

        //[1,2,2,3,4] --> [1,2,3,4]
        //[]
        /*int [] inputArray = {1,2,2,3,4};
        int [] resultArray = new int[inputArray.length];
        int j = 0;
        for (int i = 0; i < inputArray.length ; i++) {

            if(inputArray[i] != inputArray[j]) {

                resultArray[i] = inputArray[i];

                //resultArray[j] = inputArray[j];
                j++;
            }
            else {

                resultArray[i] = inputArray[i];
            }
        }
        for (int i: resultArray) {
            System.out.print(i+" ");
        }*/

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        Set<Integer> arraySet = new LinkedHashSet<>();
        arrayList.forEach(arraySet::add);
        arraySet.forEach(System.out::println);

        //USer is offline or online - Green - Available, Red - away,
    }
}

