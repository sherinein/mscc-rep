package com.demo.javaprj.collection;

public class Car {
	private String color;
	private int year;
	
	public Car(String color, int year) {
		super();
		this.color = color;
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", year=" + year + "]";
	}
	
}
