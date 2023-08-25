package com.karthik.demo.problems;

import java.util.List;

//https://www.hackerrank.com/challenges/angry-professor/problem?isFullScreen=true
public class AngryProfessor {

  public static void main(String[] args) {
    AngryProfessor.angryProfessor(3, List.of(-1, -3, 4, 2));
  }

  public static String angryProfessor(int k, List<Integer> a) {
    return a.stream().filter(time ->time <=0).count() >=k ? "NO": "YES";
  }

}
