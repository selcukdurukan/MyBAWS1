package com.ba.boost.atclass.desingpattern.prototype2;

public class EmployeeRecord  implements Prototype{
	
	private int id;
	private String name;
	private double salary;
	private String address;
	
	public EmployeeRecord() {
		
	}
	
	
	public EmployeeRecord(int id, String name, double salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}


	
	public void showRecord() {
		System.out.println("EmployeeRecord [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]");
	}


	@Override
	public Prototype getClone() {
		return new EmployeeRecord(id,name,salary, address);
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


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}



	
	
	


	
	
	
}

