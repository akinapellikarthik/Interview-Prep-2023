package com.karthik.demo.dsa2k24.datastructures.hashtables;

import java.util.ArrayList;

public class HashTable {
  private int size = 7;
  private Node[] dataMap;

  public HashTable() {
    this.dataMap = new Node[size];
  }

  class Node {
    private String key;
    private int value;
    private Node next;

    public Node(String key, int value) {
      this.key = key;
      this.value = value;
    }
  }

  public void printTable() {
    for (int i = 0; i < dataMap.length; i++) {
      Node temp = dataMap[i];
      System.out.println(i + ":");
      while (temp != null) {
        System.out.println(" { " + temp.key + " = " + temp.value + " } ");
        temp = temp.next;
      }
    }
  }

  public int hash(String key) {
    int hash = 0;
    char[] keyChars = key.toCharArray();
    for (int ascii : keyChars) {
      hash = (hash + ascii * 23) % dataMap.length;
    }
    return hash;
  }

  public void set(String key, int value) {
    int index = hash(key);
    Node newNode = new Node(key, value);
    if (dataMap[index] == null) {
      dataMap[index] = newNode;
    } else {
      Node temp = dataMap[index];
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
    }
  }

  public int get(String key) {
    int index = hash(key);

    Node temp = dataMap[index];
    while (temp != null) {
      if (temp.key.equalsIgnoreCase(key)) {
        return temp.value;
      }
      temp = temp.next;
    }

    return -1;
  }

  public ArrayList getAllKeys() {
    ArrayList<String> allKeys = new ArrayList<>();
    for (Node node : dataMap) {
      Node temp = node;
      while (temp != null) {
        allKeys.add(temp.key);
        temp = temp.next;
      }
    }
    return allKeys;
  }
}
