package com.bit.exam07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam07/beans7.xml");
		WriteArticleService was = (WriteArticleService)context.getBean("was");
		was.service();
	}

}
