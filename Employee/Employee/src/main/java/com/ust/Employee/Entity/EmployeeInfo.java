package com.ust.Employee.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@Table(name="Employee_db")
@NoArgsConstructor

public class EmployeeInfo {
    @Id
    public int id;
    public String Name;
    public String Address;
    public Long MobileNumber;
}
