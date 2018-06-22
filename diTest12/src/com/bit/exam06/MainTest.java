package com.bit.exam06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.exam06.SystemMonitor;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam06/Beans6.xml");
		SystemMonitor sm = (SystemMonitor)context.getBean("sm");
		sm.monitor();
	}

}
