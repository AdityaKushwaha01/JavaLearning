package NewLearningsJava;

public class SecondBiggestNumInString {
	public static void main(String[] args) {
        String str ="str1025rts";
        String numeric="";
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isDigit(c)){
                numeric+=c;
            }
        }
        char largest=numeric.charAt(0);
        char seclargest=numeric.charAt(0);
        for (int i=0;i<numeric.length();i++){
            if(numeric.charAt(i)>largest){
                seclargest=largest;
                largest=numeric.charAt(i);
            }
            else if(numeric.charAt(i)>seclargest && numeric.charAt(i)!=largest) {
            	seclargest=numeric.charAt(i);
            }
            }
        System.out.println(seclargest+" "+largest);
         
    }
	}
