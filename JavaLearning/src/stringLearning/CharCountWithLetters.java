package stringLearning;

public class CharCountWithLetters {

	public static void main(String[] args) {
	
		String name= "adityakumar";
		int[] arr = new int[256];
		
		for (int i = 0; i < name.length(); i++) {
			//for first char ASCII Value is 97
			arr[name.charAt(i)]=arr[name.charAt(i)]+1;
			//arr[97]=arr[97]+1;
			//arr[97]=0+1;
			//arr[97]=1 ==> if it gets any other same character count will increase
			}
		
		for (int i = 0; i <256; i++) {
			if(arr[i]!=0) {
				System.out.println((char)i+ " " +arr[i]);
								//type casting int i is converting to charAt(i)
			}
		}
	}
	
	}
 