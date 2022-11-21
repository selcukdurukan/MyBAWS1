package com.ba.boost.day21.sets.treesets;

import java.util.Comparator;

public class OrderStudentByName implements Comparator<Student>{

	@Override
	public int compare(Student st1, Student st2) {
//		return st2.getName().compareToIgnoreCase(st1.getName());  	//Isme göre sıralar
		return st2.getGrade()-st1.getGrade();    					//Notlara göre sıralar
	}

}
