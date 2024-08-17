package com.karthik.demo.dsa2k24.datastructures.linkedlist.dll;

public class Main {

  public static void main(String[] args) {
    DoubleLinkedList dll = new DoubleLinkedList(10);
    dll.printList();
    dll.getHead();
    dll.getTail();
    dll.getLength();
    dll.append(11);
    dll.printList();
    System.out.println("Remove method execution");
    System.out.println(dll.removeLast().value);

    System.out.println(dll.removeLast().value);

    System.out.println(dll.removeLast());
    dll.prepend(100);
    dll.append(200);
    dll.printList();
    System.out.println(dll.removeFirst().value);
    System.out.println(dll.removeFirst().value);
    System.out.println(dll.removeFirst());
  }
}
