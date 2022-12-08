package com.ba.boost.day36.desingpattern.builder;

public class Computer {
	
	//required parameters
	private String hdd;
	private String ram;
	
	//optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	private Computer(ComputerBuilder builder) {
		this.hdd = builder.hdd;
		this.ram = builder.ram;
		this.isGraphicsCardEnabled = builder.isBluetoothEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}
	
	@Override
	public String toString() {
		return "ComputerBuilder [hdd=" + hdd + ", ram=" + ram + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}
	
	
	public String getHdd() {
		return hdd;
	}
	public String getRam() {
		return ram;
	}
	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	
	public static class ComputerBuilder {
		
		//required parameters
		private String hdd;
		private String ram;
		
		//optional parameters
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;
		
		public ComputerBuilder(String hdd, String ram) {
			super();
			this.hdd = hdd;
			this.ram = ram;
		}

		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
			
		
	}
	
	
}
