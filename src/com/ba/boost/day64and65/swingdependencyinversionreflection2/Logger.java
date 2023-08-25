package com.ba.boost.day64and65.swingdependencyinversionreflection2;

public class Logger {
	
	private ILog ilog;

	public Logger(ILog ilog) {
		this.ilog = ilog;
	}
	
	public String writeLog (String value) {
		return ilog.writeLogOutput(value);
	}
	
	

}
