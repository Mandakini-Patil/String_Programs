package com.jsp.string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter string: ");
			String s1=sc.next();
			String s2=sc.next();
			
			boolean rs=isAnagram(s1,s2);
			if(rs)
				System.out.println("string is anagram");
			else
				System.out.println("string is not anagram");
			}

		private static boolean isAnagram(String s1, String s2) {
//			s1=s1.replaceAll(" "," ");
//			s2=s2.replaceAll(" "," ");
			
			if(s1.length()!=s2.length())
			return false;
			
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			return Arrays.equals(ch1, ch2);
			}

	}



