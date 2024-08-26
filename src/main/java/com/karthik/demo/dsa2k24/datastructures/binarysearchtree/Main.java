package com.karthik.demo.dsa2k24.datastructures.binarysearchtree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(20);
        bst.insert(30);
        bst.insert(11);
        bst.insert(21);
        bst.insert(31);
        System.out.println(bst.root.right.right.right.value);
    }
}
