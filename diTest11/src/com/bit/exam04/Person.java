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
		System.out.println("������ ������");
	}
	
	/*
	 * �����ڰ� ���� ���
	 * ����Ʈ�����ڸ� �� �����������
	 */
	public void eat(String food) {
		System.out.println(age + "�� " + name + "��(��) " + food + "��(��) �Ծ��");
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
}
