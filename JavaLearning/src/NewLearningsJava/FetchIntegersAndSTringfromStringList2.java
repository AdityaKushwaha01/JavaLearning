package NewLearningsJava;

import java.util.*;

public class FetchIntegersAndSTringfromStringList2 {
	public static void main(String[] args) {
		List<String> str= new ArrayList<>();
		str.add("123");
		str.add("ABCD");
		str.add("321");
		str.add("xyz");
		
		List<String> str2= new ArrayList<>();
		List<Integer> num= new ArrayList<>();
		
		for(String s:str) {
			if(s.matches("\\d+")) {
				num.add(Integer.parseInt(s));
			}
			else {
				str2.add(s);
			}
		}
		
		System.out.println(str2);
		System.out.println(num);
	}
}
