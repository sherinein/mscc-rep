package com.demo.javaprj;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MathFunction mainFunction=new MathFunction();
		System.out.println("Prime number =press 1");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your choice");
		int input=scanner.nextInt();
		System.out.println("Enter the number");
		int input2=scanner.nextInt();
		//System.out.println();
		switch(input) {
		case 1:
			
			if(mainFunction.isPrime(input2))
				System.out.println("It is prime number");
			
		 break;
		case 2:
			
			boolean result2=mainFunction.isPrime(input2);
		 break;
		default:
			System.out.println("no.........");
		}
		
		
		int output=mainFunction.addMeth(10, 20);
		System.out.println(output);
		int output1=mainFunction.subMeth(30, 10);
		System.out.println(output1);
		mainFunction.display();
	}

}
