package com.ba.boost.day21.comparableandcomparator;

import java.util.Comparator;

public class StudentsByFullName implements Comparator<Student>{
	
	private boolean ascending;
	
	public StudentsByFullName(boolean ascending) {
		super();
		this.ascending = ascending;
	}

	@Override //Dogal sıralama dışında için Comparator interfacenin yöntemi
	public int compare(Student first, Student second) {
		String firstFullName = first.getFirstName() + " " + first.getLastName();
		String secondFullName = second.getFirstName() + " " + second.getLastName();
		
		if (this.ascending) {
			return firstFullName.compareTo(secondFullName);
		} else {
			return secondFullName.compareTo(firstFullName);
		}
	}
	
	

}
