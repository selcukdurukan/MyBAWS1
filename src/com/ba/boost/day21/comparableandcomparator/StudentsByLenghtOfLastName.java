package com.ba.boost.day21.comparableandcomparator;

import java.util.Comparator;

public class StudentsByLenghtOfLastName implements Comparator<Student>{

	@Override //Dogal sıralama dışında için Comparator interfacenin yöntemi
	public int compare(Student first, Student second) {
		int lenthOfFirst = first.getLastName().length();
		int lenthOfSecond = second.getLastName().length();
		return Integer.compare(lenthOfFirst, lenthOfSecond);
	}

}
