package stringLearning;

public class AlphabaticPattern {

	public static void main(String[] args) {
		int n = 5; // Number of rows
		char ch;

		for (int i = 0; i < n; i++) {
			ch = 'A'; // Start character for each row
			for (int j = 0; j <= i; j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}
}
