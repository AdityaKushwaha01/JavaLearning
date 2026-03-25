package companies.interview.questions;

import java.util.*;
public class Xebia2 {
	public static void main(String[] args) {
        int[] arr ={2,7,11,15};
        int target=9;
        
        Set<Integer> st = new HashSet<>();
        
        for( int i =0;i<arr.length;i++){
            for( int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==target && i!=j){
                    st.add(i);
                    st.add(j);
                }
            }
        }
        
        System.out.println(st);
    }
}
