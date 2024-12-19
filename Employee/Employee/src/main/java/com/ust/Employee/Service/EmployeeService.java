package com.ust.Employee.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.Employee.Entity.EmployeeInfo;
import com.ust.Employee.Repository.EmployeeRepository;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;


    public EmployeeInfo addEmployee( EmployeeInfo emp){
        return employeeRepository.save(emp);
    }
    
    public List<EmployeeInfo> getAllEmployee(){
        return employeeRepository.findAll();
    }


}
