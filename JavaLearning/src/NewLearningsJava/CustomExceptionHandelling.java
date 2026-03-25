package NewLearningsJava;

public class CustomExceptionHandelling {

	public static void main(String[] args) {
        BankAccount.credit(5000);
        try{
            BankAccount.debit(30000);
            BankAccount.debit(30000);
        }
        catch(InsuffcientBalanceException e){
            System.out.println("Transaction failed: " + e.getMessage());
        }
        System.out.println(BankAccount.getBalance());
    }

}
class InsuffcientBalanceException extends Exception{
    public InsuffcientBalanceException(String message){
        super(message);
    }
}

class BankAccount{
	static double balance =50000;
	public static void credit(double creditAmount){
		balance+=creditAmount;
	}
    public static void debit(double debitAmount) throws InsuffcientBalanceException{
    if(debitAmount>balance){
        throw new InsuffcientBalanceException("Insufficient Balance in account");
    }
    balance-=debitAmount;
    }
    public static double getBalance(){
    	return balance;
}
}