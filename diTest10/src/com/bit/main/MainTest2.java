package com.bit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.vo.PersonVO;

public class MainTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/main/beans.xml");
		//이 때 생성자 동작함
		PersonVO p1 = (PersonVO)context.getBean("personVO");
		PersonVO p2 = (PersonVO)context.getBean("personVO");
		
		if(p1 == p2) {
			System.out.println("같아요");
		} else {
			System.out.println("달라요");
		}
		
	}

}
