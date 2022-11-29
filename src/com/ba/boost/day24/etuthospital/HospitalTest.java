package com.ba.boost.day24.etuthospital;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HospitalTest {
	
	private static List<Person> personsList =  new ArrayList<>();

	public static void main(String[] args) {
		
		Nurse n1 = new Nurse("Ayse","Alkan", 10000);
		Nurse n2 = new Nurse("Fatma","Tunc", 10000);
		
		Doctor d1 = new Doctor("Mehmet", "Durukan", 10000);
		Doctor d2 = new Doctor("Atakan", "Can", 10000);
		
		Janitor j1 = new Janitor("Halit", "Durukan", 10000);
		Janitor j2 = new Janitor("Furkan", "Ozcan", 10000);
		
		Manager m1 = new Manager("Harun", "Yildiko", 10000);
		Manager m2 = new Manager("Murat", "Sayan", 10000);
		
		Patient p1 = new Patient("Osman", "Soylu");
		Patient p2 = new Patient("Muzaffer", "Soylu");
		
		HospitalTest.personsList.add(p2);
		HospitalTest.personsList.add(p1);
		HospitalTest.personsList.add(m1);
		HospitalTest.personsList.add(m2);
		HospitalTest.personsList.add(j1);
		HospitalTest.personsList.add(j2);
		HospitalTest.personsList.add(d1);
		HospitalTest.personsList.add(d2);
		HospitalTest.personsList.add(n1);
		HospitalTest.personsList.add(n2);
		
		
		m1.increaseSalary();
		HospitalTest.personsList.stream().forEach(s -> System.out.println(s));
		
		System.out.println();
		List<Person> managerLists = HospitalTest.personsList.stream().filter(s -> s.getJob().equals(Occupation.MANAGER)).collect(Collectors.toList());
		managerLists.stream().forEach(s -> System.out.println(s));
	
		
		
		

	}

}
