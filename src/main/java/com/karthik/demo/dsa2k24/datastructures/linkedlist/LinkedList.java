package com.karthik.demo.dsa2k24.datastructures.linkedlist;

public class LinkedList {

  private Node head;
  private Node tail;
  private int length;

  class Node {
    int value;
    Node next;
    Node(int value){
      this.value = value;
    }
  }

  LinkedList(int value){
    Node newNode = new Node(value);
    length = 1;
    head = newNode;
    tail = newNode;
  }

  public void printList(){
    Node tempNode = head;
    while (tempNode !=null){
      System.out.print(tempNode.value+"->");
      tempNode = tempNode.next;
    }
    System.out.println("X");
  }

  public void getHead(){
    System.out.println("Head: "+head.value);
  }

  public void getTail(){
    System.out.println("Tail: "+tail.value);
  }

  public void getLength(){
    System.out.println("Length: "+length);
  }

  public void append(int value){
    Node newNode = new Node(value);
    if(length == 0){//no linkedList exists
      head = newNode;
    }
    else {//if linkedList already exists
      tail.next = newNode;
    }
    tail = newNode;
    length++;
  }



}
