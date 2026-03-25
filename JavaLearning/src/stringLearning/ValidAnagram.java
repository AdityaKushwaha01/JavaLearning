package stringLearning;

public class ValidAnagram {

	public static void main(String[] args) {
		if(StrSort("eleven plus two").equals(StrSort("twelve plus one"))) {
			System.out.println("valid anagram");
		}
		else {
			System.out.println("Not valid");
		}
	}
	public static String StrSort(String s) {
		char[] arr = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					char temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;		
				}
			}
		}
		for (char c : arr) {
			sb.append(c);
		}
		return sb.toString();		
	}
}
