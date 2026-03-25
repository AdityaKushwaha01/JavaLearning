package com.learn;

public class CustomExceptionBank {
	public static void main(String[] args) {
		BankAccount BA= new BankAccount();
		BA.credit(10000);

		try{
			BA.debit(30000);
		}
		catch(customException ce){
			System.out.println(ce.getMessage());
		}
		try{
			BA.debit(40000);
		}
		catch(customException ce){
			System.out.println(ce.getMessage());
		}

		System.out.println(BA.getBalance());
	}
}

class BankAccount{
	public double balance = 50000;

	public void credit(double amount){
		balance = balance+amount;
	}
	public void debit(double amount) throws customException{
		if(amount>balance){
			throw new customException("Insuffcient balance");
		}
		balance = balance-amount;
	}
	public double getBalance(){
		return balance;
	}
}
class customException extends Exception{
	public  customException(String message){
		super(message);
	}
}