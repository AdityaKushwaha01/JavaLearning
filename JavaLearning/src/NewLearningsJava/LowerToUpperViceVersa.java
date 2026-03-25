package NewLearningsJava;

public class LowerToUpperViceVersa {

	public static void main(String[] args) {
        String str ="jAvA";
        StringBuilder sb = new StringBuilder();
        for( int i =0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else if(Character.isUpperCase(str.charAt(i))){
                sb.append(Character.toLowerCase(str.charAt(i)));
            }
            else {
            	sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }

}
