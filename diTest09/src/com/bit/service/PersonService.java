package com.bit.service;

import com.bit.dao.PersonDao;

public class PersonService {
	private PersonDao dao;
	private int age;
	
	public PersonService(PersonDao dao, int age) {
		super();
		this.dao = dao;
		this.age = age;
	}

	public void service() {
		dao.print();
		System.out.println(age + "살 입니다.");
	}
}
