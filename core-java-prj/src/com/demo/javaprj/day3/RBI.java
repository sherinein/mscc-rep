package com.demo.javaprj.day3;

public interface RBI {
	static final float PI=3.14f;
	public abstract int withdrawl(int amount);
	String bankStatement();
	default void display() {
		
	}
}
