package NewLearningsJava;
import java.util.*;
public class MinDiffBnArraysElement {

	public static void main(String[] args) {
        int[] arr={3,9,50,15,99,7,98,65};
        Arrays.sort(arr);
        int first=0;
        int second =0;
        int minDif=Integer.MAX_VALUE;
        
        for(int i =0;i<arr.length-1;i++){
            int diff= Math.abs(arr[i+1]-arr[i]);
            if(diff<minDif){
                minDif=diff;
                first=arr[i];
                second=arr[i+1];
            }
        }
        
            System.out.println(first+" "+second);
    }
}
