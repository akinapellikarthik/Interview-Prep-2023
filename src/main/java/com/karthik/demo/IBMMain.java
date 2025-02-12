package com.karthik.demo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
class BinaryTree {
  Node root;
  Node left;
  Node right;
}

@AllArgsConstructor
@NoArgsConstructor
@ToString
class Node {
  Integer val;
  Node left;
  Node right;

  public Node(int i, Node left, Node right) {
    val = i;
    this.left = left;
    this.right = right;
  }
}

public class IBMMain {

  public static void main(String[] args) {
    // Mirror replica
    // 1
    // 2 3
    // 4 5 6 7
    Node node1 = new Node(1, null, null);
    Node node2 = new Node(2, null, null);
    Node node3 = new Node(3, null, null);
    Node node4 = new Node(4, null, null);
    Node node5 = new Node(5, null, null);
    Node node6 = new Node(6, null, null);
    Node node7 = new Node(7, null, null);
    BinaryTree binaryTree1 = new BinaryTree();
    BinaryTree binaryTree2 = new BinaryTree();
    binaryTree1.root = node1;
    binaryTree1.root.left = node2;
    binaryTree1.root.right = node3;
    binaryTree1.root.left.left = node4;
    binaryTree1.root.left.right = node5;
    binaryTree1.root.left.right.left = node6;
    binaryTree1.root.left.left.right = node7;
    System.out.println(binaryTree1);

    // 1
    // 3 2
    // 7 6 5 4

    // Level order -> traversal
    // b1 tree with left to right traversal
    // b2 tree with right to left traversal
    // compare the elements

    // take a temp Node
    Node temp1 = binaryTree1.root;
    Node temp2 = binaryTree2.root;

    // traverse and compare
    // level order traversal
    check(temp1, temp2);
    check(temp1.left, temp2.right);
    check(temp1.right, temp2.left);
  }

  static void check(Node temp1, Node temp2) {
    while (temp1 != null && temp2 != null) {
      if (temp1.val.intValue() != temp2.val.intValue()) {
        System.out.println("Trees are not mirror replica!!!!");
        break;
      }
      temp1 = temp1.left;
      temp2 = temp2.right;
    }
  }
}
