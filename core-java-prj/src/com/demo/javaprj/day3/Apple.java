package com.demo.javaprj.day3;

public class Apple {
	private int noOfApples;
	
	
	public Apple() { // default constructor
		System.out.println("default constructor called");
	}
	 
	
	public Apple(int noOfApples) { // parameterized constructor
		this.noOfApples=noOfApples;
		System.out.println("parameterized constructor called");
	}
	
	public int getNoOfApples() {
		return noOfApples;
	}

	public void setNoOfApples(int noOfApples) {
		this.noOfApples = noOfApples;
	}
	
	
}
