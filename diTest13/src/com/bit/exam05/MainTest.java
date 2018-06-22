package com.bit.exam05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam05/beans05.xml");

		Person p1 = (Person)context.getBean("p");
		p1.eat("�ұ���");
		
		Person p2 = (Person)context.getBean("p");
		p2.eat("�������");
		
		Person p3 = (Person)context.getBean("p");
		p3.eat("��¥");
		
		if(p1 == p2) {
			System.out.println("���ƿ�");
		} else {
			System.out.println("�޶��");
		}
		p3.setAge(40);
		p1.eat("�ұ���");
		//prototype�� getBean�� �� ��ü�� �����ǹǷ� ��� �ٸ� ��ü��.
	}

}
