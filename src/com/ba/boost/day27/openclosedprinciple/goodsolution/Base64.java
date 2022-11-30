package com.ba.boost.day27.openclosedprinciple.goodsolution;

public class Base64 implements IPasswordHasher {

	@Override
	public String hashPaswword(String password) {
		return "hashed with Base64";
	}

}
