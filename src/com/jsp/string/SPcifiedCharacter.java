//write a java program to check specified character present in the string or not
//print the ration of capital letters and small letters present in the string
//how many vowels and consonent present in the string
//WJP to count how many special characters present in  the string other than alphabets and digits

//calculate the sum of digits present in the string

package com.jsp.string;

import java.util.Scanner;

public class SPcifiedCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string: ");
		String st=sc.nextLine();
		
		System.out.println("Enter character ");
		
		char ch=sc.next().charAt(0);
		
		boolean found=false; int index=-1;
		
		for(int i=0;i<st.length();i++) {
			char c=st.charAt(i);
					if(c==ch)
				found=true;
			
			
		}
		if(found) {
		System.out.println("Specified character is present");
		System.out.println("Present at index:" +st.indexOf(ch));
		}
		else
			System.out.println("Specified character not present");
		
		
	}

}
