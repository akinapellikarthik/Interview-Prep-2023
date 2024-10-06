package com.karthik.demo.dsa2k24.datastructures.binarysearchtree.rBst;

public class Main {
    public static void main(String[] args) {
        RecursiveBinarySearchTree rBST = new RecursiveBinarySearchTree();


        rBST.rInsert(2);
        rBST.rInsert(1);
        rBST.rInsert(3);

        //  2
        // 1 3

        System.out.println(rBST.root.value);
        System.out.println(rBST.root.left.value);
        System.out.println(rBST.root.right.value);
    }
}
