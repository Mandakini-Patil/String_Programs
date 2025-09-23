package com.jsp.string;

public class Sample {
	public static void main(String[] args) {
		String s1="Apple";
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(3));
		System.out.println(s1.indexOf('p'));
		System.out.println(s1.indexOf('A'));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('p'));
		System.out.println(s1.indexOf('b'));
		System.out.println(s1.indexOf('A',1));
		System.out.println(s1.indexOf('p',1));
	}

}
