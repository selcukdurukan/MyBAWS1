package com.ba.boost.day07;

import javax.swing.JOptionPane;

public class PrintFunctions {
	
	static void name() {
		String name = "Selcuk";
		String lastname = "Durukan";
		System.out.println(name+ " "+lastname);
	}
	
	void JP() {
		
		JOptionPane.showMessageDialog(null, "Ooops. Someting went wrong", "System Error", 0);
	}

	public static void main(String[] args) {
		
		name();
		
		PrintFunctions option = new PrintFunctions();
		option.JP();
		
		//float y = 1.5f; or float z=(float) 1.6;   
		
		//long z = 100000; or long y=10000000l;
		
	}

}
