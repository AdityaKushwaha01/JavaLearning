package stringLearning;

public class ReplaceAllSpaceBySingleSpace {

	public static void main(String[] args) {
        String str = "My   name     is  Ram   ";
        
        String res = str.trim().replaceAll("\\s+"," ");
        System.out.println(res);
    }

}
