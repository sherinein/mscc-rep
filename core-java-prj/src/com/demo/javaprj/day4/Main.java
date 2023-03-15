package com.demo.javaprj.day4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Product product=new Product();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the product id");
		product.setId(Long.parseLong(scanner.nextLine()));
		System.out.println("Enter the product name");
		product.setProductName(scanner.nextLine());
		System.out.println("Enter the year");
		product.setYear(Integer.parseInt(scanner.nextLine()));
		System.out.println("Enter the supplier name");
		product.setSupplierName(scanner.next());
		
		System.out.println("Product Id is "+product.getId());
		System.out.println("Product Name is "+product.getProductName());
		System.out.println("Year is " + product.getYear());
		System.out.println("Supplier Name is "+product.getSupplierName());
		
	}

}
