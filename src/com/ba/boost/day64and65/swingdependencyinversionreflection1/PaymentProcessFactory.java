package com.ba.boost.day64and65.swingdependencyinversionreflection1;

public class PaymentProcessFactory {

	public IPaymentType create(String className) {
		
		Class clazz;
		IPaymentType iPaymentType = null;
		
		try {
			clazz = Class.forName("com.ba.boost.day64and65.swingdependencyinversionreflection1." + className);
			
			iPaymentType = (IPaymentType)clazz.newInstance();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return iPaymentType;
	}

}
