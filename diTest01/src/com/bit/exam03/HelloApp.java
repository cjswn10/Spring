package com.bit.exam03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class HelloApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new FileSystemResource("beans01.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		MessageBean m = (MessageBean)factory.getBean("mb");
		
		m.sayHello("ø¨¡÷");
	}

}
