package FreshLearnings;
import java.util.*;
public class CharFreqSort {

	public static void main(String[] args) {
        String str="mississippi";
        StringBuilder sb = new StringBuilder();
        Map<Character,Integer> mp= new HashMap<>();
        for( char c:str.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        
        List<Character> ls= new ArrayList<>(mp.keySet());
        ls.sort((a,b)->mp.get(b)-mp.get(a));
        
        for(char c:ls){
            for(int i=0;i<mp.get(c);i++){
                sb.append(c);
            }
        }
        
        System.out.println(sb.toString());
        
    }
}
