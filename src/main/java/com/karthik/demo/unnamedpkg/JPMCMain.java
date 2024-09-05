package com.karthik.demo.unnamedpkg;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class JPMCMain {

  class Employee {
    private Integer employeeId;
    private String employeeName;

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Employee employee = (Employee) o;
      return Objects.equals(employeeId, employee.employeeId)
          && Objects.equals(employeeName, employee.employeeName);
    }

    @Override
    public int hashCode() {
      return Objects.hash(employeeId, employeeName);
    }
  }

  public static void main(String[] args) {
    Map<Employee, Boolean> hashMap = new HashMap<>();

    List<String> list = List.of("alphX", "betY", "gymmZ", "eatA");
    charPrinter(list);
  }

  public static List<String> charPrinter(List<String> list) {

    return list.parallelStream()
        .map(item -> (item.charAt(0) + ":" + item.charAt(item.length() - 1)))
        .toList();
  }
}
