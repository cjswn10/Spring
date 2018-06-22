package com.bit.exam03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SmsConfig {
	@Bean
	public SmsSender sender() {
		SmsSender s = new SmsSender();
		s.setFrom("연주");
		s.setTo("성인");
		return s;
	}
}
