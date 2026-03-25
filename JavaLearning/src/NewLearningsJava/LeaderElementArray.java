package NewLearningsJava;
//A leader element in an array is an element that is greater than all the elements to its right.
public class LeaderElementArray {

	public static void main(String[] args) {
		int[] arr = {16, 17, 4, 3, 5, 2};
        findLeader(arr);
      
   }
   public static void findLeader(int[] arr){
       int n = arr.length;
       int lead=arr[n-1];
       System.out.println(lead);
       for(int i=n-2;i>=0;i--){
           if(arr[i]>lead){
               lead=arr[i];
                System.out.println(lead);
           }
       }
	}

}
