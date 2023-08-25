package com.ba.boost.day64and65.swingdependencyinversionreflection1;

public class CryptoCurrency implements IPaymentType{

	@Override
	public String doPayment(double fee) {
		return "Payment has been done by cyrpto currency " + fee;

	}

}
