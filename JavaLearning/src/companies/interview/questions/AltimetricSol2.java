package companies.interview.questions;
import java.util.*;
public class AltimetricSol2 {
	public static void main(String[] args) {
		String[] arr = {"adi7tya", "ku2mar", "auto4m", "6mation"};
		int[] num=new int[arr.length];
		int l=0;
		for(int i=0;i<arr.length;i++){
			String word=arr[i];
			for( int j=0;j<word.length();j++){
				if(Character.isDigit(word.charAt(j))){
					num[l]=Character.getNumericValue(word.charAt(j));
					l++;
				}
			}
		}
		Arrays.sort(num);
		StringBuilder sb = new StringBuilder();
		for( int k:num){
			for(String st:arr){
				if(st.contains(String.valueOf(k))){
					sb.append(st).append(" ");
				}
			}
		}
		System.out.println(sb.toString());

	}
}

