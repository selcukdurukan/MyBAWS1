package com.ba.boost.day13.accessmodifiers.outside;

import com.ba.boost.day13.accessmodifiers.AccessModifeirs;

public class OutsideAccessSubClass extends AccessModifeirs {

	public static void main(String[] args) {
		
		AccessModifeirs obj = new AccessModifeirs();
		System.out.println("Erisebildigim degiskenler:  " +obj.publicVariable);
		
		OutsideAccessSubClass xObj = new OutsideAccessSubClass();
		System.out.println("Erisebildigim degiskenler: " +xObj.publicVariable+ xObj.protectedVariable);
	}

}
