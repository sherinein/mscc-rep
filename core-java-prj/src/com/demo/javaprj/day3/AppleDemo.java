package com.demo.javaprj.day3;

public class AppleDemo {

	public static void main(String[] args) {
		Apple apple=new Apple(); // default constructor
		apple.setNoOfApples(20);
		System.out.println("No of apples " +apple.getNoOfApples() );
		
		Apple apple1=new Apple(50); // parameterized constructor
		System.out.println("No of apples " +apple1.getNoOfApples() );
	}

}
