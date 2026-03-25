package NewLearningsJava;

public class StringPermumtations {

	public static void main(String[] args) {
		
		StringPerm("ABC","");
	}
public static void StringPerm(String str,String ans){
        
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        
        for(int i =0;i<str.length();i++){
            char c= str.charAt(i);
            String left= str.substring(0,i);
            String right = str.substring(i+1);
            
            String rem = left+right;
            StringPerm(rem,ans+c);
        }
}
}
