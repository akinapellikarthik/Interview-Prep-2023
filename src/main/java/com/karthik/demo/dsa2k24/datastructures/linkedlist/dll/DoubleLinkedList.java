package com.karthik.demo.dsa2k24.datastructures.linkedlist.dll;

public class DoubleLinkedList {

    private Node head;
    private Node tail;

    private int length;

    class Node {
        int value;
        Node next;
        Node prev;


        Node(int value) {
            this.value = value;
        }
    }

    public DoubleLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void getLength() {
        System.out.println("Length is "+this.length);
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: "+head.value);
    }

    public void getTail() {
        System.out.println("Head: "+tail.value);
    }


}
