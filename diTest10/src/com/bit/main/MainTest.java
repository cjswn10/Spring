package com.bit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.vo.PersonVO;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/main/beans.xml");
		//�� �� ������ ������
		System.out.println("2");
		PersonVO p = (PersonVO)context.getBean("personVO");
		System.out.println("3");

		p.eat("��ⱹ��");
		System.out.println("4");
		p.eat("��â");
	}

}
