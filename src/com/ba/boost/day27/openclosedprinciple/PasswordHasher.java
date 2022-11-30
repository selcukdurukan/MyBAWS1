package com.ba.boost.day27.openclosedprinciple;

public class PasswordHasher {

	/*
	 * Bu yaklaşım open-closed princible aykırı, yeni bir hash methodu tanımlandıgında tekrar blogu modify yapmamız gerekir.
	 * Oysa presibe göre sınıflarımız ve methodlar extend edilebilir ancak modify edilemez olması lazım
	 * good solution'da ki yöntemle yeni hash algoritmaları ekleyerek code çok prarik şekilde extend edilebilir.
	 */
	
	
	public String hashPassword(String password, HashingType hashingType) {

		String hashedPassword = null;
		if (HashingType.BASE65.equals(hashingType)) {
			hashedPassword = "Hashed with Base64";
		} else {
			hashedPassword = "Hashed with MD5";
		}
		return hashedPassword;
	}

}
