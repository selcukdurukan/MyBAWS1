package com.ba.boost.day21.comparableandcomparator;

import java.util.Comparator;

public class StudentsByFirstName implements Comparator<Student>{
	 
	
	@Override //Dogal sıralama dışında için Comparator interfacenin yöntemi
	public int compare(Student first, Student second) {
		return first.getFirstName().compareTo(second.getFirstName());
	}

}
