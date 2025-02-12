package com.karthik.demo.java17.record;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentRecordDemoMain {

  public static void main(String[] args) {
    StudentRecordDemo studentRecordDemo = new StudentRecordDemo("alex", 21, "A");
    System.out.println(studentRecordDemo);
    List<StudentRecordDemo> students =
        Arrays.asList(
            new StudentRecordDemo("alex", 21, "C"),
            new StudentRecordDemo("benty", 20, "D"),
            new StudentRecordDemo("Karthik", 25, "A"));

    // sort the list on grades
    List<StudentRecordDemo> sortedStudentRecords =
        students.stream().sorted(Comparator.comparing(StudentRecordDemo::grade)).toList();
    System.out.printf("sortedStudentRecords = %s\n", sortedStudentRecords);
  }
}
