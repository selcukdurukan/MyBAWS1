package com.ba.boost.day37;

public class Test {
 
	public Test(test1 test1) {
		//TODO Auto-generated constructor stub
	}

	public static class test1 {
		
		public Test build() {
			Test newCar = new Test(this);
			return new Test(this);
		}
	}
}
