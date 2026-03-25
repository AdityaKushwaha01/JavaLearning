package NewLearningsJava;

public class StrongNumber {

	public static void main(String[] args) {
        int num =145;
        int digit;
        int sum=0;
        int fact=1;
        int temp =num;
        while(num>0){
            digit=num%10;
            for(int i=2;i<=digit;i++){
                fact = fact*i;
            }
            sum+=fact;
            fact=1;
            num=num/10;
        }
        if(temp==sum){
            System.out.println("True");
        }
    }

}
