package com.ba.boost.day21.HWdailymeal;

import java.util.Comparator;

public class MealByReserveAlp implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}

}
