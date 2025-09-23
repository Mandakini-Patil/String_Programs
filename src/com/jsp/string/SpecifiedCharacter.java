//write a java program to find how many times specified character present in the string

package com.jsp.string;

import java.util.Scanner;

public class SpecifiedCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Entyer String: ");
		String st=sc.nextLine();
		
		System.out.println("Enter Character: ");
		char ch=sc.next().charAt(0);
		
		int spc=0;
		for(int i=0;i<st.length();i++) {
			char c=st.charAt(i);
			
			if(c==ch)
				spc++;
		}
	
		System.out.println("Number of character "+spc);
	}	

}
