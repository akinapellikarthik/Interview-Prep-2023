package com.karthik.demo.dsa2k24.datastructures.graphs;

public class Main {
  public static void main(String[] args) {
    Graph graph = new Graph();
    graph.addVertex("A");
    graph.addVertex("B");
    graph.addVertex("C");
    graph.addVertex("D");
    graph.addVertex("E");
    graph.printGraph();

    graph.addEdge("A", "B");
    graph.addEdge("A", "C");
    graph.printGraph();

    graph.removeEdge("A", "B");
    graph.printGraph();
  }
}
