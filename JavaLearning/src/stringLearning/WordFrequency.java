package stringLearning;
import java.util.*;
public class WordFrequency {

	public static void main(String[] args) {
		String str = "This is the test to count words This test is easy ";
	       String[] arr = str.toLowerCase().split(" ");
	       
	       Map<String,Integer> wordcount = new HashMap<>();
	        
	        for(String st :arr){
	           wordcount.put(st,wordcount.getOrDefault(st,0)+1);
	    }
	    for(Map.Entry<String,Integer> entry : wordcount.entrySet()){
	        System.out.println(entry.getKey()+":"+ entry.getValue());
	    }
	    

	}

}
