package com.example.demo.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
	@Table(name="Employee")
	public class Employee{
		@Id
		@Column(name="ID")
		@GeneratedValue
		private int id;
		
		@Column(name="employeeName")
		private String name;
		
		@Column(name="EmployeeAge")
		private int age;
		
		@Column(name="Salary")
		private long salary;
		
		public Employee() {}
			Employee(int id,String name,int age,long salary){
			super();
			this.id=id;
			this.name=name;
			this.age=age;
			this.salary=salary;
		}
		
		public int getId() {
	        return id;
	    }
	    public void setId(int id) {
	        this.id = id;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public int getAge() {
	        return age;
	    }
	    public void setAge(int age) {
	        this.age = age;
	    }
	    public long getSalary() {
	    	return salary;
	    }
	    public void setSalary(long salary) {
	    	this.salary=salary;
	    }
	
}
