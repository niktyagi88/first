package com.yash.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(1,"Ankit"));
		list.add(new Employee(7,"Nikhil"));
		list.add(new Employee(15,"John"));
		list.add(new Employee(5,"Rithik"));
		list.add(new Employee(7,"Niz"));
		list.add(new Employee(1,"Aa"));
		list.add(new Employee(3,"Santosh"));
		
		
		Collections.sort(list);
		
		for (Employee employee : list) {
			System.out.println("ID ::" +employee.getId()+ " , NAME :: " +employee.getName());
		}
		
		
	}
	
}
