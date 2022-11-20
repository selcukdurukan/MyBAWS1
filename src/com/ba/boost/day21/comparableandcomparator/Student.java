package com.ba.boost.day21.comparableandcomparator;

import java.util.Comparator;

public class Student implements Comparable<Student>, Comparator<Student>{
	
	private long registrationNumber;
	private String firstName;
	private String lastName;
	
	
	public Student() {
		super();
	}


	public Student(long registrationNumber, String firstName, String lastName) {
		super();
		this.registrationNumber = registrationNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	@Override  //Comparable interface'inin yöntemi. Doğal sıralama için kullanılır.
	public int compareTo(Student otherStudent) {
		if (this.registrationNumber == otherStudent.registrationNumber) {
			return 0;
		}else if (this.registrationNumber < otherStudent.registrationNumber) { //Kendim diğer nesneden eksi bir değer dönmeyelim
			return -1;
		}else {
			return 1;  // kendim diğer neseneden büyüksem artı bir deper dönmeliyim.
		}	
		
//		return Long.compare(this.registrationNumber, otherStudent.registrationNumber); //Otomatik olarak long karşılaştırma yöntemi kullanıyor.
	}
	
	@Override //Dogal sıralama dışında için Comparator interfacenin yöntemi
	public int compare(Student first, Student second) {
		String firstFullName = this.lastName + " " + this.firstName;
		String secondFullName = second.lastName + " " + second.firstName;
		return firstFullName.compareTo(secondFullName);
	}
	


	public long getRegistrationNumber() {
		return registrationNumber;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}
	
	


	@Override
	public String toString() {
		return "Student: " + registrationNumber + " - " + firstName + " " + lastName;
	}






	
		
	

}
