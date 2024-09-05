package com.karthik.demo.dsa2k24.datastructures.hashtables;

public class Main {
  public static void main(String[] args) {

    HashTable hashTable = new HashTable();
    hashTable.set("one", 1);
    hashTable.set("two", 8);
    hashTable.set("three", 3);
    hashTable.set("four", 4);
    hashTable.set("five", 5);
    hashTable.set("six", 6);
    hashTable.set("seven", 7);
    hashTable.set("eight", 8);
    hashTable.printTable();
    System.out.println(hashTable.get("one"));
    System.out.println(hashTable.get("two"));
    System.out.println(hashTable.get("four"));
    System.out.println(hashTable.getAllKeys());
  }
}
