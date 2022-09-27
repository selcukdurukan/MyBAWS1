package com.ba.boost.day11.heapandstack;

public class CoordinateSystem {

	public static void main(String[] args) {

		Point p1 = new Point();
		p1.xCoord = 1;
		p1.yCoord = 1;
		p1.zCoord = 1;

		System.out.println(p1); // This writes stack address. (Reference Address)

		System.out.println("P1x: " + p1.xCoord + "\tP1y:" + p1.yCoord + "\tP1z: " + p1.zCoord); // This writes features
																								// from heap.

		Point p2 = p1;
		System.out.println(p2);

		p2.xCoord = 5;
		System.out.println("P2x: " + p2.xCoord + "\tP2y:" + p2.yCoord + "\tP2z: " + p2.zCoord); // This writes features
																								// from heap.

		System.out.println("P1x: " + p1.xCoord + "\tP1y:" + p1.yCoord + "\tP1z: " + p1.zCoord); // This writes features
																								// from heap.

		Point p3 = new Point();
		p3.xCoord = 5;
		p3.yCoord = 1;
		p3.zCoord = 1;

		System.out.println(p3); // Same features but it holds different stack address and heap memory because we
								// created new object from Point Class.
		
		System.out.println("P3x: " + p3.xCoord + "\tP3y:" + p3.yCoord + "\tP3z: " + p3.zCoord); // This writes features
																								// from heap.

		if (p1 == p2) {
			System.out.println("P1 and P2 are same identity.");
		} else {
			System.out.println("P1 and P2 are not same identiy. ");
		}

		if (p2 == p3) {
			System.out.println("P2 and P3 are same identity.");
		} else {
			System.out.println("P2 and P3 are not same identity. ");
		}

		if (p2.xCoord == p3.xCoord && p2.yCoord == p3.yCoord && p2.zCoord == p3.zCoord) {
			System.out.println("P2 and P3 are same values.");
		} else {
			System.out.println("P2 and P3 are not same values. ");
		}
		
		System.out.println("P1 == P2\t" + p1.equals(p2));
		System.out.println("P1 = P2 \t"  + (p1 == p2));
		
		System.out.println("P2 == P3\t" + p2.equals(p3));
		System.out.println("P2 = P3 \t"  + (p2 == p3));
		
	}

}
