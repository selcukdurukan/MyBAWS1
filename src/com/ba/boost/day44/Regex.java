package com.ba.boost.day44;

import java.util.regex.Pattern;

public class Regex {
	/*
	 * Regular Expression, genelde şifreler için veya string ifalere kurallar koymak için kullanır.
	 * 
	 */

	public static void main(String[] args) {
		
		String path = "a[abc]def";
		System.out.println("aadef".matches(path));
		System.out.println("abdef".matches(path));
		System.out.println("agdef".matches(path));
		System.out.println("adef".matches(path));
		System.out.println("def".matches(path));
		
		System.out.println();
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "123456"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "12345a"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "12345af"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "af"));
		
		System.out.println();
		System.out.println(Pattern.matches("[123]{1}[4-9]{3}", "2456"));
		System.out.println(Pattern.matches("[123]{1}[4-9]{3}", "2316"));
		System.out.println(Pattern.matches("[123]{1}[4-9]{3}", "3999"));
		System.out.println(Pattern.matches("[123]{1}[4-9]{3}", "399a"));
		

	}

}
