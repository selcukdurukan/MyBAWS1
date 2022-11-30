package com.ba.boost.day27.dependencyinversion2;

public class SQLRepository implements IRepository {

	@Override
	public String save() {
		
		return "Save with SQL";
	}

}
