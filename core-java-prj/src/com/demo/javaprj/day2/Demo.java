package com.demo.javaprj.day2;

public class Demo {

	public static void main(String[] args) {
		//byte a=1;
		//byte b=1;
		//Type mismatch: cannot convert from int to byte
		//int c=a+b;
		int a=128;
		
		byte b=(byte)a;
		System.out.println(b);
		
		float f=8.2f;
		long l=5;
		int i=3;
		//Type mismatch: cannot convert from float to long
		//long l1=(long)f+l+i;
		float f1=f+l+i;
		System.out.println(f1);
		
		
	}

}
