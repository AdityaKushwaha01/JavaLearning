package NewLearningsJava;

public class MoveZerosToStart {
	public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int j =arr.length-1;
    for(int i =arr.length-1;i>=0;i--){
        if(arr[i]!=0){
          arr[j]=arr[i];
          j--;
        }
    }
    while(j>=0){
        arr[j]=0;
        j--;
    }
    
    for(int i:arr){
      System.out.println(i);
    }
    }
}
