package NewLearningsJava;

public class ThirdLargestArray {
	 public static void main(String[] args) {
	        int[] arr = {23,4,5,24,24,23,56,56,34,34,5,4,1};
	        int first= arr[0];
	        int sec = arr[0];
	        int third = arr[0];
	        for(int i =0;i<arr.length;i++){
	            if(arr[i]>first){
	                third = sec;
	                sec=first;
	                first= arr[i];
	            }
	            else if(arr[i]>sec && arr[i]!=first){
	                third = sec;
	                sec= arr[i];
	            }
	        }
	        System.out.println(third+" "+sec+" "+first);
	    }
}
	