package com.ba.boost.day16.bakkal;

import com.ba.boost.day16.bakkal.model.MilkProduct;
import com.ba.boost.day16.bakkal.model.Product;

public class TheBakkal {
	
	public static void main(String[] args) {
		
		Product p1 = new Product();
		System.out.println(p1);
		
		MilkProduct m1 = new MilkProduct();
		System.out.println(m1);
		
//		MilkProduct m2 = p1; // This isn't true because m2 child class. You can do this only using casting.  
		
//		MilkProduct m3 = (MilkProduct) p1; 
		
		Product p2 = m1; // This is true because p2 parent class. Parent class can be assigned child class.
		System.out.println(p2);
		
		Product p4 = new MilkProduct();
		System.out.println(p4);
		
		
		
	}
}
