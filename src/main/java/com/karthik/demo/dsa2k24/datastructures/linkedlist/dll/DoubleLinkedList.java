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
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("X");
    }

    public void getHead() {
        System.out.println("Head: "+head.value);
    }

    public void getTail() {
        System.out.println("Head: "+tail.value);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if(length == 0){
            return null;
        } else if (length == 1) {
            length = 0;
            Node temp = head;
            head = tail = null;
            return temp;
        } else {
            Node temp = tail;
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
            length--;
            return temp;
        }
    }


}
