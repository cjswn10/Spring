package com.bit.exam05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(SmsConfig.class, SystemConfig.class);
		SystemMonitor sm = (SystemMonitor)context.getBean("sm");
		sm.monitor();
	}

}
