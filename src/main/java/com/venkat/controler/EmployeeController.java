package com.venkat.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.venkat.model.Employee;
import com.venkat.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/save")
	private void save(@RequestBody Employee emp) {
		service.save(emp);
	}

	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable(value = "id") Integer id) {
		Optional<Employee> empoyee = service.getEmployee(id);
		if (empoyee.isPresent()) {
			return empoyee.get();
		} else
			return new Employee();
	}

	@GetMapping("employee/all")
	public List<Employee> getallEmployee() {
		List<Employee> empoyee = service.getAllEmployee();
		return empoyee;
	}

	@DeleteMapping("employee/delete/{id}")
	public void deleteEmployee(@PathVariable(value = "id") Integer id) {
		service.delete(id);
	}
}
