package com.karthik.demo.dsalgo;

public class SingleLinkedList {
  Node start;

  public SingleLinkedList() {
    this.start = null;
  }

  public void addElement(int ele) {
    Node node = new Node(ele);
    if(start == null){
      this.start = node;
    }
    else {
      Node temp = start;
      while (temp.next != null){
        temp = temp.next;
      }
      temp.next = node;

    }
  }

  public void printList() {
    Node p = this.start;
    while(p != null){
      System.out.println(p.info);
      p = p.next;
    }
  }

  public void countNodes(){
    Node temp = start;
    int nodesCount = 0;
    while(temp != null){
      nodesCount++;
      temp = temp.next;
    }

    System.out.println("No.of nodes is:"+nodesCount);
  }

  public void insertNodeAtBeginningOfList(int value){
    Node temp = new Node(value);
    if(start == null){
      //this is the starting point
      start = temp;
    }
    temp.next = start;
    start = temp;
  }

  public void insertNodeAtEndOfList(int value){
    Node temp = new Node(value);
    Node p = start;
    if(start == null) {
      start = temp;
      return;
    }
    while(p.next != null){
      p = p.next;
    }
    p.next = temp;
  }


}
