package NewLearningsJava;

import java.util.ArrayList;
import java.util.List;

public class FetchIntegersAndSTringfromStringList {

	public static void main(String[] args) {
		List<Object> lst= new ArrayList<>();
		lst.add("Aditya");
		lst.add(123);
		lst.add("Kushwaha");
		lst.add(456);
		
		List<String> str= lst.stream().filter(e->e instanceof String).map(e->(String) e).toList();
		List<Integer> num= lst.stream().filter(e->e instanceof Integer).map(e->(Integer) e).toList();
		
		System.out.println(str);
		System.out.println(num);
	}

}
