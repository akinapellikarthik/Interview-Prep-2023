package com.karthik.demo.dsa2k24.datastructures.heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        Heap myHeap = new Heap();
        myHeap.insert(10);
        myHeap.insert(11);
        myHeap.insert(12);
        myHeap.insert(13);
        System.out.println(myHeap.getHeap());

        myHeap.insert(14);
        myHeap.insert(15);

        System.out.println(myHeap.getHeap());

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(10);
        maxHeap.add(11);
        maxHeap.add(12);
        maxHeap.add(13);
        maxHeap.add(14);
        maxHeap.add(15);

        System.out.println(maxHeap);
    }




}
