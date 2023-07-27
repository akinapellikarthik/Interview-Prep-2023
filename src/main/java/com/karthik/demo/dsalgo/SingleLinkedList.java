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
      System.out.print(p.info+"->");
      p = p.next;
    }
    System.out.println("X");
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
  
  public void insertAtAGivenPosition(int value, int pos){
    //1->2->3->4->5

    //10 Node at position 3
    //Node is created
    Node temp = new Node(value);
    Node p = start;//just for iteration
    int count = 1;
    while(p != null){
      p = p.next;
      count++;
      if(count == pos)
        break;
    }

    temp.next = p.next;
    p.next = temp;
  }

  public void insertAfterANode(int value, int nodeValue){
    Node child = new Node(value);//child node
    Node temp = start;
    while(temp!=null){
      if(temp.info == nodeValue)
        break;
      temp = temp.next;
    }

    child.next = temp.next;
    temp.next = child;

  }


}
