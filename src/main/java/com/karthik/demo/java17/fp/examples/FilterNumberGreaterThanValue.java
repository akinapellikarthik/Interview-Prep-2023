package com.karthik.demo.java17.fp.examples;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

class Person {
  private String name;
  private Integer age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public Person(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
  }
}

public class FilterNumberGreaterThanValue {
  public List<Integer> filterList(int value, List<Integer> items) {
    return items.stream().filter(i -> i > value).toList();
  }

  // Given a list of integers, use streams to find the maximum value.
  public int maxValue(List<Integer> input) {
    return input.stream()
        .max(Comparator.naturalOrder())
        .orElseThrow(() -> new IllegalArgumentException("List is empty"));
  }

  // Given a list of Person objects (with fields name and age), use streams to sort them by age in
  // ascending order.
  public List<Person> personSorter(List<Person> personList) {
    return personList.stream().sorted(Comparator.comparing(Person::getAge)).toList();
  }

  // Given a list of Person objects (with fields name and age), use streams to sort them by age in
  // descending order.
  public List<Person> personSorterDescending(List<Person> personList) {
    return personList.stream().sorted(Comparator.comparing(Person::getAge).reversed()).toList();
  }

  public static void main(String[] args) {
    List<Integer> input = IntStream.rangeClosed(1, 100).boxed().toList();
    FilterNumberGreaterThanValue o = new FilterNumberGreaterThanValue();
    List<Integer> filteredList = o.filterList(10, input);
    System.out.println(filteredList);
    System.out.println(o.maxValue(input));
    Person p1 = new Person("a", 100);
    Person p2 = new Person("b", 99);
    Person p3 = new Person("c", 98);
    Person p4 = new Person("d", 97);
    System.out.println(o.personSorter(List.of(p1, p2, p3, p4)));
  }
}
