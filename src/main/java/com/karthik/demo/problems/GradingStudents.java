package com.karthik.demo.problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {

  public static void main(String[] args) {

    List<Integer> inputList = Arrays.asList(73,67,38, 33);

    var collect = inputList.parallelStream().map(marks -> {
      if(marks >= 38) {
        int newGrade = ((marks / 5 + 1) * 5);
        if (newGrade - marks < 3)
          return newGrade;
        else
          return marks;
      }
      else
        return marks;
    }).collect(Collectors.toList());
    System.out.println(collect);

    //int marks = 67;

  }

}
