package NewLearningsJava;

public class MaxSubArraySum {

	public static void main(String[] args) {
		int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println( maxSum(arr));
		

	}
	public static int maxSum(int[] nums) {
		int maxSum=nums[0];
		int curMax=nums[0];
		
		for (int i = 0; i < nums.length; i++) {
			curMax=Math.max(nums[i], curMax+nums[i]);
			maxSum=Math.max(maxSum, curMax);
		}
		return maxSum;
	}
}
