package NewLearningsJava;

public class FindPalindromLength5 {

	public static void main(String[] args) {
		String str = "abccbabcbaxyzmadam";
		palindromStringLength5(str);

	}
	public static boolean IsPalindrome(String str) {
		int start=0;
		int end = str.length()-1;
		
		while(start<end) {
			if(str.charAt(start++)!=str.charAt(end--)) {
				return false;
			}
		}
		return true;
		
	}
	public static void palindromStringLength5(String str) {
		for (int i = 0; i <= str.length()-5; i++) {
			String sub = str.substring(i,i+5);
			if(IsPalindrome(sub)) {
				System.out.println(sub);
			}
			
		}
	}

}
