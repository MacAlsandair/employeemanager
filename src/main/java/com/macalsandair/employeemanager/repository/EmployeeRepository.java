package com.macalsandair.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.macalsandair.employeemanager.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
