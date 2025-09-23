package com.jsp.string;

import java.util.Scanner;

public class SpecialCharacterCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Strimg: ");
		
		String st=sc.nextLine();
		
		int spc=0;
		
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(!Character.isLetterOrDigit(ch))
				spc++;
		}
		
		System.out.println("Number of special characters: "+spc);
		
	}

}
