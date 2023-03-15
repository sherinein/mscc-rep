package com.demo.javaprj.collection;

import java.util.ArrayList;
import java.util.List;

import com.demo.javaprj.day4.Product;

public class CarListDemo {

	public static void main(String[] args) {
		List<Car> list=new ArrayList<Car>();  // list -container object
		Car car1=new Car("Black",2023);
		Car car2=new Car("Red",2022);
		Product product=new Product(1,"Printer","HP",2022);
		list.add(car1);
		list.add(car2);
		//list.add(product);
		System.out.println(list);

	}

}
