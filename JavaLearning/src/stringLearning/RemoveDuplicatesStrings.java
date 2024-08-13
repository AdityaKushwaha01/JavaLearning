package stringLearning;

import java.util.HashSet;

public class RemoveDuplicatesStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "characters";
		HashSet<Character> hs = new HashSet<Character>();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < s1.length(); i++) {
			if (!hs.contains(s1.charAt(i))) {
				hs.add(s1.charAt(i));
				sb.append(s1.charAt(i));
			}			
		}
		System.out.println(sb.toString());

	}

}
