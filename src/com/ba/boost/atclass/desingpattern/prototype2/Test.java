package com.ba.boost.atclass.desingpattern.prototype2;

public class Test {

	public static void main(String[] args) {
		
		EmployeeRecord emp = new EmployeeRecord(1, "Cagri", 300, "Istanbul");
		
		emp.showRecord();
		EmployeeRecord emp2 = (EmployeeRecord) emp.getClone();
		emp2.showRecord();
		emp2.setName("Ahmet");
		emp2.showRecord();
	}

}
