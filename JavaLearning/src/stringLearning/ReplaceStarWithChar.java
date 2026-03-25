package stringLearning;

public class ReplaceStarWithChar {
	public static void main(String[] args) {
	    String str="tomorrow";
	    StringBuilder sb = new StringBuilder();
	    int count=0;
	    for(int i =0;i<str.length();i++){
	        if(str.charAt(i)=='o'){
	            count++;
	            for(int j=0;j<count;j++){
	                sb.append("*");
	            }
	        }
	        else{
	            sb.append(str.charAt(i));
	        }
	    }
	    System.out.println(sb.toString());
	    }
}
