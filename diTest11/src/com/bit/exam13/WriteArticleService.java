package com.bit.exam13;

public class WriteArticleService {
	private ArticleDAO dao;
	
	
	public WriteArticleService(ArticleDAO dao) {
		super();
		this.dao = dao;
	}


	public void service() {
		System.out.println("¼­ºñ½º");
		dao.insert();
	}
	
}
