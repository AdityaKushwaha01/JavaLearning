package com.learn;

import java.util.Arrays;

public class largestcommonprefixStringslLeetCode {

	public static void main(String[] args) {
		
		String[] strs= {"feuit","fell","fellow","feil","feel"};
		Arrays.sort(strs);
		
		 String s1=strs[0];
		 String s2=strs[strs.length-1];
		 
		 int i =0;
		 while(i<s1.length()) {
			 if(s1.charAt(i)==s2.charAt(i)) {
				 i++;
			 }
			 else {
				 break;
			 }
			 
		 }
		System.out.println(s1.substring(0,i));
		
	}

}
