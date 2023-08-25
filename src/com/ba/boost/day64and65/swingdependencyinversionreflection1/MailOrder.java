package com.ba.boost.day64and65.swingdependencyinversionreflection1;

public class MailOrder implements IPaymentType {

	@Override
	public String doPayment(double fee) {
		return "Payment has been done by mail order " + fee;
	}

}
