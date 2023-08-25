package com.karthik.demo.problems.tesco.rules;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Rule {
    private String ruleName;
    private String category;
    private Integer categoryQty;

}
