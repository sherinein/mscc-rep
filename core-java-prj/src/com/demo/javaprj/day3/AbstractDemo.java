package com.demo.javaprj.day3;

public class AbstractDemo {

	public static void main(String[] args) {
	//	Vehicle vechile1=new Vehicle(); // tightly coupling
		Vehicle vechile1=new Car(); //loosly coupling or Dynamic Method dispatch or upcasting
		vechile1.breakingSystem();
		//Vehicle vechile2=new Bus();
		//vechile2.breakingSystem();
	}

}
