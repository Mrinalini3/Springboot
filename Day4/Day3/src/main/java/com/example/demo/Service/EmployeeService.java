package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Employee;
import com.example.demo.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired   
	private EmployeeRepository empRepo;
	
	//TO POST - INSERT
	public Employee saveEmployee(Employee employee) {
		return empRepo.saveAndFlush(employee);
	}
	
	
	
	
	//TO GET - READ
	public List<Employee> getAllEmployees(){
		return empRepo.findAll();
	}
	
	public Employee getEmployeeById(int id){
		return empRepo.findById(id).orElse(null);
	}

//	public Employee updateEmployeeById(int id, Employee employee) {
//		Employee existingEmployee = empRepo.findById(id).orElse(null);
//		existingEmployee.setName(employee.getName());
//		existingEmployee.setAge(employee.getAge());
//		existingEmployee.setSalary(employee.getSalary());
//        return empRepo.saveAndFlush(existingEmployee);
//    }
	
	public Employee updateEmployee(Employee e) {
		return empRepo.saveAndFlush(e);
	}
	

    public boolean deleteEmployeeById(int id) {
        try {
            empRepo.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}

