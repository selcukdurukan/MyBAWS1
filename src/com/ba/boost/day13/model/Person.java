package com.ba.boost.day13.model;

public class Person {

	public String firstName; // umuma acık.
	String lastName;  // default veya paket görünürlük.
	private int age;  // özel. 
	private String password;
	private boolean woman; 
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		p1.firstName = "Ali";
		p1.lastName = "Veli";
		p1.age = 15;
	}
	
	public void initialPassword(String initialPassword) {
		
		this.password = initialPassword;
	}
	
	public boolean setPassword (String oldPassword, String password) {
		if (this.isPasswordCorrect(oldPassword)) {
			this.password = password;
			return true;
		}
		return false;
	}
	
	public boolean isPasswordCorrect (String password) {
		return password.equals(this.password);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isWoman() {
		return woman;
	}

	public void setWoman(boolean woman) {
		this.woman = woman;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", password=" + password + ", woman=" + woman + "]";
	}
}
