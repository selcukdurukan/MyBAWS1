package com.ba.boost.day17.bakkal;

import com.ba.boost.day17.bakkal.model.BakeryProduct;
import com.ba.boost.day17.bakkal.model.MilkProduct;

import java.time.LocalDate;

import com.ba.boost.day17.bakkal.model.AnimalProductType;
import com.ba.boost.day17.bakkal.model.Product;
import com.ba.boost.day17.bakkal.model.UnitType;

public class TheBakkal {
	
	public static void main(String[] args) {
		
		MilkProduct cheese = new MilkProduct("Beyaz Peynir", UnitType.KG, 85.56, 5,
															LocalDate.of(2022, 5, 22), AnimalProductType.GOAT_LAMB, false, true);
//		cheese.setBottled(false);
//		cheese.setLactoseFree(true);
//		cheese.setProductionDate(LocalDate.of(2022, 05, 22));
//		cheese.setQuantity(5);
//		cheese.setName("Beyaz Peynir");
//		cheese.setType(AnimalProductType.GOAT_LAMB);
//		cheese.setUnit(UnitType.KG);
//		cheese.setUnitPrice(85.56);
		
		System.out.println(cheese.getUnit().name());
		System.out.println(cheese);
		
		MilkProduct milk = new MilkProduct("Tam Yagli Sut", UnitType.KG, 30, 15,
															LocalDate.of(2022, 11, 8), AnimalProductType.COW, true, false);
//		milk.setBottled(true);
//		milk.setLactoseFree(false);
//		milk.setProductionDate(LocalDate.of(2022, 05, 22));
//		milk.setQuantity(5);
//		milk.setName("Tam yagli sut");
//		milk.setType(AnimalProductType.GOAT_LAMB);
//		milk.setUnit(UnitType.KG);
//		milk.setUnitPrice(30);
		
		System.out.println(milk.getUnit().name());
		System.out.println(milk);
		
		
		System.out.println("Peynir bayat mi? " + cheese.expired());
		System.out.println("Sut bayat mi? " + milk.expired());
		
		
		
		/*
		 * 
		 * 
		 * 	
//		Product p1 = new Product();
//		System.out.println(p1);
//		
//		Product p1 = new Product();
//		System.out.println(p1);
		
		MilkProduct m1 = new MilkProduct();
		System.out.println(m1);
		
//		MilkProduct m2 = p1; // This isn't true because m2 child class. You can do this only using casting.  
		
//		MilkProduct m3 = (MilkProduct) p1; 
		
		Product p2 = m1; // This is true because p2 parent class. Parent class can be assigned child class.
		System.out.println(p2);
		
		Product p4 = new MilkProduct();
		System.out.println(p4); 
		
		BakeryProduct b = new BakeryProduct();
		System.out.println(b);
		
		Product p5 = new MilkProduct();
		((MilkProduct)p5).setType(AnimalProductType.GOAT); // Runtime sırasında Java hangi sınıfla çalıştığını biliyor ve ona göre davranıyor.
												// programı yazarken eğer bir alt sınıfı üst sınıfa atadı isek, alt sınıfın özelliklerine
												// ulaşmak için type-casting yapmamız gerekli.
		
		
		*
		*
		*/
	}
}
