package stringLearning;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] name = "My Name is Aditya".split(" ");
		String revSent = "";
			for (int i = 0; i < name.length; i++) {
				String word= name[i];
				String revword ="";
				for (int j =word.length()-1;j>=0; j--) {
					revword = revword+word.charAt(j);
				}
				revSent = revSent+revword+" ";
				System.out.println(revSent);
			}
			
	}

}
