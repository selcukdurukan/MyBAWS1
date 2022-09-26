package com.ba.boost.week02.day09;

public class IfOperandTest {

	public static void main(String[] args) {
		
		int x = 50;
		int y = 25;
		
		if (x>y) {
			System.out.println("x is greater than y.");
		}else {
			System.out.println("x is smaller than y.");
		}
		
		String msg = x > y ? "x is greater than y.":"x is smaller than y.";
		System.out.println(msg);
	}
	
}