package stringLearning;

public class RemoveCharfromFirstStringPresentInSecond {

	public static void main(String[] args) {

		String name1= "Aditya";
		String name2= "Adi";

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < name1.length(); i++) {
			char c = name1.charAt(i);

			if(name2.indexOf(c)== -1) {
				sb.append(c);
			}

		}

		System.out.println(sb.toString());

	}

}
