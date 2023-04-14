package com.streams;

import java.util.List;

public class Employee {
	
	private int id;
	private String name;
	private int salary;
	private List<String> addresses;
	
	
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	public Employee(int id, String name, int salary, List<String> addresses) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", addresses=" + addresses + "]";
	}

	public List<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	
	
	
	
}
