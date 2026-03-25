package companies.interview.questions;

import java.util.*;
public class PhotonInt2 {


	//	Find the sum of highest & lowest frequency  
	//	Ex- {1,1,2,2,2,3,3,3,3}, O/P: 4+2=6
	//	Ex- {0,2,2,2,5,5,5,5}, O/P: 1+4=5
	public static void main(String[] args) {
		int[] arr=	{1,1,2,2,2,3,3,3,3};

		Map<Integer,Integer> mp = new HashMap<>();

		for( int i:arr) {
			mp.put(i, mp.getOrDefault(i, 0)+1);
		}

		int maxFreq=Integer.MIN_VALUE;
		int minFreq= Integer.MAX_VALUE;

		int maxelement=0;
		int minelement=0;

		for( Map.Entry<Integer, Integer> ent:mp.entrySet()) {
			int element= ent.getKey();
			int freq= ent.getValue();

			if(freq>maxFreq) {
				maxFreq=freq;
				maxelement=element;
			}
			if(freq<minFreq) {
				minFreq=freq;
				minelement=element;
			}
		}
		System.out.println(minFreq+maxFreq);
	}
}
