//write a java program to count how many alphabets,Digits and special characters are there

//read a character from the user =char ch=sc.next().charAt(0)

package com.jsp.string;

import java.util.Scanner;

public class AlphabetsDigitsSpecial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=sc.nextLine();
		int al=0,d=0,spc=0;
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
				al++;
			else if(ch>='0'&&ch<='9')
				d++;
		    else
				spc++;
		}
		
		System.out.println("Alphabets: "+al);
		System.out.println("Digits: "+d);
		System.out.println("special: "+spc);
		
		
	}

}
