package com.karthik.demo.unnamedpkg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import org.junit.jupiter.api.Test;

class JPMCMainTest {

  @Test
  void testCharPrinterFunctionality() {
    List<String> list = List.of("alphX", "betY", "gymmZ", "eatA");

    var transformedStrings = JPMCMain.charPrinter(list);

    assertNotNull(transformedStrings);
    assertEquals(4, transformedStrings.size());
    assertEquals("a:X", transformedStrings.get(0));
  }
}

/**
 * Employee -> Table id, empName
 *
 * <p>EmployeeSalary id, employeeId, salary
 *
 * <p>Not All have salary - no record in EmployeeSalary
 *
 * <p>EmployeeId, EmployeeName, Salary
 *
 * <p>select e.id, e.empName, es.salary from Employee e left join EmployeeSalary es on e.id =
 * es.employeeId
 */

// System ->
