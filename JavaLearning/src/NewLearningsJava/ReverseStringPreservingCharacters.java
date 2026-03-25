package NewLearningsJava;

public class ReverseStringPreservingCharacters {
	public static void main(String[] args) {
        String str = "@adit#ya#";
        char[] arr= str.toCharArray();
        char[] res = new char[str.length()];
        
        for(int i=0;i<arr.length;i++){
            if(!Character.isLetter(arr[i])){
                res[i]=arr[i];
            }
        }
        int j=res.length-1;
        for(int i=0;i<arr.length;i++){
            if(Character.isLetter(arr[i])){
                while(res[j]!='\u0000' && j>=0){
                    j--;
                }
                if(j>=0){
                    res[j]=arr[i];
                    j--;
                }
            }
        }
        
        
        for(char c:res){
            System.out.print(c);
        }
    }
}
