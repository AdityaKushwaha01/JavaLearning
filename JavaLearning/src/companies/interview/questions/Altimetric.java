package companies.interview.questions;

import java.util.Arrays;

public class Altimetric {

	public static void main(String[] args) {
        String[] arr = {"adi7tya", "ku2mar", "auto4m", "6mation"};

        Arrays.sort(arr, (a, b) -> extractNumber(a) - extractNumber(b));

        for (String s : arr) {
            System.out.print(s + " ");
        }
    }

    // Function to extract number from string
    public static int extractNumber(String str) {
        String num = "";
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                num += ch;
            }
        }
        
        return Integer.parseInt(num);
    }

}
