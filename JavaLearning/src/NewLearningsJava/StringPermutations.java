package NewLearningsJava;

public class StringPermutations {

	public static void main(String[] args) {
        String str ="abc";
        permutaionString("",str);
    }
    
    public static void permutaionString(String prefix,String remaining){
        if(remaining.length()==0){
            System.out.println(prefix);
            return;
        }
       for(int i=0;i<remaining.length();i++){
           char c= remaining.charAt(i);
           String perm= remaining.substring(0,i)+remaining.substring(i+1);
           permutaionString(prefix+c,perm);
       }
        
    }

}
