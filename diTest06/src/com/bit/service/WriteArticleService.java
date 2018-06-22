package com.bit.service;

import com.bit.dao.ArticleDAO;

public class WriteArticleService {
	private ArticleDAO dao;
	
	public WriteArticleService(ArticleDAO dao) {
		super();
		this.dao = dao;
	}
	
	public void service() {
		dao.insert();
	}
}
