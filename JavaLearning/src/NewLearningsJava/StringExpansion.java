package NewLearningsJava;

public class StringExpansion {

	public static void main(String[] args) {
		String str = "a2d3i5t3";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))){
               int count=Character.getNumericValue(str.charAt(++i));
               for(int j=0;j<count;j++){
                   sb.append(str.charAt(i-1));
               }
            }
        }
            System.out.print(sb.toString());

	}

}
