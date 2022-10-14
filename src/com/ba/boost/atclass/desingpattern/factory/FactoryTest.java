package com.ba.boost.atclass.desingpattern.factory;

public class FactoryTest {

	public static void main(String[] args) {
		
		LandLogistic land = new LandLogistic();
		land.accept("Fasulye");
		System.out.println(land);

//		AirLogistic air = new AirLogistic();
//		System.out.println(air);
//				
		Logistic l1 = LogisticsFactory.create("Kara");
		System.out.println(l1);
//		
//		Logistic l2 = LogisticsFactory.create("Deniz");
//		System.out.println(l2);
//		
//		Logistic l3 = LogisticsFactory.create("Hava");
//		System.out.println(l3);
//		
//		String[] types = {"Kara", "Kara", "Deniz", "Hava", "Hava", "Kara", "Kara", "Deniz", "Hava", "Hava"};
//		
//		Logistic l;
//		for (String type : types) {
//			if (type.equalsIgnoreCase("Kara")) {
//				l = new LandLogistic();
//			} else if (type.equalsIgnoreCase("Deniz")) {
//				l = new SeaLogistic();
//			} else {
//				l = new AirLogistic();
//			}
//			System.out.println(l);
//		}
//		
//		for (String type : types) {
//			l = LogisticsFactory.create(type);
//			System.out.println(l);
//		}
	}

}
