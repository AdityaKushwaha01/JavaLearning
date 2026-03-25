package stringLearning;

public class SecondBiggestIntInString {

	public static void main(String[] args) {
		String str ="str1025rts";
        String num="";
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(Character.isDigit(c)){
                num+=c;
            }
        }
        if(!num.isEmpty()){
        char largest=num.charAt(0);
        char seclargest=num.charAt(0);
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)>largest){
                seclargest=largest;
                largest=num.charAt(i);
            }
            else if(num.charAt(i)>seclargest && num.charAt(i)!=largest ){
                seclargest=num.charAt(i);
            }
        }
        System.out.println(seclargest);
        }
        else{
            System.out.println(-1);
        }

	}

}
