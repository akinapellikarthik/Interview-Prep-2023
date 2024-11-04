package com.karthik.demo.dsa2k24.datastructures.binarysearchtree.rBst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

  // recursive call
  public void inOrderTraversal(Node root) {
    if (root == null) return;
    inOrderTraversal(root.left);
    System.out.println(root.value);
    inOrderTraversal(root.right);
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
    if (currentNode == null) return false;
    if (currentNode.value == value) return true;
    if (value < currentNode.value) {
      return rContains(currentNode.left, value);
    } else {
      return rContains(currentNode.right, value);
    }
  }

  public int minValue(Node currentNode) {
    while (currentNode.left != null) {
      currentNode = currentNode.left;
    }
    return currentNode.value;
  }

  public List<Integer> BFS() {
    List<Integer> results = new ArrayList<>();
    Queue<Node> queue = new LinkedList<>();
    Node currentNode = root;
    queue.add(currentNode);
    while (!queue.isEmpty()) {
      currentNode = queue.remove();
      results.add(currentNode.value);
      if (currentNode.left != null) {
        queue.add(currentNode.left);
      }
      if (currentNode.right != null) {
        queue.add(currentNode.right);
      }
    }
    return results;
  }

  public List<Integer> DFSPreOrderTraversal() {
    List<Integer> results = new ArrayList<>();

    class Traverse {
      Traverse(Node currentNode) {
        results.add(currentNode.value);
        if (currentNode.left != null) new Traverse(currentNode.left);
        if (currentNode.right != null) new Traverse(currentNode.right);
      }
    }

    new Traverse(root);

    return results;
  }

  public List<Integer> DFSPostOrderTraversal() {
    List<Integer> results = new ArrayList<>();

    class Traverse {
      Traverse(Node currentNode) {
        if (currentNode.left != null) new Traverse(currentNode.left);

        if (currentNode.right != null) new Traverse(currentNode.right);

        results.add(currentNode.value);
      }
    }

    new Traverse(root);

    return results;
  }

  public List<Integer> DFSInOrderTraversal() {
    List<Integer> results = new ArrayList<>();

    class Traverse {
      Traverse(Node currentNode) {
        if (currentNode.left != null) new Traverse(currentNode.left);

        results.add(currentNode.value);
        if (currentNode.right != null) {
          new Traverse(currentNode.right);
        }
      }
    }

    new Traverse(root);

    return results;
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
