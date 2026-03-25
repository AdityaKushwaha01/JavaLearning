package companies.interview.questions;
/*In a shop there are 6 toys each toy cost is different [5, 8, 7, 2, 3, 1]
and you have Rs.5 how many max toys you can buy, 
write a java program to find the max toys one can buy 
and also total cost of the toys. 
I want to exhaust all my money
*/
public class WissenTech {
    static int maxCount = 0;
    static int finalCost = 0;
    public static void main(String[] args) {
        int[] arr = {5, 8, 7, 2, 3, 1};
        int k = 5;
        findMaxToys(arr, k, 0, 0, 0);
        if (maxCount > 0) {
            System.out.println("Maximum Toys: " + maxCount);
            System.out.println("Total Cost: " + finalCost);
        } else {
            System.out.println("Not possible to exhaust all money");
        }
    }
    public static void findMaxToys(int[] arr, int k, int index, int currentSum, int currentCount) {

        // If money exactly exhausted
        if (currentSum == k) {
            if (currentCount > maxCount) {
                maxCount = currentCount;
                finalCost = currentSum;
            }
            return;
        }
        // If exceeded or reached end
        if (currentSum > k || index == arr.length) {
            return;
        }
        // Include current toy
        findMaxToys(arr, k, index + 1, currentSum + arr[index], currentCount + 1);

        // Exclude current toy
        findMaxToys(arr, k, index + 1, currentSum, currentCount);
    }
}