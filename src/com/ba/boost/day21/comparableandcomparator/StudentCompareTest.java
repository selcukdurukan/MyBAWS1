package com.ba.boost.day21.comparableandcomparator;

import java.util.Arrays;
import java.util.Comparator;

public class StudentCompareTest {

	public static void main(String[] args) {

		Student s1 = new Student(123456, "Babur", "Somer");
		Student s2 = new Student(345678, "Ali", "Veli");
//		Student comparator = new Student();
//		
//		System.out.println(s1.compareTo(s2));;
//		System.out.println(comparator.compare(s2, s2));

		Student[] students = { s1, s2, new Student(86769808, "Ersan", "Kuneri"),
				new Student(92898797, "Zeynep", "Fatma") };

		Arrays.sort(students, new StudentsByFirstName());
		System.out.println("First name'e gore siralama: " + Arrays.toString(students));
		System.out.println();

		Arrays.sort(students, new StudentsByFullName(true));
		System.out.println("Tam isme gore buyuyen sekilde siralama: " + Arrays.toString(students));
		System.out.println();

		Arrays.sort(students, new StudentsByFullName(false));
		System.out.println("Tam isme gore kuculen sekilde siralama: " + Arrays.toString(students));
		System.out.println();

		Arrays.sort(students, new StudentsByLenghtOfLastName());
		System.out.println("Son ismin uzunluguna gore siralama: " + Arrays.toString(students));
		System.out.println();

		Arrays.sort(students);
		System.out.println("Dogal siralama: " + Arrays.toString(students));

	}

}
