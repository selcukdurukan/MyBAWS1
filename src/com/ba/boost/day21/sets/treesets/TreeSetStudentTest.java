package com.ba.boost.day21.sets.treesets;

import java.util.TreeSet;

public class TreeSetStudentTest {

	public static void main(String[] args) {
		
		TreeSet<Student> students = new TreeSet<>(new OrderStudentByName());  //Treesete nasıl sorting yapacagını söylemezsen hata verir.

		Student st = new Student(101, "Mustafa", 85);
		Student st1 = new Student(101, "Cagri", 85);
		students.add(st);
		students.add(st1);
		students.add(new Student(103, "Burcu", 42));
		students.add(new Student(110, "Babur", 100));
		
		for (Student i : students) {
			System.out.println(i);
		}
		
		
		
		
		
	}

}
