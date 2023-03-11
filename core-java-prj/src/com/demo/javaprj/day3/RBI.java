package com.demo.javaprj.day3;

public interface RBI {
	int withdrawl(int amount);
	String bankStatement();
	default void display() {
		
	}
}
