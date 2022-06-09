package com.sac.model1;

public class Person1 {
	
	private int pid;
	private String pname;
	private Address address;
	public Person1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person1(int pid, String pname, Address address) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.address = address;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", address=" + address + "]";
	}
	

}
