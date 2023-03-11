package com.demo.javaprj.day3;

public class Student{
	//static -access modifier
	// private,protected,default,public - access specifier
	 String sname;
	static String collegeName;
	final float PI=3.14f;
	// final ->before variable,before class,before method
	 // eg  String -- final class 
	
	static void display() {
		System.out.println("welcome");
	}
	public static void main(String[] args) {
		collegeName="";
		display();
	}
}
