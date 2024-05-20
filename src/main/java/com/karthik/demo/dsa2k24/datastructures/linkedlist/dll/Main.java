package com.karthik.demo.dsa2k24.datastructures.linkedlist.dll;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList(10);
        dll.printList();
        dll.getHead();
        dll.getTail();
        dll.getLength();

    }
}
