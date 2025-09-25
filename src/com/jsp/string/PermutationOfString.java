package com.jsp.string;

public class PermutationOfString {
	public static void main(String[] args) {
		printPermute("ABC");
		
	}

	public static void printPermute(String st) {
		permute(st.toCharArray(),new boolean[st.length()],new StringBuilder());
		
	}
	
	public static void permute(char[] ch, boolean[] rs,StringBuilder sb) {
		if(sb.length()==ch.length)
			System.out.println(sb);
		
		else {
			for(int i=0;i<ch.length;i++) {
				if(rs[i]==false) {
					sb.append(ch[i]);
					rs[i]=true;
					permute(ch,rs,sb);
					sb.deleteCharAt(sb.length()-1);
					rs[i]=false;
					
					
					
				}
			}
		}
		
	}
	
	
	
	

}
