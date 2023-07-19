package com.karthik.demo.problems;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllValidParenthesis {

  public static void main(String[] args) {
    var strings = generateAllValidParenthesis(3);
    System.out.println(strings);
  }

  public static List<String> generateAllValidParenthesis(int n) {
    List<String> result = new ArrayList<>();
    generateAllValidParenthesis("(",1,0,n, result);
    return result;
  }

  public static void generateAllValidParenthesis(String s, int open, int close, int n, List<String> result) {
    if(s.length() == 2 * n){
      result.add(s);
      return ;
    }

    if(open < n)
      generateAllValidParenthesis(s+"(", open+1, close, n, result);
    if(close < open)
      generateAllValidParenthesis(s+")", open, close+1, n, result);

  }

}
