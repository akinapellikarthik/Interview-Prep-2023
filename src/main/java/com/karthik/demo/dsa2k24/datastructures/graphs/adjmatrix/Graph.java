package com.karthik.demo.dsa2k24.datastructures.graphs.adjmatrix;


import java.util.ArrayList;
import java.util.List;

public class Graph {

    int[][] adjMatrix;
    List<Node> graph;

    Graph(int size){
        adjMatrix = new int[size][size];
        graph = new ArrayList<>();
    }

     static class Node  {

         String data;
         Node(String data){
             this.data = data;

         }

     }

     public void addNode(Node node){
        graph.add(node);
     }

     public void addEdge(int src, int dest){
        adjMatrix[src][dest] = 1;
     }

     public boolean checkEdge(int src, int dest){
        return adjMatrix[src][dest] == 1;
     }

     public void printGraph(){
         for (int i = 0; i < adjMatrix.length; i++) {
             for (int j = 0; j < adjMatrix[i].length; j++) {
                 System.out.print(adjMatrix[i][j]+" ");
             }
             System.out.println();
         }
     }

}
