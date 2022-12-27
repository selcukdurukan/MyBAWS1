package com.ba.boost.day52.oop2;

public class OopTest {

	public static void main(String[] args) {
		
		Director d = new Director();
		Engineer e = new Engineer();
		Staff s = new Staff();
		
		System.out.println("Total salary: " + (d.getSalary()+ e.getSalary() + s.getSalary()));
		

	}

}
