package com.demo.javaprj.string;

public class StringHandlingDemo {

	public static void main(String[] args) {
		String city="Chennai";
		String city1="chennai";
		String city2=new String("Chennai");
		
		if(city==city2)
			System.out.println("Both cities are equal");
		else
			System.out.println("Both cities are not equal");
		
		System.out.println(city.hashCode());
		System.out.println(city1.hashCode());
		System.out.println(city2.hashCode());
		Employee emp1=new Employee(12,"Mary","Software Trainee");
		Employee emp2=new Employee(12,"Ram","Software Trainee");
		if(emp1.equals(emp2))
			System.out.println("both employee are equal");
		else
			System.out.println("both employee are not equal");
	
		StringBuffer sb=new StringBuffer("Chennai");
		StringBuilder sb1=new StringBuilder("Chennai");
		//StringBuffer sb2="Chennai";
		
	}

}
