package com.ba.boost.day34.threadexample;

import java.util.Random;

public class SprinterTest {

	public static void main(String[] args) {

		Race obj = new Race();

		Sprinter2 spr2Obj = new Sprinter2(obj);
		Thread sp2 = new Thread(spr2Obj, "Sprinter 2");

		Sprinter1 spr1Obj = new Sprinter1(obj);
		Thread sp1 = new Thread(spr1Obj, "Sprinter 1");

		sp2.start();
		sp1.start();
		
		Random rnd = new Random();
		System.out.println(rnd.nextInt(0, 2));

	}

}
