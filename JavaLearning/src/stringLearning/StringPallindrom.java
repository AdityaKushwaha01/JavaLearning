package stringLearning;

public class StringPallindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "raar";
		String rev = "";
		
		for (int i = str.length()-1;i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("Pallindrome string");
		}
		else {
			System.out.println("Not a pallindrome string");
		}
	}

}
