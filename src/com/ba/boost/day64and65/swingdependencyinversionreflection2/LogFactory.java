package com.ba.boost.day64and65.swingdependencyinversionreflection2;

public class LogFactory {
	
	public ILog create(String className) {
		
		ILog ilog = null;
		
		try {
			Class<?> clazz = Class.forName("com.ba.boost.day64and65.swingdependencyinversionreflection2." + className);
			
			try {
				ilog = (ILog) clazz.newInstance();
				
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return ilog;
		
	}
	
	
	

}
