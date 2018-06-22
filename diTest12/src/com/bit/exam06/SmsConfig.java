package com.bit.exam06;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SmsConfig {
	@Bean
	public SmsSender smsSender() {
		SmsSender s = new SmsSender();
		s.setFrom("연주");
		s.setTo("가영");
		return s;
	}
}
