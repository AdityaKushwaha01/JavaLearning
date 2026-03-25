package stringLearning;

public class FirstLetterUpperCase {

	public static void main(String[] args) {
		String str = "i love coding";
		StringBuilder sb = new StringBuilder();
		String[] arr = str.split(" ");
		for (int i =0;i<arr.length ;i++ ){
			String words=arr[i];

			words = words.substring(0,1).toUpperCase()+words.substring(1)+" ";
			sb.append(words);
		} 
		System.out.println(sb.toString());

	}

}
