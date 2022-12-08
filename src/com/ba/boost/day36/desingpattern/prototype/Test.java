package com.ba.boost.day36.desingpattern.prototype;

import java.util.List;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee employee = new Employee();

		employee.loadData();
		Employee employeeClone = employee.clone();
		List<String> newList = employeeClone.getEmployeeList();
		newList.add("Zafer");

		System.out.println(employee.getEmployeeList());
		System.out.println(newList);

	}

}
