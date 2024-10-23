package com.karthik.demo;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** Table - Employee - eid - joiningDate - DD/MM/YYYY - */
// work anniversary in the current month - List<Employee>

// @Entity
//
@Builder
@Data
class Employee1 {
  private String eid;
  private Date joiningDate;
  private int age;
}

/*@Repository
interface EmployeeRespository extends JpaRepository<Employee1, String>{

}*/

@Service
class EmployeeService {
  // @Autowired
  // private EmployeeRespository employeeRespository;

  Optional<List<Employee>> fetchEmployees() {
    // Page
    return Optional.ofNullable(null);
  }
}

@RestController
@RequestMapping("/v1/api")
class EmployeeController {

  @Autowired private EmployeeService employeeService;

  @GetMapping("/employees")
  public ResponseEntity<List<Employee>> fetchEmployeesAnniversaryInCurrentMonth() {

    Optional<List<Employee>> employees = employeeService.fetchEmployees();
    if (employees.isPresent()) {
      return ResponseEntity.ok(employees.get());
    } else {
      // return ResponseEntity.ok(null, HttpStatus.NO_CONTENT);
    }

    return null;
  }
}

public class JPMCMain {

  public static void main(String[] args) {
    System.out.println("Hello");
    // Map<Integer, List<Employee1>> cate
    List<Employee1> allEmployees =
        List.of(
            Employee1.builder().age(25).eid("345").build(),
            Employee1.builder().age(35).build(),
            Employee1.builder().age(25).eid("123").build(),
            Employee1.builder().age(45).build(),
            Employee1.builder().age(26).build(),
            Employee1.builder().age(36).build());

    // feature/

    for (Employee1 e : allEmployees) {}

    Map<Integer, List<Employee1>> transformedMap =
        allEmployees.stream().collect(Collectors.groupingBy(Employee1::getAge));
    // transformedMap.get()
    System.out.println(transformedMap);
  }
}
