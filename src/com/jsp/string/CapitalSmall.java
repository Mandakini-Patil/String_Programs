//write a java code to find how many capital and small letters are there in the string

package com.jsp.string;

import java.util.Scanner;

public class CapitalSmall {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int uc=0,lc=0;
	
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		
		if(ch>='A'&&ch<='Z')  //if(ch>=65&&ch<=90)
			uc++;
		else if(ch>='a'&&ch<='z')  //(ch>=97&&ch<=122)
			lc++;
	}
	
	System.out.println("Number of capita letters "+uc);
	System.out.println("Number of small letters "+lc);
	

}	

}
