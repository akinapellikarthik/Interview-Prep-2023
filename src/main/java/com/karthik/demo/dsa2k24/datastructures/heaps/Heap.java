package com.karthik.demo.dsa2k24.datastructures.heaps;

import java.util.ArrayList;
import java.util.List;

public class Heap {
  private List<Integer> heap;

  public Heap() {
    this.heap = new ArrayList<>();
  }

  // Copy of Heap
  public List<Integer> getHeap() {
    return new ArrayList<>(heap);
  }

  // helper methods to find leftChild, rightChild, parent indexes
  private int leftChild(int index) {
    return 2 * index + 1;
  }

  private int rightChild(int index) {
    return 2 * index + 2;
  }

  private int parent(int index) {
    return (index - 1) / 2;
  }

  // swap method
  private void swap(int index1, int index2) {
    int temp1 = heap.get(index1);
    heap.set(index1, heap.get(index2));
    heap.set(index2, temp1);
  }

  // insert method by using swap method
  public void insert(int value) {
    heap.add(value);
    int current = heap.size() - 1;
    while (current > 0 && heap.get(current) > heap.get(parent(current))) {
      swap(current, parent(current));
      current = parent(current);
    }
  }
}
