package companies.interview.questions;

public class XebiaInterview {

	  public static void printSubsequence(String str, String current, int index) {

	        if (index == str.length()) {
	            System.out.println(current);
	            return;
	        }

	        // include character
	        printSubsequence(str, current + str.charAt(index), index + 1);

	        // exclude character
	        printSubsequence(str, current, index + 1);
	    }

	    public static void main(String[] args) {

	        String str = "abc";
	        printSubsequence(str, "", 0);
	    }

}
