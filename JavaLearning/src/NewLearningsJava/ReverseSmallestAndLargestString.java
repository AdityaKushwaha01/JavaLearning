package NewLearningsJava;

public class ReverseSmallestAndLargestString {

	public static void main(String[] args) {
		String str= "Java is Beautiful programming";
		String[] starr=str.split(" ");
		StringBuilder sb = new StringBuilder();

		String smallest =starr[0], largest = starr[0];

		for(String st:starr){
			if(st.length()<smallest.length()){
				smallest = st;
			}
			if(st.length()>largest.length()){
				largest=st;
			}
		}

		String revsmallest= new StringBuilder(smallest).reverse().toString();
		String revlargest= new StringBuilder(largest).reverse().toString();

		for(String str1:starr){
			if(str1.equals(smallest)){
				sb.append(revsmallest).append(" ");
			}
			else if(str1.equals(largest)){
				sb.append(revlargest).append(" ");
			}
			else{
				sb.append(str1).append(" ");
			}
		}
		System.out.println(sb.toString());	}
}
