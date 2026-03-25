package stringLearning;

public class IsValidPllindrome {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama".toLowerCase();
		
		if(s.isEmpty()) {
			System.out.println("empty string");
		}
		String original = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(Character.isAlphabetic(c) || Character.isDigit(c)) {
				original=original+c;
			}
		}
	
		String reverse = new StringBuilder(original).reverse().toString();
		
		
		if(original.equals(reverse)) {
			System.out.println("pallindrome");
		}
		else {
			System.out.println("Not pallindrome");
		
		}
		
	}
	

}
