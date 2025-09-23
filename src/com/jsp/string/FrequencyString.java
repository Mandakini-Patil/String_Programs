//WJP to find the frequency of each characters in the given string

package com.jsp.string;

import java.util.Scanner;

public class FrequencyString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string: ");
		String st=sc.next();
		
		int[] ct=new int[128];
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			ct[ch]++;
		}
		
		for(int i=0;i<ct.length;i++) {
			if(ct[i]!=0)
				System.out.println((char)i+"->"+ct[i]);
		}

	}

}
