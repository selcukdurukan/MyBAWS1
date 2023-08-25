package com.ba.boost.day64and65.swingdependencyinversionreflection1;

public class CreditCard implements IPaymentType {

	@Override
	public String doPayment(double fee) {
		return "Payment has been done by credit card " + fee;
	}

}
