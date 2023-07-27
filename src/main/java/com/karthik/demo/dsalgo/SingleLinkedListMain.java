package com.karthik.demo.dsalgo;

public class SingleLinkedListMain {

  public static void main(String[] args) {
    SingleLinkedList singleLinkedList = new SingleLinkedList();
    singleLinkedList.addElement(1);
    singleLinkedList.addElement(2);
    singleLinkedList.addElement(3);
    singleLinkedList.addElement(4);
    singleLinkedList.countNodes();
    singleLinkedList.addElement(5);

    singleLinkedList.printList();
    singleLinkedList.countNodes();

    singleLinkedList.insertNodeAtBeginningOfList(10);
    singleLinkedList.printList();
    singleLinkedList.insertNodeAtEndOfList(50);
    singleLinkedList.printList();
    singleLinkedList.countNodes();

    singleLinkedList.insertAtAGivenPosition(100, 3);
    singleLinkedList.printList();

    singleLinkedList.insertAfterANode(101, 100);
    singleLinkedList.printList();



  }

}
