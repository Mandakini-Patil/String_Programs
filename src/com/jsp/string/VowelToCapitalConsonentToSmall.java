//convert all the vowels to capital letter and consonents to small letters

package com.jsp.string;

import java.util.Scanner;

public class VowelToCapitalConsonentToSmall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String st=sc.next();
		String res=vowelConsonent(st);
		System.out.println(res);
	}
	
	public static String vowelConsonent(String st) {
		char[] ch=st.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A'&&ch[i]<='Z') {
			if(ch[i]!='A'||ch[i]!='E'||ch[i]!='I'||ch[i]!='O'||ch[i]!='U') 
				ch[i]=(char)(ch[i]+32);
			}
			else if  (ch[i]>='a'&&ch[i]<='z') {
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='u')
				ch[i]=(char)(ch[i]-32);
			}
		}
		
		return new String(ch);
	}

}
