package com.bit.exam04;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("생성자 동작함");
	}
	
	/*
	 * 생성자가 있을 경우
	 * 디폴트생성자를 꼭 정의해줘야힘
	 */
	public void eat(String food) {
		System.out.println(age + "살 " + name + "이(가) " + food + "를(을) 먹어요");
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
}
