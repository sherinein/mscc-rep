package com.demo.javaprj;

public class TraineeDemo {

	public static void main(String[] args) {
		
		Trainee trainee=new Trainee();
		trainee.setTname("Antony");
		trainee.setAge(30);
		trainee.setEmail("tony@gmail.com");
		trainee.setMobileNumber(98798934);
		
		Trainee trainee1=new Trainee();
		trainee1.setTname("Banu");
		trainee1.setAge(20);
		trainee1.setEmail("banu@gmail.com");
		trainee1.setMobileNumber(987945934);
		System.out.println(trainee.getTname());
	}

}
