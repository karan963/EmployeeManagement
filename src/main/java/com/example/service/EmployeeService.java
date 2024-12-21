package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo repo;
	
	public List<Employee> getAllEmployees(){
		return repo.findAll();
	}
	
	public Employee addEmployee(Employee employee){
        return repo.save(employee);
    }

	public Employee getEmployeeById(int id) {
		return repo.findById(id).get();
	}

	public void deleteEmployeeById(int id) {
		Employee employee = repo.findById(id).get();
		repo.delete(employee);
	}
}
