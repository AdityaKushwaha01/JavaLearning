package com.learn;

public class StringtoNumberwithoutinbuiltfunction {

	public static void main(String[] args) {
		
		String str = "12345";
		int num =0;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isDigit(c)) {
				num = num*10+(c-'0');
			}
		}
		System.out.println(num);

	}

}
