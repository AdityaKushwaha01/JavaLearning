package stringLearning;

public class PrintEachlettertwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Hello";
		//output = HHeelllloo
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < 2; j++) {
				sb.append(s1.charAt(i));
				
		}
		System.out.println(sb.toString());
		
	}

	}
}
