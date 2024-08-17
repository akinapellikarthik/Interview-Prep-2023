package com.karthik.demo.datastructures.singlelinkedlist;

public class SingleLinkedList {
  private SingleLinkedListNode head;
  // need to check on tail
  // private SingleLinkedListNode tail;
  private int size;

  SingleLinkedList() {
    this.head = null;
  }

  public void insert(Integer element) {
    SingleLinkedListNode node = new SingleLinkedListNode(element, null);

    if (head == null) {
      this.head = node;
    } else {
      SingleLinkedListNode tempNode = head;
      while (tempNode.getNextNode() != null) {
        tempNode = tempNode.getNextNode();
      }
      tempNode.setNextNode(node);
    }
  }

  public void insertAtLocation(int index, int element) {
    if (head == null) {
      System.out.println("Single linked list doesn't exist...");
    } else {
      SingleLinkedListNode currentNode = head;
      int counter = 0;
      while (currentNode != null) {
        if (counter == index - 1) {
          SingleLinkedListNode node = new SingleLinkedListNode(element, null);
          SingleLinkedListNode nextNode = currentNode.getNextNode();
          node.setNextNode(nextNode);
          currentNode.setNextNode(node);
          return;
        }

        counter++;
        currentNode = currentNode.getNextNode();
      }
    }
  }

  public void displayList() {
    System.out.println("Printing the single linked list::");
    if (head == null) {
      System.out.println("List is empty");
    } else {
      SingleLinkedListNode tempNode = head;
      while (tempNode != null) {
        System.out.print(tempNode.getData() + "->");
        tempNode = tempNode.getNextNode();
      }
      System.out.println("null");
    }
  }

  public void update(int index, int element) {

    if (head == null) {
      System.out.println("Single LinkedList is empty...");
    } else {
      int counter = 0;
      SingleLinkedListNode tempNode = head;
      // Here I have index and element, so iterate till the count reaches and then update the value
      while (tempNode != null) {
        if (counter == index) {
          // means I am at the index and node
          tempNode.setData(element);
          System.out.println("Node at index " + index + " updated with data " + element);
          return;
        }
        tempNode = tempNode.getNextNode();
        counter++;
      }
      System.out.println("Index out of bound exception");
    }
  }

  public void delete(int index) {
    if (head == null) {
      System.out.println("SingleLinked List is empty");
    } else {
      SingleLinkedListNode currentNode = head;
      int counter = 0;
      while (currentNode != null) {
        if (counter == index - 1) {
          if (currentNode.getNextNode() == null) {
            System.out.println("Index out of bounds exception");
            return;
          }
          currentNode.setNextNode(currentNode.getNextNode().getNextNode());
          System.out.println("Node at index:" + index + " has been deleted successfully");
          return;
        }
        counter++;
        currentNode = currentNode.getNextNode();
      }
    }
  }
}
