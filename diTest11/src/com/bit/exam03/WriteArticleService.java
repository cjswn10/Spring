package com.bit.exam03;

public class WriteArticleService {
	private ArticleDAO dao;
	
	public void setDao(ArticleDAO dao) {
		this.dao = dao;
	}
	
	public void service() {
		System.out.println("¼­ºñ½º");
		dao.insert();
	}
	
}
