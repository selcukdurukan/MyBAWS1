package com.ba.boost.atclass.desingpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable{
	
	private List<String> employeeList;
	
	

	public Employee() {
		employeeList = new ArrayList<String>();
	}

	public Employee(List<String> employeeList) {
		this.employeeList = employeeList;
	}
	
	public void loadData() {
		employeeList.add("Cagri");
		employeeList.add("Babur");
		employeeList.add("Mustafa");
		employeeList.add("Muhammed");
	}

	public List<String> getEmployeeList() {
		return employeeList;
	}

	@Override
	protected Employee clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<>();
		for (String string : this.employeeList) {
			temp.add(string);
		}
		return new Employee(temp);
	}
	
	
	

}
