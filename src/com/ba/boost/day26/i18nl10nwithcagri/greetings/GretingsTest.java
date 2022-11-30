package com.ba.boost.day26.i18nl10nwithcagri.greetings;

public class GretingsTest {

	public static void main(String[] args) {
		
		Messages.init("en");
		
		System.out.println(Messages.getString("GretingsTest.HELLO")); //$NON-NLS-1$
		System.out.println(Messages.getString("GretingsTest.SPLITTER")); //$NON-NLS-1$
		System.out.println(Messages.getString("GretingsTest.HOW_ARE_YOU")); //$NON-NLS-1$
		System.out.println("--------------------------"); //$NON-NLS-1$
		System.out.println(Messages.getString("GretingsTest.GOODBYE")); //$NON-NLS-1$
		

	}

}
