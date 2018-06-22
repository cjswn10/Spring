package com.bit.exam06;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SmsConfig {
	@Bean
	public SmsSender smsSender() {
		SmsSender s = new SmsSender();
		s.setFrom("����");
		s.setTo("����");
		return s;
	}
}
