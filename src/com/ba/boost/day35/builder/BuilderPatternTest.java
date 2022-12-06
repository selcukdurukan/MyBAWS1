package com.ba.boost.day35.builder;

public class BuilderPatternTest {

	public static void main(String[] args) {

		HouseBuilderPattern house1 = new HouseBuilderPattern.HouseBuilder("Taksim", "Istanbul", 100).build();

		HouseBuilderPattern house2 = new HouseBuilderPattern.HouseBuilder("Kagithane", "Istanbul", 101).terrace(true)
				.patio(true).numBalconies(2).apartment(false).build();

		HouseBuilderPattern house3 = new HouseBuilderPattern.HouseBuilder("Merkez", "Nigde", 12).numOfWCs(2)
				.apartment(true).kitchenType(KitchenType.TURK).numBalconies(2).numOfrooms(4).numOfStoreys(3)
				.patio(false).terrace(false).usableSpace(110).build();

		System.out.println(house1);
		System.out.println();
		System.out.println(house2);
		System.out.println();
		System.out.println(house3);

	}

}
