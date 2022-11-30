package com.ba.boost.day27.singleresponsibility;

public class PasswordHasher {
	
	/*
	 * Bu class hem hashleme hem de save etme işlemini yapıyor ancak class adıyla özdeşleşen tek bir işlem yapmalı.
	 * ve bir method'un içersinde iki iş yapmamalısın.
	 * bu iki durum single-responsibility principle'a aykırı.
	 */
	
	//Hash and save işini yapan bir method olmamalı
	public void hashAndSavePassword (String password) {
		hashPassword(password);
		savePassword(password);
	}
	
	
	public void hashPassword(String Password) {
		
//		password.hash();
	
	}
	
	public void savePassword(String password) {
		
//		db.save(password);
		
	}

}
