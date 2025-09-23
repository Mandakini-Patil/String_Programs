//convert a string small letters to capital letter

package com.jsp.string;

public class ConvertLowerToUpper {
	public static void main(String[] args) {
		String str="Ramesh";
		String us=str.toUpperCase();//RAMESH
		String cs=toCapital(str);
		String cs1=toSmall(str);
		System.out.println(cs);
		System.out.println(cs1);
	}

	public static String toCapital(String str) {
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a'&&ch[i]<='z') {
				ch[i]=(char)(ch[i]-32); //if i want to convert small letter to capital letter:-32 
				                          
			}
		}
			
		
		return new String(ch);
	}
	
	public static String toSmall(String str) {
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A'&&ch[i]<='Z') {
				ch[i]=(char)(ch[i]+32);
				                          //if i want to convert capital letter to small letter: +32
			}
		}
			
		
		return new String(ch);
		
	}
	

}

//if i just want to compare we use charAt()
//if i want to change to string to upper case or lowaer or something we use toCharArray()
