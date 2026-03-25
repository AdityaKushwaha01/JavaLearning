package companies.interview.questions;

public class Photoninterview {

	public static void main(String[] args) {
		String str="78453645869";
		int[] arr = new int[str.length()];
		int j=0;
		for(char c:str.toCharArray()) {
			int k= Character.getNumericValue(c);
			arr[j]=k;
			j++;
		}		
		int largest=arr[0];
		int secLargest=arr[0];
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>secLargest && arr[i]!=largest) {
				secLargest=arr[i];
			}
		}	
			System.out.println(secLargest);
		
	}

}
                                            