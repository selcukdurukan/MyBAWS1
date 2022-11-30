package com.ba.boost.day27.dependencyinversion2;

public class NoSQLRepository implements IRepository {

	@Override
	public String save() {
		
		return "Save with NoSQL";
	}

}
