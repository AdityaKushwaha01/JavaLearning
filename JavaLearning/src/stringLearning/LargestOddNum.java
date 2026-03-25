package stringLearning;

public class LargestOddNum {

	public static void main(String[] args) {
		String str="12486784";
		String num ="";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)%2!=0) {
				num=str.substring(0,i+1);
			}
		}
		System.out.println(num);

	}

}
