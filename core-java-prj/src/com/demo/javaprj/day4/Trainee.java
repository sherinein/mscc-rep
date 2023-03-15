package com.demo.javaprj.day4;

public class Trainee {
	private int tid;
	private String tname;
	
	public void setTid(int tid) {
		this.tid = tid;
	}
	
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "trainee id " + tid +"trainee name " +tname ;
	}
	
}
