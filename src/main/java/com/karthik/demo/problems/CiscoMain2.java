package com.karthik.demo.problems;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/** A B +3 D E F G */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Node {

  String s;
  Node left;
  Node right;

  @Override
  public String toString() {
    return this.s;
  }
}

class Tree {}

public class CiscoMain2 {

  public static void main(String[] args) {
    System.out.println("Hello");

    Node root = new Node();
    Node B = new Node();
    Node C = new Node();
    Node D = new Node();
    Node E = new Node();

    D.s = "D";
    E.s = "E";

    C.s = "C";

    B.s = "B";
    B.left = D;
    B.right = E;
    root.s = "A";
    root.left = B;
    root.right = C;

    Node temp = root;
    while (temp != null) {
      System.out.println(temp.left);
      System.out.println(temp.right);
      temp = temp.left;
    }
  }
}
