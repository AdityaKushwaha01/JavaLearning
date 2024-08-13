package stringLearning;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "AdityhaKumar";
		String str2= "AdityhaLumar";

		char[] str1arr = str1.toLowerCase().toCharArray();
		char[] str2arr = str2.toLowerCase().toCharArray();

		Arrays.sort(str1arr);
		Arrays.sort(str2arr);

//		if(str1arr.length != str2arr.length) {
//			System.out.println("Not Anagram");
//		//	System.exit(0);
//		}
//
//		for (int i = 0; i < str2arr.length; i++) {
//			if(str1arr[i]!=str2arr[i]) {
//				System.out.println("Not Anagram");
//				//System.exit(0);
//			}
//
//		}
//		System.out.println("Anagram");	
//	}}
			if(Arrays.equals(str1arr, str2arr)) {
				System.out.println("Anagram");
			}
			else {
				System.out.println("Not Anagram");
			}
		}


}

