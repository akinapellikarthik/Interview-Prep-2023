package com.karthik.demo.datastructures.singlelinkedlist;

public class SingleLinkedListDrivingClass {

  public static void main(String[] args) {
    SingleLinkedList sl = new SingleLinkedList();
    sl.insert(10);
    sl.insert(20);
    sl.insert(30);
    sl.insert(40);

    sl.displayList();

    sl.update(3, 80);

    sl.update(5, 80); // index out of bound will happen

    sl.displayList();

    sl.delete(2);
    sl.displayList();

    sl.insertAtLocation(1, 22);

    sl.displayList();
  }
}
