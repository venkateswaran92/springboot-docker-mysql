package com.venkat.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venkat.model.Employee;
import com.venkat.repositry.EmployeeRepositry;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepositry service;

	public void save(Employee emp) {
		service.save(emp);
	}

	public List<Employee> getAllEmployee() {
		return service.findAll();
	}

	public Optional<Employee> getEmployee(Integer id) {
		return service.findById(id);
	}

	public void delete(Integer id) {
		service.deleteById(id);
	}

}
