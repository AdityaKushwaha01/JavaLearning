package stringLearning;

public class ValidParantheses {

	public static void main(String[] args) {
		String s = "({[)]}";
		
		while(s.contains("()")||s.contains("{}")||s.contains("[]")) {
			if(s.contains("()")) {
				s=s.replace("()", "");
			}
			else if(s.contains("{}")) {
				s=s.replace("{}", "");
			}
			else if(s.contains("[]")) {
				s=s.replace("[]", "");
			}		
		}
		if (s.isEmpty()) {
			System.out.println("Valid");
		}
		else {
			System.out.println("invalid");
		}
	}

}
