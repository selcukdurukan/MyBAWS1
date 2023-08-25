package com.ba.boost.day64and65.swingdependencyinversionreflection1;

public class PaymentProcess {

	private IPaymentType iPaymentType;

	public PaymentProcess(IPaymentType iPaymentType) {
		this.iPaymentType = iPaymentType;
	}

	public String pay(double tutar) {
		return iPaymentType.doPayment(tutar);
	}

}
