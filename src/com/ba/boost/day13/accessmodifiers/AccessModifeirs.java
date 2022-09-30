package com.ba.boost.day13.accessmodifiers;

public class AccessModifeirs {

	public String publicVariable = "Public.";
	protected String protectedVariable = "Protected.";
	String defaultVariable = "Default.";
	private String privateVariable = "Private.";
	
	public static void main(String[] args) {
		
		AccessModifeirs obj = new AccessModifeirs();
		
		System.out.println("Erisebildigim degiskenler:  " +obj.publicVariable+ obj.protectedVariable + obj.defaultVariable + obj.privateVariable);
	}
}
