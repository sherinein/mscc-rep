package com.demo.javaprj.day3;

public class Child extends Parent{
	private int b;
	
	public Child(int a,int b) {
		super(a);
		this.b=b;
	}
	@Override
	void display() {
		System.out.println("This is child class" + b +" "+ super.getA());
	}
}
