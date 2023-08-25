package com.ba.boost.day64and65.swingdependencyinversionreflection2;

public class DbLog implements ILog {

	@Override
	public String writeLogOutput(String value) {
		
		return "DbLog log has saved error: " + value;
	}

}
