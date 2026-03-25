package FreshLearnings;

public class MissingNumber {

	public static void main(String[] args) {
		int N=4;
		int[] arr= {2,3,4};
		
		int expectedSum=N*(N+1)/2;
		int actSum=0;
		for( int i:arr) {
			actSum+=i;
		}
		int missing= expectedSum-actSum;
		System.out.println(missing);
	}

}
