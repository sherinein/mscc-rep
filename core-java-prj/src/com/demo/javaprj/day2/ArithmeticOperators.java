package com.demo.javaprj.day2;

import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		/*
		 * int a=4; int b=5;
		 * 
		 * float c=b/2; int d=b%2; System.out.println(c +" " +d); // 2 4 6 - even // 1 3
		 * 5 -odd Operation operation=new Operation(); Scanner scanner=new
		 * Scanner(System.in); System.out.println("Enter the number"); int
		 * n=scanner.nextInt(); boolean output=operation.isEven(n);
		 * System.out.println(output);
		 */
		
		//int a=10;
		//int c=a+1;
		//int a=10;
		//a=a+1;
		//a+=1;
		//System.out.println(a);
		
		int a=2;
		//++a;
		//a++;
		System.out.println(a++);
		System.out.println(a);
		int  b=1;
		int c=a++ + ++b;
		System.out.println(c);
		
		a=3;
		b=4;
		int d=--a + b--;
		System.out.println(d);
	if(2<1) 
		System.out.println("true");
	else if(3<2)
		System.out.println("true");
	else
		System.out.println("true");
		
	
		
		System.out.print("false");
	
		
	}

}
