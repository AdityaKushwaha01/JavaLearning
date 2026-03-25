package stringLearning;

import java.util.Stack;

public class BalancedParanthesesStack {


	public static void main(String[] args) {
		String s ="({[]})";
		if(isValid(s)) {
			System.out.println("valid");
		}
		else{
			System.out.println("Invalid");
		};

	}
	public static boolean isValid(String s) {
		Stack<Character> st = new Stack<Character>();

		for(char c:s.toCharArray()) {
			if(c=='(') {
				st.push(')');
			}
			else if(c=='{') {
				st.push('}');
			}
			else if(c=='[') {
				st.push(']');
			}
			else if(st.isEmpty()||st.pop()!=c) {
				return false;
			}
		}
		return st.isEmpty();
	}

}
