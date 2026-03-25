package companies.interview.questions;

public class CoforgeRound2 {

	public static void main(String[] args) {
		String str = "Mr Aditya Kumar Kushwaha";
		char[] arr = str.toCharArray();
		char[] res = new char[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==' ') {
				res[i]=' ';
			}
		}
		int j= res.length-1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=' ') {
				while(res[j]==' ') {
					j--;
				}
				res[j]=arr[i];
				j--;
			}
		}
		String str2="";
		for( char c:res) {
			if(Character.isUpperCase(c)){
				str2+=Character.toLowerCase(c);
			}
			else {
				str2+=c;
			}
		}
		String result= "";
		String[] strArray= str2.split(" ");
		for(String st:strArray) {
			result=result+st.substring(0,1).toUpperCase()+st.substring(1)+" ";
		}
		System.out.println(result);
	}

}
