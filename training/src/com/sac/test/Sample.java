package com.sac.test;

public class Sample {
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
	Sample s=	new Sample();
	s.setAge(23);
		System.out.println(" Age is "+s.getAge());
	}}
