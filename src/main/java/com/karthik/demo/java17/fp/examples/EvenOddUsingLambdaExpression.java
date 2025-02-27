package com.karthik.demo.java17.fp.examples;

import java.util.Comparator;
import java.util.List;
import java.util.function.*;

@FunctionalInterface
interface StringReverse {
  String reverseStr(String s);
}

public class EvenOddUsingLambdaExpression {

  public boolean oddEven(int i) {
    Predicate<Integer> booleanPredicate = x -> x % 2 == 0;
    return booleanPredicate.test(i);
  }

  public int sum(int i, int j) {
    BiFunction<Integer, Integer, Integer> sumBiFunction = (Integer::sum);
    return sumBiFunction.apply(i, j);
  }

  // Implement a lambda expression that converts a list of strings to uppercase.
  public List<String> upperCaseConverter(List<String> items) {
    return items.parallelStream().map(String::toUpperCase).toList();
  }

  // Use a lambda expression to filter out all negative numbers from a list of integers.
  public List<Integer> filterNegativeNumbers(List<Integer> numberItems) {
    return numberItems.parallelStream().filter(i -> i > 0).toList();
  }

  // Given a list of integers, use streams to find the sum of all even numbers.
  public int sumEvenNumbers(List<Integer> items) {
    return items.parallelStream().filter(i -> i % 2 == 0).reduce(Integer::sum).orElse(0);
  }

  // Given a list of integers, use streams to find the sum of all even numbers.
  public int sumEvenNumbersNewImpl(List<Integer> items) {
    return items.parallelStream().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).sum();
  }

  // Convert a list of strings to a list of their lengths using streams.
  public List<Integer> strLengthConverter(List<String> items) {
    return items.parallelStream().map(String::length).toList();
  }

  // Find the first element in a list of numbers that is greater than 10 using streams.
  public int findFirstElement(List<Integer> items) {
    return items.stream().filter(i -> i > 10).findFirst().orElse(0);
  }

  // Sort a list of strings in descending order using streams.
  public List<String> sortStringsInDescendingOrder(List<String> items) {
    return items.stream().sorted(Comparator.reverseOrder()).toList();
  }

  // Count the number of words in a list that start with the letter "A" using streams.
  public long countWordsWithStartingChar(List<String> items, String startChar) {
    return items.parallelStream()
        .map(String::toLowerCase)
        .filter(i -> i.startsWith(startChar.toLowerCase()))
        .count();
  }

  // Use Function<T, R> to convert a list of integers to their square values.
  public List<Integer> square(List<Integer> items) {
    Function<List<Integer>, List<Integer>> squareFn =
        list -> list.stream().map(num -> num * num).toList();
    return squareFn.apply(items);
  }

  // Remove duplicate elements from a list using streams.
  public List<Integer> duplicateRemover(List<Integer> items) {
    return items.parallelStream().distinct().toList();
  }

  // Implement Predicate<T> to filter out strings shorter than 5 characters.
  public List<String> filterString(List<String> items, int charLen) {
    Predicate<String> predicate = i -> i.length() >= charLen;
    return items.parallelStream().filter(predicate).toList();
  }

  //Use Consumer<T> to print all elements of a list.
  public void printAllElements(List<String> items){
      Consumer<String> consolePrinter = System.out::println;
      items.parallelStream().forEachOrdered(consolePrinter);
  }

  //Implement Supplier<T> to generate a random number.
  public int randomNumberGenerator(){
      Supplier<Integer> randomNumberSupplier = () -> (int) (Math.random() * 100);
      return  randomNumberSupplier.get();
  }
  //Convert a list of strings to uppercase using method references.
  public static List<String> upperCaseConv(List<String> items)  {
      return items.parallelStream().map(String::toUpperCase).toList();
  }

  public static void main(String[] args) {
    int i = 10;
    EvenOddUsingLambdaExpression o = new EvenOddUsingLambdaExpression();
    System.out.println(o.oddEven(i));
    System.out.println(o.sum(10, 11));
    System.out.println(o.upperCaseConverter(List.of("apple", "ball", "cat")));
    System.out.println(o.strLengthConverter(List.of("cat", "ba", "a")));
    System.out.println(o.filterNegativeNumbers(List.of(-3, -2, -1, 1, 2, 3)));
    System.out.println(o.sumEvenNumbers(List.of(1, 2, 3, 4, 5, 6, 7, 8)));
    System.out.println(o.sumEvenNumbersNewImpl(List.of(1, 2, 3, 4, 5, 6, 7, 8)));
    System.out.println(o.findFirstElement(List.of(1, 2, 3, 4, 5, 6, 7, 8)));
    System.out.println(o.findFirstElement(List.of(19, 20)));
      List<String> fruits = List.of("banana", "apple", "cherry", "date");
      System.out.println(
        o.sortStringsInDescendingOrder(fruits));
    System.out.println(
        o.countWordsWithStartingChar(List.of("banana", "apple", "archery", "date"), "A"));
    System.out.println(o.duplicateRemover(List.of(1, 2, 3, 1, 2, 3)));
    StringReverse stringReverse = (s) -> new StringBuffer(s).reverse().toString();
    System.out.println(stringReverse.reverseStr("Hello World...."));
    System.out.println(o.square(List.of(1, 2, 3, 1, 2, 3)));
    System.out.println(o.filterString(fruits, 7));
    o.printAllElements(fruits);
    //Convert a list of strings to uppercase using method references.
    Function<List<String>, List<String>> upperCaseConv = EvenOddUsingLambdaExpression::upperCaseConv;
      System.out.println(upperCaseConv.apply(fruits));
  }
}
