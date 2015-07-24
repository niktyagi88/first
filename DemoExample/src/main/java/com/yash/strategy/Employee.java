package com.yash.strategy;

public class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	private String empId;
	
	
	
	Employee(int id,String name)
	{
		this.id = id;
		this.name = name;
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
	
	@Override
	public int compareTo(Employee emp) {

		return (this.id == emp.id) ? this.name.compareTo(emp.getName()) : (this.id > emp.id) ? 1 : -1;

		
	}
	
	
}
