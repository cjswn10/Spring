package com.bit.exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
		//PersonConfig�� BoardConfig�� MemberConfig�� import�س��� ������ PersonConfig�� �������� ��
		Person p = (Person)context.getBean("p");
		p.eat("���");
		
		MemberDao m = (MemberDao)context.getBean("member");
		m.insert();
		
		BoardDAO b = (BoardDAO)context.getBean("board");
		b.insert();
		
	}

}
