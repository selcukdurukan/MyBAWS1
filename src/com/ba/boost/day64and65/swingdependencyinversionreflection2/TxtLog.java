package com.ba.boost.day64and65.swingdependencyinversionreflection2;

public class TxtLog implements ILog {

	@Override
	public String writeLogOutput(String value) {
		
		return "TXT log has saved error: " + value;
	}

}
