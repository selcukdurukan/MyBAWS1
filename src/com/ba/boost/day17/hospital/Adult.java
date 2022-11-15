package com.ba.boost.day17.hospital;


public class Adult extends Person {
	
	

	public Adult() {
		super();
		//TODO Auto-generated constructor stub
	}

	public Adult(String name, boolean isHealthy, int age) {
		super(name, isHealthy, age);
		//TODO Auto-generated constructor stub
	}

	@Override
	public void examination() {
		if (super.isHealthy() == false) {
			System.out.println("Your examination has been done and your medicine is here.");
		} else if (super.isHealthy() == true){
			System.out.println("Your check up has been done.");
		}else {
			System.out.println("Something went wrong...");
		}
	}
	

}
