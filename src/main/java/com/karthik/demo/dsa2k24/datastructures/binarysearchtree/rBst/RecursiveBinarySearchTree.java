package com.karthik.demo.dsa2k24.datastructures.binarysearchtree.rBst;

public class RecursiveBinarySearchTree {


    Node root;

    private Node rInsert(Node currentNode, int value) {

        if (currentNode == null) {
            return new Node(value);
        }
        if (value < currentNode.value) {
            currentNode.left = rInsert(currentNode.left, value);
        } else {
            currentNode.right = rInsert(currentNode.right, value);
        }

        return currentNode;


    }

    public void rInsert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }
        rInsert(root, value);
    }

    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

}
