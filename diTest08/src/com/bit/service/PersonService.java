package com.bit.service;

public class PersonService {
	private int num;
	
	public PersonService(int num) {
		super();
		this.num = num;
	}
	
	public void service() {
		System.out.println("서비스번호: " + num);
	}
}
