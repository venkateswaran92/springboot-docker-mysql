package com.venkat.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venkat.model.Employee;

public interface EmployeeRepositry extends JpaRepository<Employee, Integer> {

}
