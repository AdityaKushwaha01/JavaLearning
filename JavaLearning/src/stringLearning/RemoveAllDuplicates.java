package stringLearning;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveAllDuplicates {

	public static void main(String[] args) {
		String s1 = "adiitdytak";
		
		
		LinkedHashSet<Character> hs = new LinkedHashSet<>();
		StringBuilder sb = new StringBuilder();
		
		for (char ch :s1.toCharArray()) {
			hs.add(ch);
		}
		for (char chara : hs) {
			sb.append(chara);
		}
		
		System.out.println(sb.toString());

	}

}
