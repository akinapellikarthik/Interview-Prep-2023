package com.karthik.demo.datastructures.singlelinkedlist;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SingleLinkedListNode {

  private Integer data;
  private SingleLinkedListNode nextNode;
}
