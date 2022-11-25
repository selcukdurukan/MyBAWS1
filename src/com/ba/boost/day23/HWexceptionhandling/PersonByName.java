package com.ba.boost.day23.HWexceptionhandling;

import java.io.Serializable;
import java.util.Comparator;

public class PersonByName implements Comparator<Person>, Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = -4439702913144226172L;

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getName().compareToIgnoreCase(o2.getName());
	}

}
