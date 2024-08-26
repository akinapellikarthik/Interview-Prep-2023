package com.karthik.demo.dsa2k24.datastructures.binarysearchtree;

public class BinarySearchTree {

    class Node {
        int value;
        Node left;
        Node right;
        public Node(int value) {
            this.value = value;
        }
    }

     Node root;

    public BinarySearchTree() {
        root = null;
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if(root == null){
            root = newNode;
            return true;
        }

        Node temp = root;
        while(true){
            if(temp.value == newNode.value){
                return false;
            }
            if(newNode.value < temp.value){
                if(temp.left == null){
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }else {
                if(temp.right == null){
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }

    }
}
