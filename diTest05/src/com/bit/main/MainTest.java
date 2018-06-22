package com.bit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.dao.MemberDAO;
import com.hanbit.dao.BoardDAO;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fnames = {"com/bit/main/beansMember.xml", "com/bit/main/beansBoard.xml"};
		ApplicationContext context = new ClassPathXmlApplicationContext(fnames);
		
		MemberDAO mDao = (MemberDAO)context.getBean("mDao");
		BoardDAO bDao = (BoardDAO)context.getBean("bDao");
		
		mDao.insert();
		bDao.insert();
	}

}
