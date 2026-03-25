package NewLearningsJava;

public class MoveVovelsStart {
	public static void main(String[] args) {
        String str ="jav@ek$ig*od%uc";
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for( int i =0;i<str.length();i++){
            char c= str.charAt(i);
            if(Character.isLetter(c)){
                if(c=='a'|c=='e'|c=='i'|c=='o'|c=='u'){
                sb.append(c);
                }
                else{
                    sb2.append(c);
                }
            }
            else{
                sb3.append(c);
            }
            
        }
        System.out.println(sb.toString()+sb2.toString()+sb3.toString());
       }
}
