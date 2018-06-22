package com.bit.vo;

public class Person {
	String name;
	int age;
	
	public Person() {
		System.out.println("생성자호출됨 person()");
	}
	
	public Person(String name) {
		
	}
	
	public void study() {
		System.out.println("공부중");
	}
}
