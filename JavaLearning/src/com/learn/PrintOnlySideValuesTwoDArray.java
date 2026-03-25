package com.learn;

public class PrintOnlySideValuesTwoDArray {
	public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
            };
     int col = arr.length;
     int row= arr[0].length;
     
     for(int i=0;i<row;i++){
         System.out.print(arr[0][i]+" ");
     }
     System.out.println();
     for(int i=0;i<row;i++){
         System.out.print(arr[col-1][i]+" ");
     }
     System.out.println();
      for(int i=0;i<col;i++){
         System.out.print(arr[i][0]+" ");
     }
     System.out.println();
     for(int i=0;i<row-1;i++){
         System.out.print(arr[i][row-1]+" ");
     }
 }

}
