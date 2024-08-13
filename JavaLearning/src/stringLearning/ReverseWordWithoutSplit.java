package stringLearning;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordWithoutSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello World This Is Java";
		String revsent="";
		List words = new ArrayList();
		StringBuilder word = new StringBuilder();
		
		for (int i = 0; i <= input.length()-1; i++) {
			if(input.charAt(i)==' ') {
				if(word.length()>0) {
					words.add(word.toString());
					word.setLength(0);
				}
			}
			else {
				word.append(input.charAt(i));
				
			}
		}
		if(word.length()>0) {
			words.add(word.toString());	
		}
		//System.out.println(words.reversed()); ==> reversing the sentence-- Directly reversing the list words
	
		
//		StringBuilder sb = new StringBuilder();
//		for (int i = words.size()-1; i >= 0; i--) {
//			sb.append(words.get(i));
//			if (i!=0) {
//				sb.append(' ');
//			}
//		}
		//System.out.println(sb.toString()); ==> reversing the sentence--appending each word to StringBuilder
	
		for (int i = 0; i < words.size(); i++) {
			//System.out.println(words.get(i));
			String wordtorev= (String)words.get(i);
			String revword=" ";
			for (int j = wordtorev.length()-1;j>=0; j--) {
				revword=revword+wordtorev.charAt(j);
			}
			revsent= revsent+revword;
		}
		System.out.println(revsent); //==> reversing the each word of sentence
		
	}

}
