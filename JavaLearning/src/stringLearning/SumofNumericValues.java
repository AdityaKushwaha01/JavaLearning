package stringLearning;

public class SumofNumericValues {

	public static void main(String[] args) {
        String input = "123Hello456";
 
        String[] numbers = input.split("[^0-9]+");
        
        int sum = 0;
        for (String num : numbers) {
        	System.out.println(num);
            if (!num.isEmpty()) {
                sum += Integer.parseInt(num);
            }
        }
        
        System.out.println(sum); // Output: 579
    }

}
