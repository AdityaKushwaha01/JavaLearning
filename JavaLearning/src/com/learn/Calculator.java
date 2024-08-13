package com.learn;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		String Yn;
		do {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first no :");
		int no1 = sc.nextInt();
		System.out.println("Enter secon no :");
		int no2 = sc.nextInt();
		System.out.println("Selct Symbol(+,-,*,/)");
		String sym = sc.next();
		int res;
		switch(sym){
			case "+" : res = no1+no2;
			System.out.println("Sum of numbers is " + res);
			break;
			case "-" : res = no1-no2;
			System.out.println("subtraction of numbers is " + res);
			break;
			case "*" : res = no1*no2;
			System.out.println("multiplication of numbers is " + res);
			break;
			case "/" : res = no1/no2;
			System.out.println("div of numbers is " + res);
			break;
			default : System.out.println("Invalid Symbol");
			break;
		}
		
		System.out.println("Do you want to continue: enter y for yes and n for No");
		Yn= sc.next();
		}while(Yn.equals("y") || Yn.equals("Y"));
		
		}
	}


