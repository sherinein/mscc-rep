package com.demo.javaprj;

public class ParentChildDemo {

	public static void main(String[] args) {
		
		Parent parent=new Parent();
		parent.setA(30);
		
		Child child=new Child();
		child.setA(10);
		child.setB(20);
		
		
		Parent parent1=new Child(); // abstration or interface
									// Dynamic Method dispatch
		parent1.setA(40);

	}

}
