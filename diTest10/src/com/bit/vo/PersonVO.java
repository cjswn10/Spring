package com.bit.vo;

public class PersonVO {
	private String name;
	private int age;
	
	public PersonVO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("������ ������");
	}
	
	public void eat(String food) {
		System.out.println(age + "�� " + name + "��(��) " + food + "��(��) �Ծ��");
	}
}
