package com.karthik.demo.problems.tesco.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Item {
  private Integer productId;
  private String category;

  private Integer quantity;
}
