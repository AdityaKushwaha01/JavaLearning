package NewLearningsJava;
import java.util.*;
public class SeperateIntFromStringList {
	public static void main(String[] args) {
        List<String> al = new ArrayList<>();
            al.add("1122");
            al.add("apple");
            al.add("5534");
            al.add("grapes");
        List<String> str = new ArrayList<>();
        List<Integer> inte = new ArrayList<>();
        
        for(String st:al){
            if(st.matches("\\d+")){
                inte.add(Integer.parseInt(st));
            }
            else{
                str.add(st);
            }
        }
        System.out.println(str);
        System.out.println(inte);
    }
}
