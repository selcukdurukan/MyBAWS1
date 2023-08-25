package com.ba.boost.day64and65.swingdependencyinversionreflection2;

public class XmlLog implements ILog {

	@Override
	public String writeLogOutput(String value) {
		
		return "XML log has saved error: " + value;

	}

}
