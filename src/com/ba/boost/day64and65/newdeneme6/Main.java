package com.ba.boost.day64and65.newdeneme6;

import java.util.UUID;

public class Main {

	public static void main(String[] args) {
		
		String code = UUID.randomUUID().toString();
		System.out.println(code);
		String[] datas = code.split("-");
		
		StringBuilder newCode = new StringBuilder();
		
		for (String str : datas) {
			newCode.append(str);
		}
		
		System.out.println(newCode);
		
	
		
	}

}
