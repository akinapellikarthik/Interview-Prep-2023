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

    public boolean rContains(int value) {
        return rContains(root, value);
    }

    private boolean rContains(Node currentNode, int value) {
        if (currentNode == null)
            return false;
        if (currentNode.value == value)
            return true;
        if (value < currentNode.value) {
            return rContains(currentNode.left, value);
        } else {
            return rContains(currentNode.right, value);
        }
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
