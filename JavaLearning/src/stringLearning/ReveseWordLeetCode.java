package stringLearning;

import java.util.Arrays;

public class ReveseWordLeetCode {

	public static void main(String[] args) {
		String str = "the sky is blue"; //out put --> blue is sky the
		String[] arr = str.trim().split(" ");
		
		int start=0;
		int end = arr.length-1;
		
		while(start<end) {
			
			String temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		String reversed = String.join(" ", arr);
		System.out.println(reversed);
		

	}

}
