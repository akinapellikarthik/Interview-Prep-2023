package com.karthik.demo.dsa2k24.datastructures.graphs.adjmatrix;

public class Main {

  public static void main(String[] args) {
    Graph graph = new Graph(5);
    graph.addNode(new Graph.Node("A"));
    graph.addNode(new Graph.Node("B"));
    graph.addNode(new Graph.Node("C"));
    graph.addNode(new Graph.Node("D"));
    graph.addNode(new Graph.Node("E"));

    graph.addEdge(0, 1); // A->B
    graph.addEdge(1, 2); // B->C
    graph.printGraph();
  }
}
