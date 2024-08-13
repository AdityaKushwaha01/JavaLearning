package stringLearning;

import java.util.Arrays;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input = aabbbcccca;
		// output = a3b3c4
		String name = "aabbbcccc";
		int count=1;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < name.length(); i++) {
			if(i+1<name.length() && name.charAt(i)==name.charAt(i+1)) {
				count++;
			}
			else {
				sb.append(name.charAt(i)).append(count);
				count=1;
			}
		}
		System.out.println(sb.toString());	
	}
}
