package stringLearning;

public class ReverseAlternateWords {

	public static void main(String[] args) {
		String str = "selenium cypress playwright webdriverio" ;
		String[] arr= str.split(" ");
		String revsent = "";
		for (int i =0;i<arr.length ;i++){
			if(i%2==0){
				String word = arr[i];
				String revword="";
				for (int j =word.length()-1;j>=0 ;j-- ){
					revword = revword + word.charAt(j);
				} 

				revsent=revsent+revword+" ";   
			}
			else{
				revsent = revsent+arr[i]+" ";
			}
		}

		System.out.print(revsent);

	}

}
