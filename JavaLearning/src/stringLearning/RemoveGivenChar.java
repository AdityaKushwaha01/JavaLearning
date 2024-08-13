package stringLearning;

public class RemoveGivenChar {

	public static void main(String[] args) {
		
		String str= "Aditya";
		char c = 'd';
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)!=c) {
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}

}
