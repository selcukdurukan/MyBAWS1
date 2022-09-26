package com.ba.boost.week02.day11;

import javax.swing.JOptionPane;

public class NullEmptyandBlank {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Write anything: ");
		System.out.println(input);
		
		if (input==null) {
			System.out.println("Null");
		}
		
		if (input.isEmpty()) {
			System.out.println("This is empty.");
		}else if (input.isBlank()){
			System.out.println("This contains blank.");
		}else {
			System.out.println("Something going wrong.");
		}
		

	}

}
