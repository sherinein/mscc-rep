package com.demo.javaprj.string;

public class Employee {
	private int id;
	private String ename;
	private String desg;
	
	
	public Employee(int id, String ename, String desg) {
		super();
		this.id = id;
		this.ename = ename;
		this.desg = desg;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((desg == null) ? 0 : desg.hashCode());//33
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());//31*33 +2
		result = prime * result + id; //31*31*33 +2+12 =2000
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (desg == null) {
			if (other.desg != null)
				return false;
		} else if (!desg.equals(other.desg))
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
}
