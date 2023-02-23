package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Employee;
import com.example.demo.Repositories.EmployeeRepo;

@Service
public class ApiService {
	@Autowired
	private EmployeeRepo det;
	
	public Employee saveDetails(Employee s) {
		return det.save(s);
	}
	public List<Employee>getAllDetails(){
		return det.findAll();
	}
	public void deleteDepartmentById(int id) {
		det.deleteById(id);
	}
}
