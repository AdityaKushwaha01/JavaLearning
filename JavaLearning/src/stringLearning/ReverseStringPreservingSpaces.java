package stringLearning;

public class ReverseStringPreservingSpaces {

	public static void main(String[] args) {
		
		String name = "I am not Aditya";
		char[] arr= name.toCharArray();
		char[] res = new char[name.length()];
	
		for (int i = 0; i < name.length(); i++) {
			if(arr[i]==' ') {
				res[i]=' ';
			}
		}
		int j = res.length-1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=' ') {
				while(res[j] ==' ') {
					j--;
				}
				res[j]=arr[i];
				j--;
			}
		}
		for (char c : res) {
			System.out.print(c);
		}

	}

}
