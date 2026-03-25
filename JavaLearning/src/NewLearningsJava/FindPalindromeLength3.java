package NewLearningsJava;

public class FindPalindromeLength3 {

	public static void main(String[] args) {
		String str = "abccbabcbaxyzmadam";
		palindromStringLength3(str);

	}
	public static boolean IsPalindrome(String str) {
		return (str.charAt(0)==str.charAt(2));
	}
	public static void palindromStringLength3(String str) {
		for (int i = 0; i <= str.length()-3; i++) {
			String sub = str.substring(i,i+3);
			if(IsPalindrome(sub)) {
				System.out.println(sub);
			}
			
		}
	}
}
