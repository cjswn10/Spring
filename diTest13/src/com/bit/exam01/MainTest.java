package com.bit.exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
		//PersonConfig에 BoardConfig와 MemberConfig를 import해놨기 때문에 PersonConfig만 가져오면 됨
		Person p = (Person)context.getBean("p");
		p.eat("돈까스");
		
		MemberDao m = (MemberDao)context.getBean("member");
		m.insert();
		
		BoardDAO b = (BoardDAO)context.getBean("board");
		b.insert();
		
	}

}
