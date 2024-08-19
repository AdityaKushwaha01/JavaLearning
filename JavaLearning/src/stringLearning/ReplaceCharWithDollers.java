package stringLearning;

public class ReplaceCharWithDollers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Go to Zoho";
		StringBuilder output = new StringBuilder();
		int dolcount = 1;
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if(c=='o') {
				for (int j = 0; j < dolcount; j++) {
					output.append('$');
					
				}
				dolcount++;
			}
			else {
				output.append(c);
			}
			
		}
		System.out.println(output.toString());
		
	}

}
