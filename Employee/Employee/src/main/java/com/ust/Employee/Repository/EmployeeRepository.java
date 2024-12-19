package com.ust.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.Employee.Entity.EmployeeInfo;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeInfo, Integer>{
    
}
