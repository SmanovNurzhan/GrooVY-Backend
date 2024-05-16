package GrooVY.group.groovy.controller;

import GrooVY.group.groovy.Entity.Reservation;
import GrooVY.group.groovy.Entity.newEmployee;
import GrooVY.group.groovy.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empl")
@AllArgsConstructor
@CrossOrigin
public class EmployeeController {
    private EmployeeService employeeService;
    @PostMapping("/addEmployee")
    public ResponseEntity<?> add(@RequestBody newEmployee emp){
        employeeService.saveEmployee(emp);
        return ResponseEntity.ok(emp);
    }
}
