package com.bit.exam02;


public class WriteArticleService {
	private ArticleDAO dao;
	
	public void setDao(ArticleDAO dao) {
		this.dao = dao;
	}
	
	public void service() {
		System.out.println("����");
		dao.insert();
	}
	
}
