package com.ba.boost.day16.computer;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer c = new Computer();
		c.setBrand("Monster");
		c.setOperatingSystem("Windows");
		c.setRamSize(32);
		c.setScreenSize(15.6);
		c.setSsdCapacity(1024);
		c.showFeatures();
		c.connectWeb();
		
		Computer c1 = new Computer("Dell",16,256,15.6,"Dell");
		c1.showFeatures();
	}

}
