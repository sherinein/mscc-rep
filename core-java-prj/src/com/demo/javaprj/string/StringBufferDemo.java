package com.demo.javaprj.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("welcome");
		sb.setLength(10);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb);
		sb.setCharAt(1, 'b');
		System.out.println(sb);
	}

}
