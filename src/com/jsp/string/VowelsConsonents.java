//how many vowels and consonent present in the string

package com.jsp.string;

import java.util.Scanner;

public class VowelsConsonents {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string: ");
		
		String st=sc.nextLine().toLowerCase();
		int vowels=0,cons=0;
		
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				vowels++;
			else
				cons++;
		}
		
		System.out.println("Number of Vowels: "+vowels);
		System.out.println("Number of consonents: "+cons);
		
	}

}
