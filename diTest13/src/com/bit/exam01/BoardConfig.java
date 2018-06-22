package com.bit.exam01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

	@Bean
	public BoardDAO board() {
		return new BoardDAO();
	}
}
