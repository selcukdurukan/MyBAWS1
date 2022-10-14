package com.ba.boost.atclass.desingpattern.builder2;

public class Test {

	public static void main(String[] args) {
		
		Computer comp = new Computer.ComputerBuilder("500GB", "2GB").setBluetoothEnabled(true).build();
		System.out.println(comp);
		
		Computer comp1 = new Computer.ComputerBuilder("500GB", "2GB").setBluetoothEnabled(false).setGraphicsCardEnabled(false).build();
		System.out.println(comp1);
		
	}

}
