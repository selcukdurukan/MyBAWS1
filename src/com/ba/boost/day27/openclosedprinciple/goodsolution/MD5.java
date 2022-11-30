package com.ba.boost.day27.openclosedprinciple.goodsolution;

public class MD5 implements IPasswordHasher {

	@Override
	public String hashPaswword(String password) {
		return "hashed with MD5";
	}

}
