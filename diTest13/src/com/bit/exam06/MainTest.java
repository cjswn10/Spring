package com.bit.exam06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
		Person p1 = (Person)context.getBean("p");
		p1.eat("쌀국수");
		
		Person p2 = (Person)context.getBean("p");
		p2.eat("샤브샤브");
		
		Person p3 = (Person)context.getBean("p");
		p3.eat("분짜");
		
		if(p1 == p2) {
			System.out.println("같아요");
		} else {
			System.out.println("달라요");
		}
		p3.setAge(40);
		p1.eat("쌀국수");
		//prototype은 getBean할 때 객체가 생성되므로 모두 다른 객체임.
	}

}
