package stringLearning;

public class ReverseStringPreservingSpaces {

	public static void main(String[] args) {
		String str = "aaa b bba cfww w";
		char[] arr = str.toCharArray();
		char[] res = new char[str.length()];

		for(int i =0; i<str.length(); i++) {
			if(arr[i]==' ') {
				res[i]=' ';
			}
		}
		int j = res.length-1;
		for(int i =0; i<str.length(); i++) {
			if(arr[i]!=' ') {
			    while(res[j]==' '){
			        j--;
			    }
			    res[j]=arr[i];
			    j--;
			}
		}
		for (char c :res ){
		    System.out.print(c);
		} 
	}

}
