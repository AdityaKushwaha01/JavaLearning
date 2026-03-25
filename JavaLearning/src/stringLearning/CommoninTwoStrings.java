package stringLearning;

public class CommoninTwoStrings {

	public static void main(String[] args) {
		String s1="abcd";
		String s2="cdefgfg";
		
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if(s1.charAt(i)==s2.charAt(j))	{
					System.out.println(s2.charAt(j));
				}
			}
		}
	}

}
