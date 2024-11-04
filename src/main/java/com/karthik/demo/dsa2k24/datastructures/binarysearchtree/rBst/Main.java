package com.karthik.demo.dsa2k24.datastructures.binarysearchtree.rBst;

public class Main {
  public static void main(String[] args) {
    RecursiveBinarySearchTree rBST = new RecursiveBinarySearchTree();

    rBST.rInsert(47);
    rBST.rInsert(21);
    rBST.rInsert(76);
    rBST.rInsert(18);
    rBST.rInsert(27);
    rBST.rInsert(52);
    rBST.rInsert(82);

    //  2
    // 1 3
    //     4
    //      5

    System.out.println(rBST.root.value);
    System.out.println(rBST.root.left.value);
    System.out.println(rBST.root.right.value);

    System.out.println(rBST.rContains(1));
    System.out.println(rBST.rContains(2));
    System.out.println(rBST.rContains(3));
    // System.out.println(rBST.rContains(4));
    // System.out.println(rBST.rContains(5));

    rBST.inOrderTraversal(rBST.root);

    // System.out.println(rBST.minValue(rBST.root.right.left));

    // System.out.println(rBST.BFS());
    System.out.println(rBST.DFSPreOrderTraversal());
    System.out.println(rBST.DFSPostOrderTraversal());
    System.out.println(rBST.DFSInOrderTraversal());
  }
}
