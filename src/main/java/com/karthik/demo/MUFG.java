package com.karthik.demo;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

@Data
@Builder
@ToString
@EqualsAndHashCode
class Employee{
    private Department department;
    private String empName;
    private Double salary;
}

@Builder
@ToString
@EqualsAndHashCode
class Department{
    private String departmentName;
}
//A
//B
public class MUFG {

    public static void main(String[] args) {
        List<Employee> employeeList = List.of(Employee.builder().department(Department.builder().departmentName("d1").build()).empName("a").build(),
                Employee.builder().department(Department.builder().departmentName("d1").build()).empName("b").build());

        Map<Department, List<Employee>> departmentListMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(departmentListMap);
    }
}
