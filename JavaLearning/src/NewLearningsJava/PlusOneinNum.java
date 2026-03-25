package NewLearningsJava;

public class PlusOneinNum {

	public static void main(String[] args) {
        int[] arr1 = {9, 9, 9};
        int[] res =plusOne(arr1);
        
        for(int i:res){
            System.out.println(i);
        }
        
    }
    public static int[] plusOne(int[] arr){
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i]=0;
            
        }
        int[] res=new int[n+1];
        res[0]=1;
        return res;
    }

}
