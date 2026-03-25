package stringLearning;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "AdityhaKumar";
		String str2= "Adityhu6aKumar";

		char[] str1arr = str1.toLowerCase().toCharArray();
		char[] str2arr = str2.toLowerCase().toCharArray();

		sortArray(str1arr);
		sortArray(str2arr);

		if(Arrays.equals(str1arr, str2arr)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
	}

	public static char[] sortArray(char[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					char temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}

		}
		return arr;

	}


}

