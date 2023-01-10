package com.ba.boost.atclass;

public class YieldMethod {
	
	public void callYied() {
		yiled();
	}
	
	void yiled () {
		System.out.println("yiled() called!");
	}

	public static void main(String[] args) {
		
		YieldMethod obj = new YieldMethod();
		obj.callYied();

	}

}
