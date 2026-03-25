package stringLearning;

public class CharWithCount {

	public static void main(String[] args) {
	    String name = "aaabbbacfwww";
	    int count=1;
	    StringBuilder sb = new StringBuilder();
	    
	    for (int i=1;i<name.length() ;i++ ){
	        if (name.charAt(i)==name.charAt(i-1)){
	            count++;
	        } 
	        else{
	        sb.append(name.charAt(i-1)).append(count);
	        count =1;
	            
	        }
	    } 
	    sb.append(name.charAt(name.length()-1)).append(count);
	    System.out.println(sb.toString());
	}
		

	}


