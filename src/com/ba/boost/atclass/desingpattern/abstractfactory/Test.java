package com.ba.boost.atclass.desingpattern.abstractfactory;

public class Test {
	
	private static Application configureApplication() {
		
		Application app;
		GUIfactory factory;
		String osName = System.getProperty("os.name").toLowerCase();
		System.out.println(osName);
		
		if (osName.contains("mac")) {
			factory = new MacOSFactory();
		} else {
			factory = new WindowsFactory();
		}
		
		return app = new Application(factory);
	
	}

	public static void main(String[] args) {
		
		configureApplication().configure();
		
	}
	
}
