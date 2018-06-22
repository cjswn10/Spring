package com.bit.exam06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam06/beans6.xml");
		SystemMonitor sm = (SystemMonitor)context.getBean("sm");
		
		sm.monitor();
	}

}
