package com.learn;

public class GetNewArrayfromGivenArrays {

	public static void main(String[] args) {
		char[] s1= {'A','B','C','D','E','t','Z'};
		char[] s2= {'c','d','e','f'};
		//Output- {a,C,b,D,c,E,d,F,e,t,z}

		char[] res = new char[s1.length+ s2.length];

		int j =0;
		for (int i = 0; i < s1.length-1; i++) {
			if(Character.isUpperCase(s1[i])) {

				res[j]=Character.toLowerCase(s1[i]);
				j=j+2;
			}
			else {
				res[j]=s1[i];
				j=j+2;
			}
		}
		int k =1;
		for (int i = 0; i < s2.length; i++) {
			if(Character.isLowerCase(s2[i])) {

				res[k]=Character.toUpperCase(s2[i]);
				k=k+2;
			}
		}
		
		for (char c : res) {
			System.out.print(c+" ");
		}

	}

}
