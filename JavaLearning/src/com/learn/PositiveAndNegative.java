package com.learn;

import java.util.ArrayList;

public class PositiveAndNegative {

	public static void main(String[] args) {
		
		int[] num = {1,-2,-4,9,-3,49,5,-10};
		int[] temp = new int[num.length];
		int ind =0;
		for (int i = 0; i < temp.length; i++) {
			if (num[i]>0) {
				temp[ind++]= num[i];
			}
			
			}
		for (int i = 0; i < num.length; i++) {
			if (num[i]<0) {
				temp[ind++]= num[i];
			}
		}
		
		for (int i : temp) {
			System.out.print(" "+i);
		}

}
}