package stringLearning;

public class SumofDigits {

	public static void main(String[] args) {
		String str = "Aditya123";
	    int sum =0;
	    for (int i=0;i<str.length() ;i++ ){
	        char c =str.charAt(i);
	        if(Character.isDigit(c)){
	            sum = sum+(c-'0');
	        }
	    }
	    System.out.println(sum);
	}

}
