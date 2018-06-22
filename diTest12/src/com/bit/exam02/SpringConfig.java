package com.bit.exam02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	@Bean
	public ArticleDAO dao() {
		return new ArticleDAO();
	}
	
	@Bean
	public WriteArticleService was() {
		WriteArticleService ob = new WriteArticleService();
		ob.setDao(dao());
		return ob;
	
	}
}
