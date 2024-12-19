package com.ust.Employee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.Employee.Entity.EmployeeInfo;
import com.ust.Employee.Service.EmployeeService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/emp")

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public EmployeeInfo addEmployee(@RequestBody EmployeeInfo emp){
        return employeeService.addEmployee(emp);
    }
    
    @GetMapping("/get")
    public List<EmployeeInfo> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
}
