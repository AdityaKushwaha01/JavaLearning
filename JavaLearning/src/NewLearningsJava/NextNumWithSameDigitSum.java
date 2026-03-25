package NewLearningsJava;

public class NextNumWithSameDigitSum {
	public static void main(String[] args) {
        int num =28;
        int result =nextNum(num);
        System.out.println(result);
    }
    public static int digitSum(int num){
        int sum=0;
        while(num>0){
            sum+= num%10;
            num=num/10;
        }
        return sum;
    }
    public static int nextNum(int n){
        int target = digitSum(n);
        int nextNum=n+1;
        
        while(true){
            if(digitSum(nextNum)==target){
                return nextNum;
            }
            nextNum++;
        }
    }

}
